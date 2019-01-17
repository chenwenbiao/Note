package org.java.core.base.GettingStarted;

/**
 * ��������һ���Բ�ͬ����String��Ϊ��ͬ�ļ򵥷�����
 * ����һ��Servlet������������鴫��Ķ�������Ӧ�ش�����.
 * 
 *  ��Java 7֮ǰ��ʵ�ֻ����ַ�������������Ψһ������ʹ��if-else������ 
 *  ����Java 7�Ľ���switch case��֧��String��
 *  
 *  1. Java switch caseͨ��ɾ�����if-else-if����������ʹ������߿ɶ��ԡ�
 *  2. Java switch case String���ִ�Сд
 *  3. Java Switch case uses String.equals() method to compare 
 *  the passed value with case values, so make sure to add a 
 *  NULL check to avoid NullPointerException.
 *  Java switch case��String��equals�����Ƚϴ����ֵ��case��ֵ����ȷ��
 *  ������һ���Ƿ�Ϊnull���ж��Ա����ָ���쳣
 *  4. According to Java 7 documentation for Strings in Switch, 
 *  java compiler generates more efficient byte code for String 
 *  in Switch statement than chained if-else-if statements.
 *  ����Java7�Ķ�����Switch�е�String�е��ĵ���java���������ɸ�����Ч���ֽ������
 *  Stirng��switch�еı�����ʽ��if-else-if���.
 *  5. ȷ��ֻ����֪��������Java 7һ��ʹ��ʱ��ʹ��java switch case String��
 *  ���������׳�Exception��
 *  6. ���ǿ���ʹ��java��Ԫ�����������switch����д��С�Ĵ��롣
 */
public class SwitchStringExample {

	public static void main(String[] args) {
		printColorUsingSwitch("red");
		
		printColorUsingIf("red");
		
		// switch case string is case sensitive
		printColorUsingSwitch("RED");
		printColorUsingSwitch(null);
	}

	private static void printColorUsingIf(String color) {
		if (color.equals("blue")) {
			System.out.println("BLUE");
		} else if (color.equals("red")) {
			System.out.println("RED");
		} else {
			System.out.println("INVALID COLOR CODE");
		}
	}

	private static void printColorUsingSwitch(String color) {
		switch (color) {
		case "blue":
			System.out.println("BLUE");
			break;
		case "red":
			System.out.println("RED");
			break;
		default:
			System.out.println("INVALID COLOR CODE");
		}
	}
}
