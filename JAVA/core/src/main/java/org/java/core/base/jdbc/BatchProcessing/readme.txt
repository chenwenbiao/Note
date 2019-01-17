JDBC Batch insert and update examples in MySQL and Oracle databases. 

 ��ʱ������ҪΪ���ݿ��������Ƶ�������ѯ�����罫���ݴ�CSV�ļ����ص���ϵ���ݿ�� 
 ����֪�����ǿ���ѡ��ʹ��Statement��PreparedStatement��ִ�в�ѯ��
  ����֮�⣬JDBC���ṩ���������ܣ�ͨ���ù��ܣ����ǿ���һ����Ϊ���ݿ�ִ�д�����ѯ��
  
JDBC batch statements are processed through Statement and PreparedStatement 
addBatch() and executeBatch() methods.


MYSQL DB	STATEMENT	PREPAREDSTATEMENT	STATEMENT BATCH	PREPAREDSTATEMENT BATCH
Time Taken (ms)	8256	8130	7129	7019

���Ҳ鿴��Ӧʱ��ʱ���Ҳ�ȷ�����Ƿ���ȷ����Ϊ��ϣ��ͨ���������ܹ�������Ӧʱ�䡣 �����������Ͽ���һЩ���ͣ�
 and found out that by default MySQL batch processing works in 
 similar way like running without batch. 
 ����Ĭ��MySQL������Ĺ�����ʽ��û���������������ơ� Ϊ�˻��MySQL���������ʵ�ʺô���
 ������Ҫ�ڴ������ݿ�����ʱ��rewriteBatchedStatements����ΪTRUE:
 
#DB_URL=jdbc:mysql://localhost:3306/UserDB?rewriteBatchedStatements=true

��rewriteBatchedStatements����Ϊtrue���±��ṩ����ͬ�������Ӧʱ�䡣


MYSQL DB	STATEMENT	PREPAREDSTATEMENT	STATEMENT BATCH	PREPAREDSTATEMENT BATCH
Time Taken (ms)	5676	5570	3716	394

As you can see that PreparedStatement Batch Processing is very fast 
when rewriteBatchedStatements is true. So if you have a lot of 
 processing involved, you should use this feature for faster processing.
 �������������ģ���rewriteBatchedStatementsΪtrueʱ��PreparedStatement Batch Processing�ǳ��졣
  ��ˣ�����漰������������Ӧʹ�ô˹����Լӿ촦���ٶȡ�

����ִ��Oracle���ݿ����������ʱ�������MySQL������һ�£�PreparedStatement Batch������κ�����������öࡣ



