package com.jinxuliang.servlet;

import com.jinxuliang.model.Product;
import com.jinxuliang.model.ShoppingItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "ShoppingCartServlet", urlPatterns = {
        "/products", "/viewProductDetails",
        "/addToCart", "/viewCart"})
public class ShoppingCartServlet extends HttpServlet {

    private static final String CART_ATTRIBUTE = "cart";
    private List<Product> products = new ArrayList<Product>();
    private NumberFormat currencyFormat = NumberFormat
            .getCurrencyInstance(Locale.US);

    @Override
    public void init() throws ServletException {
        products.add(new Product(1, "Bravo 32' HDTV",
                "Low-cost HDTV from renowned TV manufacturer",
                159.95F));
        products.add(new Product(2, "Bravo BluRay Player",
                "High quality stylish BluRay player", 99.95F));
        products.add(new Product(3, "Bravo Stereo System",
                "5 speaker hifi system with iPod player",
                129.95F));
        products.add(new Product(4, "Bravo iPod player",
                "An iPod plug-in that can play multiple formats",
                39.95F));
    }

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.endsWith("/products")) {
            sendProductList(response);
        } else if (uri.endsWith("/viewProductDetails")) {
            sendProductDetails(request, response);
        } else if (uri.endsWith("viewCart")) {
            showCart(request, response);
        }
    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        // add to cart
        int productId = 0;
        int quantity = 0;
        try {
            productId = Integer.parseInt(request.getParameter("id"));
            quantity = Integer.parseInt(request.getParameter("quantity"));
        } catch (NumberFormatException e) {
        }
        Product product = getProduct(productId);
        if (product != null && quantity >= 0) {
            ShoppingItem shoppingItem = new ShoppingItem(product, quantity);
            // 可以通过HttpSession的setAttribute方法将值放入HttpSession，
            // 放到HttpSession的值不限于String类型，
            // 可以是任意实现java.io.Serializable的java对象(为了序列化可以保存)
            HttpSession session = request.getSession();
            System.out.println("session id: " + session.getId());
            List<ShoppingItem> cart = (List<ShoppingItem>) session.getAttribute(CART_ATTRIBUTE);
            if (cart == null) {
                cart = new ArrayList<ShoppingItem>();
                session.setAttribute(CART_ATTRIBUTE, cart);
                // 放入到HttpSession的值，是存储在内存中的，因此，不要往HttpSession放入太多
                // 对象或大对象。尽管现代的Servlet容器在内存不够用的时候会将保存在HttpSessions
                // 的对象转储到二级存储上，但这样有性能问题，因此小心存储。另外，
                // 使用Session会给Web应用的水平伸缩带来麻烦.
            }
            cart.add(shoppingItem);
        }
        sendProductList(response);
    }

    private void sendProductList(HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><title>Products</title>" +
                "</head><body><h2>Products</h2>");
        writer.println("<ul>");
        for (Product product : products) {
            writer.println("<li>" + product.getName() + "("
                    + currencyFormat.format(product.getPrice())
                    + ") (" + "<a href='viewProductDetails?id="
                    + product.getId() + "'>Details</a>)");
        }
        writer.println("</ul>");
        writer.println("<a href='viewCart'>View Cart</a>");
        writer.println("</body></html>");
    }

    private Product getProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    private void sendProductDetails(HttpServletRequest request,
                                    HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        int productId = 0;
        try {
            productId = Integer.parseInt(request.getParameter("id"));
        } catch (NumberFormatException e) {
        }
        Product product = getProduct(productId);
        if (product != null) {
            writer.println("<html><head>"
                    + "<title>Product Details</title></head>"
                    + "<body><h2>Product Details</h2>"
                    + "<form method='post' action='addToCart'>"
            );
            writer.println("<input type='hidden' name='id' "
                    + "value='" + productId + "'/>");
            writer.println("<table>");
            writer.println("<tr><td>Name:</td><td>"
                    + product.getName() + "</td></tr>");
            writer.println("<tr><td>Description:</td><td>"
                    + product.getDescription() + "</td></tr>");
            writer.println("<tr>" + "<tr>"
                    + "<td><input name='quantity'/></td>"
                    + "<td><input type='submit' value='Buy'/>"
                    + "</td>"
                    + "</tr>");
            writer.println("<tr><td colspan='2'>"
                    + "<a href='products'>Product List</a>"
                    + "</td></tr>");
            writer.println("</table>");
            writer.println("</form></body>");
        } else {
            writer.println("No product found");
        }
    }

    private void showCart(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><title>Shopping Cart</title>"
                + "</head>");
        writer.println("<body><a href='products'>" +
                "Product List</a>");
        HttpSession session = request.getSession();
        List<ShoppingItem> cart = (List<ShoppingItem>) session.getAttribute(CART_ATTRIBUTE);
        if (cart != null) {
            writer.println("<table>");
            writer.println("<tr><td style='width:150px'>Quantity" + "</td>"
                    + "<td style='width:150px'>Product</td>"
                    + "<td style='width:150px'>Price</td>"
                    + "<td>Amount</td></tr>");
            double total = 0.0;
            for (ShoppingItem shoppingItem : cart) {
                Product product = shoppingItem.getProduct();
                int quantity = shoppingItem.getQuantity();
                if (quantity != 0) {
                    float price = product.getPrice();
                    writer.println("<tr>");
                    writer.println("<td>" + quantity + "</td>");
                    writer.println("<td>" + product.getName() + "</td>");
                    writer.println("<td>" + currencyFormat.format(price) + "</td>");
                    double subtotal = price * quantity;
                    writer.println("<td>" + currencyFormat.format(subtotal) + "</td>");
                    total += subtotal;
                    writer.println("</tr>");
                }
            }
            writer.println("<tr><td colspan='4' "
                    + "style='text-align:right'>"
                    + "Total:"
                    + currencyFormat.format(total)
                    + "</td></tr>");
            writer.println("</table>");
            writer.println("</table></body></html>");
        }
    }
}