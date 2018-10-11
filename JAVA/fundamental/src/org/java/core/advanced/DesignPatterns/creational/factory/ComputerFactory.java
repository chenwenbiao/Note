package org.java.core.advanced.DesignPatterns.creational.factory;

/**
 *  ���ǿ��Խ�Factory�����ΪSingleton���������ǿ��Խ���������ķ�����Ϊstatic�ġ�
 *  
 * ��ע�⣬������������������������ز�ͬ�����ࡣ getComputer�ǹ���������
 * @author a
 *
 */
public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equals(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equals(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
}
