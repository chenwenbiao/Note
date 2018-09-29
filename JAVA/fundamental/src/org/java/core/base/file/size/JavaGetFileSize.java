package org.java.core.base.file.size;

import java.io.File;

/**
 * ������ļ���ʾĿ¼���򷵻�ֵδָ���� ��ˣ��ڵ��ô˷����Ի�ȡjava�е��ļ���С֮ǰ����ȷ���ļ����ڲ���������Ŀ¼��
 */
public class JavaGetFileSize {
	
	static final String FILE_NAME = "C:\\Users\\a\\Desktop\\test\\a.txt";
	
	public static void main(String[] args) {
		File file = new File(FILE_NAME);
		if(!file.exists() || !file.isFile()) return;
		
		System.out.println(getFileSizeBytes(file));
		System.out.println(getFileSizeKiloBytes(file));
		System.out.println(getFileSizeMegaBytes(file));
	}
	
	private static String getFileSizeMegaBytes(File file) {
		return (double) file.length() / (1024 * 1024) + " mb";
	}
	
	private static String getFileSizeKiloBytes(File file) {
		return (double)file.length() / 1024 + " kb";
	}
	
	//Java File length() method returns the file size in bytes
	private static String getFileSizeBytes(File file) {
		return file.length() + " bytes";
	}
}
