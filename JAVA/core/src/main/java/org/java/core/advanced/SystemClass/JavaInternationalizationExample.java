package org.java.core.advanced.SystemClass;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Ϊ��ʹ����Ӧ�ó���֧�ֲ�ͬ�����Ի�����������Ҫ�����ض������Ի����������ļ���
 * ,�ļ�����ѭ�����Ƶ�ģʽ���������Դ���͹���/�������룬
 * ����ApplicationMessages_en_US.properties��
 * һ���ض����Ի����������ļ�׼������������Ҫ���ľ���ʹ����ȷ��Locale��ʼ����Դ����
 *  Java�ṩ���������ڴ�Ŀ�ĵ�java.util.ResourceBundle��java.util.Locale�ࡣ
 *   ResourceBundle��ȡ�ض������Ի����������ļ��������Ի�ȡ�κμ����ض������Ի�����ֵ��
 *   �����ʹ����WebӦ�ó����ı��ض����������÷ǳ����ã������Դ�HTTP�����ȡ����������Ϣ����
 *   �ɰ���������������Դ���ļ��Ķ�̬ҳ�档
 * there are some locales already defined but 
 * we can always create new locale by passing language code 
 * and country code to it��s constructor.
 */
public class JavaInternationalizationExample {
	public static void main(String[] args) {
		try{
			// default locale
			ResourceBundle bundle = ResourceBundle.getBundle("ApplicationMessages");
			// Get ResourceBundle with Locale that are already defined
			ResourceBundle bundleFR = ResourceBundle.getBundle("ApplicationMessages", Locale.FRANCE);
			// Get resource bundle when Locale needs to be created
			ResourceBundle bundleSWE = ResourceBundle.getBundle("ApplicationMessages", new Locale("sv", "SE"));

			// Note: �����ļ�Ҫ�ŵ�src���棬��Ҫ�ŵ��͵�ǰjava�ļ�ͬ��Ŀ¼
			
			// lets print some messages
			printMessages(bundle);
			printMessages(bundleFR);
			printMessages(bundleSWE);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void printMessages(ResourceBundle bundle) {
		System.out.println(bundle.getString("CountryName"));
		System.out.println(bundle.getString("CurrencyCode"));
	}
}
