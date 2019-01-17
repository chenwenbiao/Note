package org.java.core.base.file.ReadTxtFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * using Files class
 * Files 7����Java 7������ģ����������������ļ����ݵ��ڴ棬�Ϳ���ʹ��,
 * ֻ���ڴ���С�ļ�������Ҫ�ڴ�����ļ�����������ʱ����ʹ�ã���������������.
 */
public class NioReadFileExample {
	
	public static String fileName = "C:\\Users\\a\\Desktop\\test\\progress.txt";
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(fileName);
		byte[] bytes = Files.readAllBytes(path);
		List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
		for(String s : allLines) {
			System.out.println("--------");
			System.out.println(s);
		}
	}
}
