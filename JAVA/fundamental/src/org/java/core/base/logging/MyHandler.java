package org.java.core.base.logging;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * ���ǿ�����java logger����Ӷ��handlers��
 * ÿ�����Ǽ�¼�κ���Ϣʱ��ÿ���������handler��������Ӧ�ش�����
 *  Java Logging API�ṩ������Ĭ�ϴ������handler����
 * 
 * @author a
 *
 */
public class MyHandler extends StreamHandler{
	
	@Override
	public void publish(LogRecord record){
		//add own logic to publish
		super.publish(record);
	}
	
	@Override
	public void flush(){
		super.flush();
	}
	
	@Override
	public void close(){
		super.close();
	}
}
