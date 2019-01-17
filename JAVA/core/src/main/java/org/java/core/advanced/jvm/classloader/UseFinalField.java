package org.java.core.advanced.jvm.classloader;

/**
 *  Final�ֶβ��ᱻ�����ʼ��
 */
public class UseFinalField {
    public static void main(String[] args) {
        System.out.println(FinalFieldClass.CONST_STR);
    }
}

class FinalFieldClass {
    public static final String CONST_STR = "CONSTSTR";

    static {
        System.out.println("FinalFieldClass init");
    }
}