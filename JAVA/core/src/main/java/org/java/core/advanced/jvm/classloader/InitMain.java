package org.java.core.advanced.jvm.classloader;

/**
 * ����ĳ�ʼ�����̺��������ã�
 * 	�����ʼ�����ȳ�ʼ������
 *
 */
public class InitMain {
	public static void main(String[] args) {
//        new Child();// new�ؼ��ֳ�ʼ�� ע�Ϳ�����δ�������Ƚ�
        System.out.println("======");
        System.out.println(Child.v); // ��ʱChild�Ѿ������أ���δ����ʼ������Ϊֻ��ӡ��Parent init��û�д�ӡChild init
    }
}

class Parent {
    static {
        System.out.println("Parent init");
    }
    public static int v = 100;
}

class Child extends Parent {
    static {
        System.out.println("Child  init");
    }
}