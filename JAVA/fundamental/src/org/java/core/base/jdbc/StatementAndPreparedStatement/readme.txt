Since JDBC PreparedStatement is pre-compiled, we can��t use it with 
IN clause. Rather than going back to Statement, there are some 
alternative approaches that we can use to get over this shortcomings 
of Prepared Statement. This article provides four different 
alternative approaches that we can take to support IN clause
 with prepared statements. You should read it because you never 
 know when you are going to need it, also it��s one of the most 
 asked interview question related to JDBC.

Why we should avoid JDBC Statement.

JDBC Statement ��һЩ��Ҫ���⣬Ӧ������������¶�����ʹ��.

������ҪΪ��ϵ���ݿ�ִ�еĲ�ѯʱ������ִ�����²���:

����SQL��ѯ
SQL��ѯ�ı���
�滮���Ż����ݲɼ�·��
ִ���Ż���ѯ�����ؽ������

������ʹ��Statementʱ�����ᾭ�������ĸ����裬
���������Ǵ���PreparedStatementʱִ��ǰ�������衣��ˣ�ִ�в�ѯ�����ѵ�ʱ����٣����Ҹ��졣

ʹ��PreparedStatement����һ���ô������ǿ���ͨ��addBatch������executeBatch����
����ʹ�����������ǿ��Դ���һ��Ԥ׼����䲢ʹ������ִ�ж����ѯ��

Some points to remember about JDBC PreparedStatement are:

PreparedStatement�������Ƿ�ֹSQLע�빥������Ϊ�����Զ�ת�������ַ���
PreparedStatement��������ʹ�ò�������ִ�ж�̬��ѯ��
PreparedStatement�ṩ�˲�ͬ���͵�setter���������ò�ѯ�����������
PreparedStatement��Statement�졣����������PreparedStatement��ʹ��������������ִ�ж����ѯʱ������ø������ԡ�
PreparedStatement��������ʹ��setter������д�������Ĵ��룬��ʹ��Statement���Ǳ���ʹ��String Concatenation��������ѯ�����Ҫ���ö����������ʹ���ַ������ӱ�д��ѯ�������ǳ��ѿ��������׳���
PreparedStatement����FORWARD_ONLY ResultSet���������ֻ����ǰ�ƶ���
��Java Arrays��List��ͬ��PreparedStatement������������1��ʼ��
PreparedStatement��һ�����������ǲ��ܽ������ڴ���IN�Ӿ��SQL��ѯ����ΪPreparedStatement����������Ϊ����ռλ���������󶨶��ֵ�����ǣ�ʹ��PreparedStatement for IN�Ӿ������������٣�����JDBC PreparedStatement IN�Ӿ����Ķ��������ݡ�
�����JDBC Statement��PreparedStatement�ıȽϡ���Ӧ��ʼ��ʹ��PreparedStatement����Ϊ�����٣�������󣬶�̬�Ҹ��ɿ���


