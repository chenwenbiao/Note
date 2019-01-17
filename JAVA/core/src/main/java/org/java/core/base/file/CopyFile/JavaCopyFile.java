package org.java.core.base.file.CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * Java�����ļ���һ�ַǳ������Ĳ����� ����java.io.File��û���κο�ݷ���
 * ���Խ��ļ���Դ���Ƶ�Ŀ�ꡣ ��������ǽ��˽������java�и����ļ������ֲ�ͬ������
 * 
 * ����Ҫ�ҳ��ĸ������ķ������ұ�д��һ�������࣬�����ִ������ķ�����
 * ����1 GB�ĸ����ļ�����ÿ�ε����У���ʹ�ò�ͬ���ļ���������Ϊ��������Ժ�ķ��������κκô���
 * 
 * ��ע����������Ĵ�����ע�ͣ���ȷ��ÿ��ֻ��һ����������java�ļ����Ʋ�����
 * 
 * ������п�������ؿ�����Stream Copy����Java�и���File����ѷ�ʽ��
 *  ������һ���ǳ������Ĳ��ԣ���������ڿ�չһ�������ܼ�����Ŀ��
 *  ��ô��Ӧ�ó��Բ�ͬ��java�����ļ�������������ʱ�䣬�ҳ�����Ŀ����ѷ�����
 *  
 * ����Ӧ�ø����ļ���ƽ����С���ȶԲ�ͬ�ĵ�java�����ļ���ʽ��
 * 
 * Time taken by Stream  =     6401036996 nanoTime
 * Time taken by Channel  =     553044816 nanoTime
 * Time taken by Java7 Files  = 603724328 nanoTime
 */
public class JavaCopyFile {

	static int UNIT_CONVERT = 1000 * 1000;
	
    public static void main(String[] args) throws InterruptedException, IOException {
        File source = new File("C:\\Users\\a\\Desktop\\test\\source.zip");
        File dest = new File("C:\\Users\\a\\Desktop\\test\\dest.zip");
        long start = 0L;

        //copy file conventional way using Stream
        start = System.nanoTime();
        copyFileUsingStream(source, dest);
        System.out.println("Time taken by Stream  = "+(System.nanoTime()-start)/UNIT_CONVERT + " millionSeconds");
        
          //copy files using java.nio FileChannel
//        source = new File("C:\\Users\\a\\Desktop\\test\\channelSource.zip");
//        dest = new File("C:\\Users\\a\\Desktop\\test\\channelDest.zip");
//        start = System.nanoTime();
//        copyFileUsingChannel(source, dest);
//        System.out.println("Time taken by Channel  = "+(System.nanoTime()-start) + " nanoTime");
        
          // using Java 7 Files class
//        source = new File("C:\\Users\\a\\Desktop\\test\\FilesSource.zip");
//        dest = new File("C:\\Users\\a\\Desktop\\test\\aa.zip");
//        start = System.nanoTime();
//        copyFileUsingJava7Files(source, dest);
//        System.out.println("Time taken by Java7 Files  = "+(System.nanoTime()-start) + " nanoTime");        
    }
    
    /**
     * ����java�г�����ļ����Ʒ�ʽ���������Ǵ��������ļ���Դ��Ŀ�ꡣ
     * Ȼ�����Ǵ�Դ����InputStream��ʹ��OutputStream����д��
     * Ŀ���ļ��Խ���java�����ļ�������
     * @param source
     * @param dest
     * @throws IOException
     */
    private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
    
    /**
     * Java Copy File �C java.nio.channels.FileChannel
     * 
     * Java NIO����Java 1.4�����룬FileChannel��������java�и����ļ��� 
     * ����transferFrom��������javadoc�����ָ����ļ��ķ�ʽӦ�ñ�ʹ��Streams
     *  for java copy�ļ����졣
     * @param source
     * @param dest
     * @throws IOException
     */
	private static void copyFileUsingChannel(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        sourceChannel = new FileInputStream(source).getChannel();
	        destChannel = new FileOutputStream(dest).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally{
           sourceChannel.close();
           destChannel.close();
	    }
	}
	

	/**
	 * ���������ʹ��Java 7����߰汾�������ʹ��Files��copy����
	 * ������java�и����ļ�����ʹ���ļ�ϵͳ�ṩ�����������ļ���
	 * 
	 * @param source
	 * @param dest
	 * @throws IOException
	 */
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
	    Files.copy(source.toPath(), dest.toPath());
	}


}
