package cn.edu.bit.cs.tags;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataFormatterTag  extends SimpleTagSupport {
    private String header;
    private String items;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void doTag() throws IOException, JspException {
        JspContext jspContext = getJspContext();
        JspWriter out = jspContext.getOut();
        out.print("<table style='border:1px solid green'>\n"
                + "<tr><td><span style='font-weight:bold'>"
                + header + "</span></td></tr>\n");
        StringTokenizer tokenizer = new StringTokenizer(items,",");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            out.print("<tr><td>" + token + "</td></tr>\n");
        }
        out.print("</table>");
    }
}
