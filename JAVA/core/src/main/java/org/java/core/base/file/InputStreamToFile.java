package org.java.core.base.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ����ʹ��Java�е�Reader��Stream��ȡ�ļ��� Reader���ʺ������ı����ݣ�
 * ��Ҫʹ�ö��������ݣ���Ӧ��ʹ��Stream�� FileInputStream���ڴ����Դ��ļ��ж�ȡ���ݡ�
 * �������ǽ���InputStreamת��Ϊjava�е��ļ������ǽ�ʹ��OutputStream����д���ļ���
 */
public class InputStreamToFile {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\Users\\a\\Desktop\\test\\source.txt");
            
            OutputStream os = new FileOutputStream("C:\\Users\\a\\Desktop\\test\\new_source.txt");
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) !=-1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
