package org.java.core.base.generics;

/**
 * Java�еķ����ڱ���ʱ�ṩ���ͼ�飬��������ʱû����
 * 
 *  ���java������ʹ�����Ͳ�������ɾ��  �ֽڴ����е����з������ͼ����룬
 *  ���ڱ�Ҫʱ��������ת���� 
 *  
 *  ���Ͳ���ȷ����Ϊ ���������� ��������; ��ˣ����Ͳ����������ʱ������
 *
 * @param <T>
 */
public class Test<T extends Comparable<T>> {

    private T data;
    private Test<T> next;

    public Test(T d, Test<T> n) {
        this.data = d;
        this.next = n;
    }

    public T getData() { return this.data; }
}


// Java�������õ�һ���󶨽ӿ�Comparable�滻�н����Ͳ���T, as below code:
//public class Test {
//
//    private Comparable data;
//    private Test next;
//
//    public Node(Comparable d, Test n) {
//        this.data = d;
//        this.next = n;
//    }
//
//    public Comparable getData() { return data; }
//}
