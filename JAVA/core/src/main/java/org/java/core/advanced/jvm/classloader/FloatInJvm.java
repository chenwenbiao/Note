package org.java.core.advanced.jvm.classloader;

/**
 * ������������������ʵ�ʱ�ʾ
 */
public class FloatInJvm {
    public static void main(String[] args) {
        float a = -5;
        // ���-5�Ĳ��룬��������ڲ�ʵ�ʱ�ʾ
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));
    }
}
