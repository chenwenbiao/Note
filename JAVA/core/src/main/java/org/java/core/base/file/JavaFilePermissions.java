package org.java.core.base.file;

import java.io.File;

/**
 * Java File���������û����ļ�Ȩ�޵ķ�����
 * ���ǻ���һЩ��������Ϊ�û������������������ļ�Ȩ�ޡ�
 * 
 *  ���ǽ����ȼ���û����ļ�Ȩ�ޡ� 
 *  �Ժ����ǽ�����Ӧ�ó����û����ļ�Ȩ�ޣ�
 *  Ȼ��������������û����ļ�Ȩ�ޡ�
 * 
 * ��ע�⣬�����ļ�Ȩ�޲���ͨ�õģ����������ʹ��Java 7��
 * ��Ӧʹ��Java PosixFilePermission�������ļ�Ȩ�ޡ�
 *
 * �����Щ�ļ���Ȩ�޷����޷������ļ�Ȩ�ޣ�������Ҳ�᷵��false�� 
 * ����������û�Ȩ�޶������� ���磬����ҽ�ʾ���ļ��������߸���Ϊroot��
 * ������set file permission�������ö�������false��
 */
public class JavaFilePermissions {
	public static void main(String[] args) {
		
        File file = new File("C:\\Users\\a\\Desktop\\test\\a.pdf");
        
        //check file permissions for application user
        System.out.println("File is readable? "+file.canRead());
        System.out.println("File is writable? "+file.canWrite());
        System.out.println("File is executable? "+file.canExecute());
        
        //change file permissions for application user only
        System.out.println(file.setReadable(false));
        System.out.println(file.setWritable(false));
        System.out.println(file.setExecutable(false));
        
        //change file permissions for other users also
        System.out.println(file.setReadable(true, false));
        System.out.println(file.setWritable(true, false));
        System.out.println(file.setExecutable(true, true));
        
    }
}
