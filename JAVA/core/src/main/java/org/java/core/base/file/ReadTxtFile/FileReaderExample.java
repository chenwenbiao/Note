package org.java.core.base.file.ReadTxtFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *  FileReader��֧�ֱ��벢ʹ��ϵͳĬ�ϱ��룬�����java�ж�ȡ�ı��ļ���Ч�ʲ��ߡ�
 *  ��������,
 * @author a
 *
 */
public class FileReaderExample {
	
	public static String fileName = "C:\\Users\\a\\Desktop\\test\\progress.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;//�����ڲ�ʹ��֮ǰһ��Ҫ��ʼ����������ʹ�ã��������ᱨ��Ĭ��ֵҲ����null.
		while((line = br.readLine()) != null){
		    //process the line
		    System.out.println(line);
		}
	}
}
