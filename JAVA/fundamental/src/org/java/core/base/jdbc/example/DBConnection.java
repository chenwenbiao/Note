package org.java.core.base.jdbc.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection con = null;
		Properties props = new Properties();
		FileInputStream fis = null;
		try {
			// db.propertiesָ������Ŀ��Ŀ¼�µ�db.properties,
			// Ҳ���Ǻ�srcͬ��Ŀ¼�µ�db.properties��
			// �����Ǻ͵�ǰJava�ļ�ͬ��Ŀ¼�µ�db.properties
			fis = new FileInputStream("db.properties");
			props.load(fis);

			//load the Driver Class
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));
			
			//create the connection now
			con = DriverManager.getConnection(props.getProperty("DB_URL"),
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
