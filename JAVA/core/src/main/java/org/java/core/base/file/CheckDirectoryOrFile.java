package org.java.core.base.file;

import java.io.File;

/**
 * ������ļ�����Ŀ¼
 * isFile(): note that if file doesn��t exist then it returns false.
 * isDirectory(): f path doesn��t exist then it returns false.
 * �ڼ���Ƿ����ļ�����Ŀ¼֮ǰ������Ӧ���ȼ���ļ���Ŀ¼�Ƿ���ڣ�������������ھ�ֱ�ӷ���false��.
 */
public class CheckDirectoryOrFile {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\a\\Desktop\\test\\a.txt");
        File dir = new File("C:\\Users\\a\\Desktop\\test");
        File notExists = new File("C:\\Users\\a\\Desktop\\test\\b.txt");
        
        System.out.println("a.txt is file?"+file.isFile());
        System.out.println("a.txt is file?"+file.isDirectory());
        
        System.out.println("test is directory?"+dir.isFile());
        System.out.println("test is directory?"+dir.isDirectory());
        
        System.out.println("/Users/pankaj/notafile is file?"+notExists.isFile());
        System.out.println("/Users/pankaj/notafile is directory?"+notExists.isDirectory());
	}
}
