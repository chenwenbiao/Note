package org.java.core.base.annotations.Override;

/**
 * Javaע����1.5�����룬Java@Overrideע����JavaĬ��ע��֮һ��
 * ������Ϊһ������ʹ�����ע���ʱ�������߱����������ڳ��Ը��Ǹ���ķ���.
 * Java @Override annotation benefits
 * It��s clear that using java @Override annotation will make
 * sure any superclass changes in method signature will result in
 * a warning and you will have to do necessary changes to make sure 
 * the classes work as expected.�����Ϸ����� �ı���ܻ���������ľ���.
 * <p><br>
 * It��s better to resolve potential issues at compile time than 
 * runtime. So always use java @Override annotation whenever you 
 * are trying to override a superclass 
 * method.(�ڱ���ʱ����Ǳ�ڵ����������ʱ���ã��������д���෽����ʱ��Ӧ��ʹ��@Override)
 */
public class OverrideTest {
	public static void main(String[] args) {
		//Here bc is of type BaseClass,����������ʱ����
		//ChildClass�Ķ�����˵����ǵ���doSomething(String str)����
		//��ʱ����Ѱ����ChildClass�еķ���
		BaseClass bc = new ChildClass();
		bc.doSomething("override");
	}
}
