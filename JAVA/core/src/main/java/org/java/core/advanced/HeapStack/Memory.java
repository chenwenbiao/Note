package org.java.core.advanced.HeapStack;

/**
 * how they are being used to store primitive, Objects and reference variables.
 * ����(Stack memory(��ջ) and heap(��) memory)����α�ʹ��ȥ�洢ԭʼֵ�������Լ����ñ����ġ�
 */
public class Memory {
	
	public static void main(String[] args) {//line 1
		int i = 1;//line 2
		Object obj = new Object();//line 3
		Memory mem = new Memory();//line 4
		mem.foo(obj);//line 5
	}//line 9
	
	private void foo(Object param) {//line 6
		String str = param.toString();//line 7
		System.out.println(str);
	}//line 8
}

//1. һ���������г������ͻὫ��������ʱ����ص�Heap Space�С����ڵ�1���ҵ�main��������ʱ��
// Java Runtime�ᴴ��Ҫ��main()�����߳�ʹ�õ�Stack memory��

//2. �����ڵ�2�д���ԭʼ�ֲ���������������������洢��main()������stack memory�С�

//3. ���������ڵ�3�д�����һ��Object�����ڶ��ڴ�(Heap space)�д�����
// ��ջ�ڴ�(Stack memory)�����������á� �������ڵ�4�д���Memory����ʱ���ᷢ�����ƵĹ��̡�

//4. ���ڣ��������ڵ�5�е���foo��������ʱ���ᴴ����ջ�����Ŀ��Թ�foo��������ʹ�á�
// ����Java�ǰ�ֵ���ݵģ�����ڵ�6�е�foo������ջ���д����˶�Object�������á�

//5. �ڵ�7�д���һ���ַ��������ڶѿռ�(Heap Space)��String Pool�У�
// ����foo������ջ�ռ���Ϊ������һ�����á�

//6. foo���������ڵ�8����ֹ����ʱ�ڶ�ջ��Ϊfoo����������ڴ���Ϊ���С�

//7. �ڵ�9���У�main����������ֹ������Ϊmain�������������Ķ�ջ�ڴ汻���١� 
// �˳���Ҳ�ڴ��н��������Java Runtime�ͷ������ڴ沢���������ִ�С�