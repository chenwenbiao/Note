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

1. �������������primitives and immutable variables.ʱ����ʹ��Ĭ�ϵ�Object clone����������
��ע�⣬��Ҳ�����ڼ̳С�������������Ҫ��չ���ֱ࣬��the Object level.��

2. �����������Ҫ�ɿɱ������ɣ��������Զ��帴�ƹ��캯����

3. ͨ������д��¡�����е���super.clone����������Object clone����������Ȼ�����ȸ��ƿɱ��ֶν��б�Ҫ�ĸ��ġ�

4. ����������ǿ����л��ģ���ô��Ҳ����ʹ�����л����п�¡�� 
Ȼ�����������������ʧ�������ʹ�ô˷������п�¡֮ǰ�������һЩ��׼���ԡ�

��ϣ�����Զ����¡������һЩ�˽⣬�Լ������ȷ����������������κβ���Ӱ�졣 without any adverse effect.