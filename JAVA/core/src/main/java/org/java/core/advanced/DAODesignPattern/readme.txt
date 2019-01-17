DAO stands for Data Access Object.

DAO���ģʽ���ڽ����ݳ־����߼����ڵ������У� ������
������������ɷ������ݿ�ĵͼ�������ȫ���˽⡣ �ⱻ��Ϊ�߼�����ԭ��

With DAO design pattern, we have following components on which our design depends:
ʹ��DAO���ģʽ�����ǵ�������������������

��һ��ת�Ƶ���һ���ģ�͡�
�ӿ��ṩ������ơ�
�ӿ�ʵ���ǳ־����߼��ľ���ʵ�֡�

ʾ��:

Bookģ�ʹ�һ��ת�Ƶ���һ�㡣
BookDao�����ṩ������ƺ�APIʵ�֡�
BookDaoImpl�����࣬��BookDao�ӿڵ�һ��ʵ�֡�

Books								BookDao:							Main:
- ISBN									- GetAllBooks	<--Calls		  - Uses the interface
			<-------Transfers----  		- saveBook
- Name
										^
										|
										|
										|implements
										|
										|
								    BookDaoImpl:
								    	- getAllBooks
								    	- saveBook
								    	
ʹ��DAOģʽ������ŵ�:

1. �ڸ��ĳ־��Ի���ʱ���������������֪�����ݵ���Դ��
���磬��������ڿ��Ǵ�ʹ��MySQLת�Ƶ�MongoDB����ֻ��Ҫ��DAO����������и��ġ�

2. DAOģʽǿ��Ӧ�ó���Ĳ�ͬ���֮��ĵ���ϡ���ˣ�View�㲻������DAO�㣬
ֻ��Service��������������ʹ�ǽӿڶ����Ǿ���ʵ�֡�

3. ���ڳ־����߼�����ȫ�����ģ����Ϊ���������д��Ԫ����Ҫ���׵öࡣ
���磬�����ʹ��JUnit��Mockito�����Կ�ܣ���ô������ģ��Ӧ�ó���ĸ��������

4. ������ʹ��DAOģʽ�еĽӿ�ʱ������ǿ����ʹ�ýӿڶ�����ʵ�֡��ķ������һ�������OOP��̷��
DAOģʽ����

ʹ��DAO���ģʽ��ǿ�����ֳ־����߼����룬��ˣ����ǵ������ɢ��ϡ�								    	