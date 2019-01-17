package org.java.core.base.file.ReadTxtFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����������ж�ȡ�ļ��������ǽ��д�����ôBufferedReader�Ǻܺõġ� �������ڴ�����ļ���Ҳ֧�ֱ��롣
 * 
 * BufferedReader��ͬ���ģ���˿��԰�ȫ�شӶ���߳���ɶ�BufferedReader
 * �Ķ�ȡ������ BufferedReader��Ĭ�ϻ�������СΪ8KB��
 */
public class BufferedReaderExample {
	
	public static String fileName = "C:\\Users\\a\\Desktop\\test\\progress.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		String line;
		while((line = br.readLine()) != null){
		     //process the line
		     System.out.println(line);
		}
		br.close();
	}
}
