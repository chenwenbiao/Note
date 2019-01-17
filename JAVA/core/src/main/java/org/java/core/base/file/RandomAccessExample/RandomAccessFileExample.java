package org.java.core.base.file.RandomAccessExample;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * Java RandomAccessFile�ṩ�˶�ȡ��д���ļ����ݵĹ��ߡ� 
 * RandomAccessFileʹ���ļ���Ϊ�洢���ļ�ϵͳ�еĴ��ֽ����飬
 * �Լ������ƶ��ļ�ָ��λ�õ��αꡣ
 * 
 * 
 * RandomAccessFile����Java IO��һ���֡� ��java�д���RandomAccessFileʵ��ʱ��
 * ������Ҫ�ṩ���ļ���ģʽ�� ���磬Ҫ��ֻ��ģʽ���ļ������Ǳ���ʹ�á�r����
 * ���ڶ�д���������Ǳ���ʹ�á�rw����
 * 
 * ʹ���ļ�ָ�룬���ǿ������κ�λ�ô���������ļ��ж�ȡ��д�����ݡ� 
 * Ҫ��ȡ��ǰ�ļ�ָ�룬���Ե���getFilePointer��������
 * ,�����ļ�ָ�����������Ե���seek��int i��������
 * 
 * ����������Ѿ��������ݵ��κ�������д�����ݣ�������������
 * 
 * ���ǿ���ʹ��java�е�RandomAccessFile���ļ��ж�ȡ�ֽ����顣
 * 
 * ����RandomAccessFile���ļ���Ϊ�ֽ����飬���д�������Ը������ݣ�
 * Ҳ���Ը��ӵ��ļ��� ��һ�ж�ȡ�����ļ�ָ���λ�á� ���ָ���ƶ������ļ���
 * ��Ȼ�����д������������ļ���д���������ݡ� ��ˣ���ʹ��д�����ʱӦ��ע����һ�㡣
 * 
 * ��������Ҫ��ֻ��ȷ���ļ�ָ��λ���ļ���ĩβ�Ը��ӵ��ļ� 
 */
public class RandomAccessFileExample {
	
	public static final String fileName = "C:\\Users\\a\\Desktop\\test\\os.txt";

	public static void main(String[] args) {
		try {
			System.out.println(new String(readCharsFromFile(fileName, 1, 5), StandardCharsets.UTF_8));

			writeData(fileName, "Data", 5);
			
			appendData(fileName, " xzj");
			//now file content is "ABCDEDatapankaj"
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void appendData(String filePath, String data) throws IOException {
		RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
		System.out.println("length: " + raFile.length());
		raFile.seek(raFile.length());
		System.out.println("current pointer = "+raFile.getFilePointer());
		raFile.write(data.getBytes());
		raFile.close();
		
	}

	private static void writeData(String filePath, String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	}

	private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		// �ƶ���indexΪseek��λ��Ȼ������λ�ÿ�ʼ��ȡ����ȡchars���ַ���byte array��
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}

}
