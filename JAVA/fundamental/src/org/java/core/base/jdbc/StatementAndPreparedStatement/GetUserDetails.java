package org.java.core.base.jdbc.StatementAndPreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetUserDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// read user entered data
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter email id:");
		String id = scanner.nextLine();
		System.out.println("User id=" + id);
		System.out.println("Please enter password to get details:");
		String pwd = scanner.nextLine();
		System.out.println("User password=" + pwd);
		printUserData(id, pwd);
	}

	private static void printUserData(String id, String pwd) throws ClassNotFoundException, SQLException {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String query = "select name, country, password from Users where email = '" + id + "' and password='" + pwd
					+ "'";
			System.out.println(query);
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("Name=" + rs.getString("name") + ",country=" + rs.getString("country") + ",password="
						+ rs.getString("password"));
			}
		} finally {
			if (rs != null)
				rs.close();
			stmt.close();
			con.close();
		}

	}

}

// Now let��s see how a hacker can get unauthorized access 
// to a user because we are using Statement for executing queries.


//Please enter email id:
//david@gmail.com' or '1'='1
//User id=david@gmail.com' or '1'='1
//Please enter password to get details:
//
//User password=
//DB Connection created successfully
//select name, country, password from Users where email = 'david@gmail.com' or '1'='1' and password=''
//Name=David,country=USA,password=david123

// ���Կ�������ʹû�����룬����Ҳ�ܹ���ȡ�û���ϸ��Ϣ�� ����Ҫע��Ĺؼ����ǲ�ѯ��ͨ���ַ������Ӵ�����

// ����SQLע���һ��ʾ�����������ı�̸���ʹ���ǵ�Ӧ�ó��������ܵ�δ����Ȩ�����ݿ���ʡ�

//�����ΪʲôJDBC API�����PreparedStatement�ӿڣ�����չ��Statement����ִ�в�ѯ֮ǰ�Զ�ת�������ַ���
