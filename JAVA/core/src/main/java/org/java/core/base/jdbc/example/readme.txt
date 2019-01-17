Java DataBase Connectivity��JDBC��API ��JavaӦ�ú͹�ϵ�����ݿ������ֱ�� 
�ṩ��ҵ��׼�Ͷ��������ݿ�����ӣ��Ա����ϵ���ݿ�һ��ʹ�á� 

JDBC�ṩ�˴�"Java����"���ӵ�"��ϵ�����ݿ�"�Ŀ��.

JDBC API helps us in writing loosely-coupled code for database connectivity.JDBC������д����ϵĴ���.

JDBC����ʵ����������:

1. ��������Oracle��MySQL�����Ĺ�ϵ�����ݿ�����������ӣ�JDBC APIû���ṩ
��ܵ�NoSQL���ݿ�(��MongoDB)������
2. ����SQL��ѯ����Ҫ�����ݿ�������ϱ�ִ�е�����
3. ������ִ�в�ѯ���صĽ��

JDBC API consists of two parts:

1. first part is the JDBC API to be used by the application programmers. 

2. Second part is the low-level API to connect to database server.

3. First part of JDBC API is part of standard java packages in java.sql package.
��һ���ֵ�JDBC API�Ǳ�׼��java��java.sql�е�һ����.

For second part there are four different types of JDBC drivers:
���ڵڶ����֣�������4�����͵�JDBC����:

						  Java Application
						        ^
						        |
							JDBC API
						 		^
						 		|
						  JDBC Driver Manager
			^                   ^							^							^
			|					|							|							|
JDBC ODBC Bridge Driver		Partial Java JDBC Driver	Pure Java JDBC Driver	 Pure Java JDBC Driver
			^
			|
		ODBC API
			^					^							^
			|					|							|		
	    DB Client Lib		DB Client Lib				DB Middleware Server
	    	^					^							^							^
	    	|					|							|							|
	    							Database Server
	    							
	    								
1. JDBC-ODBC Bridge plus ODBC Driver (Type 1): ��ʱ��.
2. Native API partly Java technology-enabled driver (Type 2): this is also not preferred driver.(��Ҳ������ѡ����������)	
3. Pure Java Driver for Database Middleware (Type 3): This adds to extra 
network calls and slow performance. Hence this is also not widely used JDBC driver.
������Ӷ����������в��������ܡ������Ҳû�й㷺ʹ�õ�JDBC��������				   
4. Direct-to-Database Pure Java Driver (Type 4):������ѡ��������
��Ϊ����JDBC����ת��Ϊ���ݿ������������������Э�顣�˽����������Ҫ�ͻ��˵��κζ���API�������ʺ�ͨ������������ݿ����ӡ�
���Ƕ��ڴ˽������������Ӧ��ʹ���ض������ݿ��������������Oracle for Oracle DB�ṩ��OJDBC 
jar��MySQL Connector for J for MySQL���ݿ⡣   

ʹ��JDBC APIʱ�����ݿ�����������Ҫ��ϸ�ڡ� ����Ӧ��֪���ĵ�һ������Ҫʹ�õ�Driver�ࡣ
 ����Oracle���ݿ⣬������������oracle.jdbc.driver.OracleDriver�� ����MySQL���ݿ⣬
 ������������com.mysql.jdbc.Driver�� �����ڸ��Ե���������jar�ļ����ҵ���Щ���������ࡣ
  ��������ʵ����JDBC java.sql.Driver�ӿڡ�
  
MySQL���ݿ������ַ�����ʽΪjdbc:mysql://<HOST>:<PORT>/<SCHEMA>.

Oracle���ݿ������ַ�����ʽΪjdbc��jdbc:oracle:thin:@<HOST>:<PORT>:<SID>.

