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
			// ��Ҫע�����Ҫ������Class.forName������������
			// ʹ�÷���������ʵ��(Class��ʵ��)���������Ǳ�д��ɢ��ϵĴ��룬
			// �������ʹ��new��������޷�ʵ����Щ����,����������£������������Ӧ�Ĵ�����ģ������޷��л�����ͬ�����ݿ⡣
			
			// ��Ҫ�����ǽ�����ص��ڴ��У��Ա�������������Խ�����ע�ᵽDriverManager��
			// ��������鿴Driver���ʵ�֣����ᷢ�����Ǿ��о�̬��(static���ڼ��ص��ڴ��ʱ��ͻ�ִ��)��
			// ���ǽ��Լ�ע�ᵽDriverManager��
			
			
			//create the connection now
			con = DriverManager.getConnection(props.getProperty("DB_URL"),
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
			//DriverManager.getConnection() method uses the registered 
			//JDBC drivers to create the database connection. This method 
			//throws java.sql.SQLException if there is any problem in getting the database connection.
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}

// �˴����ʹ��Java JDBC API�࣬�����޷�֪�����Ƿ����ӵ��������͵����ݿ�

//oracle.jdbc.driver.OracleDriver.java snippet:
//static
//  {
//    try
//    {
//      if (defaultDriver == null)
//      {
//        defaultDriver = new oracle.jdbc.OracleDriver();
//        DriverManager.registerDriver(defaultDriver);
//      }
//	//some code omitted for clarity
//	}
//}


//com.mysql.jdbc.Driver.java snippet:
//
//static
//  {
//    try
//    {
//      DriverManager.registerDriver(new Driver());
//    } catch (SQLException E) {
//      throw new RuntimeException("Can't register driver!");
//    }
//  }

// This is a great example where we are making our code 
// loosely-coupled with the use of reflection API. So basically 
// we are doing following things using Class.forName() method call.


//Driver driver = new OracleDriver();
//DriverManager.registerDriver(driver);