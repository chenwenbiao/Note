package org.java.core.advanced.HeapStack;

/**
 * ��ӡ���ڴ�
 */
public class JvmXmxArgs {
	
	// input: java -Xmx33m org.jvmcore.heap.JvmXmxArgs a b
	//��ӡʼ��С�� 33M , ��ΪGC�ڲ�ͬ������ò�ͬ�����㷨�������ڴ�ļ���Ϊ����ʹ�ÿռ任ʱ��Ĳ��ԡ�
    public static void main(String[] args) {
        for (String arg : args)
            System.out.println("����Ϊ" + arg);
        
        // ���ڴ�
        System.out.println("-Xmx:" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
    }
}
