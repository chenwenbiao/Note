package org.java.core.base.file.DownloadFileFromURL;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * �������ǽ�ѧϰ��δ�java����URL�е��ļ��� ���ǿ���ʹ��java.net.URL openStream��������
 * ��URL�����ļ��� ���ǿ���ʹ��Java NIO Channels
 * ��Java IO InputStream��URL����,Ȼ���ȡ���ݣ�Ȼ���䱣�浽�ļ��С�
 * 
 */
public class JavaDownloadFileFromURL {

    public static void main(String[] args) {
        String url = "https://www.journaldev.com/sitemap.xml";
        
        try {
            downloadUsingNIO(url, "/Users/pankaj/sitemap.xml");
            
            downloadUsingStream(url, "/Users/pankaj/sitemap_stream.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        // ʹ��URL.openStream����������������(InputStream)
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        // Ȼ������ʹ���ļ������(FileOutputStream)���������ж�ȡ���ݲ�д���ļ���
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        // ��URL�򿪵������ݴ����ֽ�ͨ���� Ȼ��ʹ���ļ����������д���ļ���
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }

}
