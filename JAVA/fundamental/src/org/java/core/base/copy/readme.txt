 Java Object�฽����native clone�����������÷�����������ʵ���ĸ�����

���ʹ��clone������
 
	 Ҫʹ��java�����¡���������Ǳ���ʵ�ֱ�ǽӿ�java.lang.Cloneable.
(��ֻ��һ����ǽӿڣ��ӿ�����û���κη���Ҫʵ��)	 
 ���Ա�������������ʱ�׳�CloneNotSupportedException��
  �����¡Ҳ���ܱ���(protected)�ķ�����������Ǳ�����д������������һ��ʹ�á�

Notice: Ҫʹ��clone���������Ǳ���implements Cloneable�ӿ�.

Shallow Cloning:

Default implementation of java clone object is using shallow copy, 
something like below using reflection.
java clone�����Ĭ��ʵ����ʹ��ǳ����, ��������ʹ�÷��䡣

Deep Cloning:
����ȿ�¡�У����Ǳ�����������ֶΡ� ���ǿ��Ը�������Ŀ�¡����������ȿ�¡��

