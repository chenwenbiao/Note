package org.java.core.base.logging;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * ��ʽ���������ڸ�ʽ����־��Ϣ�� java logging API�����������õĸ�ʽ������
 * 
 * SimpleFormatter���˸�ʽ���������ɰ���������Ϣ���ı���Ϣ�� 
 * ConsoleHandlerʹ�ô�formatter�ཫ��־��Ϣ��ӡ������̨��
 * 
 * XMLFormatter���˸�ʽ������Ϊ��־����XML��Ϣ��
 * FileHandlerʹ��XMLFormatter��ΪĬ�ϸ�ʽ������
 * 
 * ���ǿ���ͨ����չjava.util.logging.Formatter�������������Լ����Զ���Formatter�࣬
 * �����丽�ӵ��κδ������(handler)
 *
 */
public class MyFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		return record.getThreadID() + "::" + record.getSourceClassName() + "::"
				+ record.getSourceMethodName() + "::" + new Date(record.getMillis()) + "::"
				+ record.getMessage() + "\n";
	}

	
}
