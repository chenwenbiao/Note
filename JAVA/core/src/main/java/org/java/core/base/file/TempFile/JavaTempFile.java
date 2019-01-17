package org.java.core.base.file.TempFile;

import java.io.File;
import java.io.IOException;

/**
 * java.io.File���������java�д�����ʱ�ļ��� 
 * ��ʱ������Ҫ������Ӧ�ó���ʹ�õ���ʱ�ļ���
 * 
 * File���������ַ�����������java�д�����ʱ�ļ�:
 * 
 * createTempFile��String prefix��String suffix��File directory����
 * �˷�����directory�����д������и�����׺��ǰ׺����ʱ�ļ���
 * ��Ŀ¼Ӧ���Ѿ����ڲ���Ӧ����һ��Ŀ¼������������쳣��
 * 
 * �ļ���ʹ������������ִ�����
 * ����ļ�����Ϊprefix + random_long_no + suffix��
 * 
 * ��������Ϊ��ʹӦ�ó���ȫ����Ϊ�޷��²��ļ���.
 * 
 * ǰ׺StringӦ����Ϊ�����ַ����� �����׺Ϊnull����ʹ�á�.tmp����׺��
 * 
 * createTempFile��String prefix��String suffix�����ڲ���ϵͳ��ʱĿ¼�д�����ʱ�ļ��ļ�㷽����
 */
public class JavaTempFile {

	public static void main(String[] args) {
		try {
			File tmpFile = File.createTempFile("data", null);//��ϵͳ����ʱ�ļ�Ŀ¼�´�����ʱ�ļ�
			File newFile = File.createTempFile("text", ".temp", new File("C:\\Users\\a\\Desktop\\test"));
			System.out.println(tmpFile.getCanonicalPath());
			System.out.println(newFile.getCanonicalPath());
			// write,read data to temporary file like any normal file

			// delete when application terminates
			tmpFile.deleteOnExit();
			newFile.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
