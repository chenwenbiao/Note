package org.java.core.base.file.ReadTxtFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * ���Ҫ���ж�ȡ�ļ������ĳЩjava������ʽ��ȡ�ļ�����Scanner��Ҫʹ�õ��ࡣ
 * 
 * Scanner�ж�����������ڷָ���ģʽ��Ĭ���ǿո�ָ����жϣ�
 * 
 * Scanner is not synchronized and hence not thread safe.
 * Scanner����ͬ���ģ���˲����̰߳�ȫ��.
 */
public class ScannerExample {

	public static String fileName = "C:\\Users\\a\\Desktop\\test\\progress.txt";
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(fileName);
		Scanner scanner = new Scanner(path, "UTF-8");
		System.out.println("Read text file using Scanner");
		//read line by line
		while(scanner.hasNextLine()){
		    //process each line
		    String line = scanner.nextLine();
		    System.out.println(line);
		}
		scanner.close();
	}
}
