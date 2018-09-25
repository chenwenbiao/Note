package org.java.core.base.string;

public class StringCompareToExample {
	public static void main(String[] args) {
		String str = "ABC";
		
		//�ô��ݽ����Ĳ�����String�������ֵ�˳��Ƚ�,������ݽ����Ĳ�����ǰ���ͷ��ظ�ֵ
		//������ݽ����Ĳ������󣬷�����integer�����ֵ��ȣ��ͷ���0
		//The comparison is based on the Unicode value of each character in the strings. 
		//You should check String class source code to check how this method works.
		//comparision�ǻ���ÿ���ַ���Unicodeֵ�Ƚϵ�
		System.out.println(str.compareTo("DEF"));
		System.out.println(str.compareToIgnoreCase("abc"));
		
		//Above negative output is because ��ABC�� is lexicographically 
		//less than the ��DEF��. Output is -3 be
		//cause it compares the character values one by one. You can also confirm this 
		//with below test program.
		char a = 'A';
		char d = 'D';
		System.out.println(a-d);
		
//		So when ��ABC�� is compared to ��DEF��, the character at first index is compared.
//		Since they are different 
//		and ��A�� comes before ��D�� lexicographically, it returns a negative 
//		integer with the difference between them, hence output is -3.

//		So if you compare ��AABC�� with ��ADBC��, then also you will get 
//		the same output as -3. That��s all for java String compareTo 
//		example. Note that this method is not same as String equals method.
	}
}