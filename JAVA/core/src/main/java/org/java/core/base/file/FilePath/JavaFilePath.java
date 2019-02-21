package org.java.core.base.file.FilePath;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaFilePath {

	public static void main(String[] args) throws IOException, URISyntaxException {
		File file = new File("C:\\Users\\xu\\Desktop\\test\\text.txt");
		printPaths(file);
		// relative path
		file = new File("test.xsd");
		printPaths(file);
		// complex relative paths
		file = new File("C:\\Users\\xu\\Desktop\\..\\Desktop\\test\\text.txt");
		printPaths(file);
		// URI paths
		file = new File(new URI("file:///C:/Users/xu/Desktop/test/test.txt"));
		printPaths(file);
	}

	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
		System.out.println("Path: " + file.getPath());
		System.out.println("-------------");
	}
}

//using canonical path is best suitable to avoid any issues because of relative paths.
//ʹ�ù淶·�����ʺϱ��������·�������µ��κ����⡣

//java�ļ�·������������ļ��Ƿ���ڡ�����ֻ�Ǵ�������File����ʱʹ�õ��ļ���·����