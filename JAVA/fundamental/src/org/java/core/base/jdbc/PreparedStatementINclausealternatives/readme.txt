JDBC API provides two ways to communicate with database �C 
Statement and PreparedStatement. Statement is easy to use 
but it can lead to SQL injection, that is very common way of 
hacking any application. This article clearly shows how SQL 
injection can be performed with SQL Statements and why we 
should use PreparedStatement to avoid SQL injection attacks.

This article goes further in explaining some of the major 
benefits we get from using PreparedStatement over Statement 
such as caching, object oriented programming and elegant looking code.

����JDBC APIֻ����һ������������ʹ��һ������,���PreparedStatement��������IN�Ӿ�(clause)��ѯ(queries)��

��ˣ����������Ҫʹ��IN�Ӿ�ִ�����ݿ��ѯ��������ҪѰ��һЩ��������� ���ĵ�Ŀ���Ƿ�����ͬ�ķ�����������ѡ���ʺ���Ҫ��ķ�����

Execute Single Queries
Using Stored Procedure
Creating PreparedStatement Query dynamically
Using NULL in PreparedStatement Query


Using Stored Procedure

We can write a stored procedure and send the input data to the stored procedure.
 Then we can execute queries one by one in the stored procedure and 
 get the results. This approach gives fastest performance but as we 
 all know that Stored Procedures are database specific. So if our 
 application deals with multiple types of databases such as Oracle,
  MySQL then it will become hard to maintain. We should use this 
  approach only when we are working on single type of database and 
  there is no plan to change the database server. Since writing 
  stored procedure is out of scope of this tutorial, I will not 
  demonstrate how to use it.
  
ʹ�ô洢����
���ǿ��Ա�д�洢���̲����������ݷ��͵��洢���̡�
 Ȼ�����ǿ����ڴ洢���������ִ�в�ѯ����ý���� ���ַ����ṩ���������ܣ�
 �����Ƕ�֪���洢�������ض������ݿ�ġ� ��ˣ�������ǵ�Ӧ�ó�����������͵����ݿ�
 ����Oracle��MySQL������ô�����������ά���� ����Ӧ��ֻ�����Ǵ���һ���͵����ݿ�ʱ��ʹ�����ַ�����
 ����û�мƻ��������ݿ�������� ���ڱ�д�洢���̳����˱��̵̳ķ�Χ������Ҳ�����ʾ���ʹ������
 
 
 Notice that the query is created dynamically and it will run perfectly. 
 There will be only one database call and the performance will be good.
  However if the size of user input varies a lot, we won��t get the 
  PreparedStatement benefit of caching and reusing the execution plan. 
  If you are not worried about PreparedStatement caching and there are
   not many queries with IN clause, then it seems to be the way to go.
   
 
��ע�⣬��ѯ�Ƕ�̬�������ģ������������С� ֻ��һ�����ݿ���ã����ܻ�ܺá� 
���ǣ�����û�����Ĵ�С�仯�ܴ����ǽ��޷����PreparedStatement�Ļ��������ִ�мƻ��ĺô���
 ����㲻����PreparedStatement���棬����û�кܶ����IN�Ӿ�Ĳ�ѯ����ô���ƺ���Ҫ�ߵ�·(��������´˷�ʽ�ǿ��е�)��
 
 If you really want to utilize the PreparedStatement caching feature, then another 
 approach is to use NULL in PreparedStatement parameters.
 
 �����ȷʵ��Ҫʹ��PreparedStatement���湦�ܣ���ô��һ�ַ�������PreparedStatement������ʹ��NULL��


����������ڲ�ѯ��ʹ��PreparedStatement for IN�Ӿ�Ĳ�ͬѡ� �����Ը�����ĿҪ��ʹ�������κ�һ����