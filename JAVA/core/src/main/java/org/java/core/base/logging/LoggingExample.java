package org.java.core.base.logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {
	static Logger logger = Logger.getLogger(LoggingExample.class.getName());
	
	public static void main(String[] args){
		// java.util.logging.LogManager�Ƕ�ȡ��־��¼����
		// ������ά��loggerʵ������
		//���ǿ���ʹ�ô��������������Լ���Ӧ�ó����ض����á�
		// ������ǲ�ָ���κ����ã����JRE Home lib / logging.properties�ļ��ж�ȡ��
		
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		//adding custom handler
		logger.addHandler(new MyHandler());
		
		try {
            //FileHandler file name with max size and number of log files limit
			// 2000: д���κ�һ���ļ�������ֽ���Ϊ2000
			// ʹ�õ��ļ��ĸ���Ϊ5��
            Handler fileHandler = new FileHandler("C:\\Users\\a\\Desktop\\test\\logger.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
            //setting custom filter for FileHandler
            fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);
            
            for(int i=0; i<1000; i++){
                //logging messages
                logger.log(Level.INFO, "Msg"+i);//ע�����ֿ���̨��־���ļ���־��ͬ��ʽ
            }
            logger.log(Level.CONFIG, "Config data");//���ᱻ��ӡ
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
	}
}
