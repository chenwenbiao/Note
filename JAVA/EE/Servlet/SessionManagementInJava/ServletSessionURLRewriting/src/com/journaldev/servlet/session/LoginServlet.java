package com.journaldev.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private final String userID = "admin";
	private final String password = "password";

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// get request parameters for userID and password
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		if(userID.equals(user) && password.equals(pwd)){
			HttpSession session = request.getSession();
			session.setAttribute("user", "xzj");
			//setting session to expiry in 30 mins
			session.setMaxInactiveInterval(30*60);
			
			Cookie userName = new Cookie("user", user);
			response.addCookie(userName);
			
			// ���ǿ���ʹ��HttpServletResponse encodeURL����������URL���б��룬
			// ������Ǳ��뽫�����ض�����һ����Դ����������Ҫ�ṩ�Ự��Ϣ��
			// ���ǿ���ʹ��encodeRedirectURL����������
			String encodedURL = response.encodeRedirectURL("LoginSuccess.jsp");
			log("----------- encodedURL: " + encodedURL); // LoginSuccess.jsp;jsessionid=DDBB069A5B0CB7FE66F50B28637D8AFC
			// 1. encodeRedirectURL: ��ָ����URL���б�������sendRedirect������ʹ�ã�
			// 2.   ���ߣ��������Ҫ���룬�򷵻�URL���䡣
			// 3.   �÷�����ʵ�ְ���`ȷ��`�Ƿ���Ҫ��URL�б���ỰID���߼�
			// 4.   ���ڽ��д�`ȷ��`�Ĺ������������`����`�Ƿ������ͨ���ӵĹ���ͬ����˴˷�����encodeURL�����ֿ���
			// 5. �������url��Ӧ��ͨ��HttpServletResponse.sendRedirect��������.
			// ����URL��д�������ڲ�֧��cookie���������
			
			response.sendRedirect(encodedURL);
			// ʹ��ָ�����ض���λ��URL��ͻ��˷�����ʱ�ض�����Ӧ������������� 
			// ���������滻Ϊ�˷������õ����ݡ� ���ô˷�����״̬��������ΪSC_FOUND 302��Found����
			// �˷������Խ������URL;�ڽ���Ӧ���͵��ͻ���֮ǰ��servlet�������뽫���URLת��Ϊ����URL��
			// ���λ������ԵĶ�û��ǰ��'/'���������������Ϊ����ڵ�ǰ����URI�� �����λ����ǰ��'/'��ԣ�
			// �������������Ϊ�����servlet��������

			// �����Ӧ���ύ����˷������׳�IllegalStateException�� ʹ�ô˷�����Ӧ��Ϊ��Ӧ���ύ����Ӧд�롣
			
		}else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font>");
			rd.include(request, response);
		}

	}

}
