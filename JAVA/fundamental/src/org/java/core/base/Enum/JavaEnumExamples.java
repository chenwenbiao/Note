package org.java.core.base.Enum;

import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class JavaEnumExamples {

	public static void main(String[] args) throws IOException {

		usingEnumMethods();

		usingEnumValueOf();

		usingEnumValues();

		usingEnumInSwitch(ThreadStatesEnum.START);
		usingEnumInSwitch(ThreadStatesEnum.DEAD);

		usingEnumMap();

		usingEnumSet();

	}

	/**
	 * usingEnumSet����������ʾ��java.util.EnumSet��ʹ�ã�
	 * ��������ö�����͵�Setʵ�֡�ö�ټ�set�е�����Ԫ�ر������Ե���ö�����ͣ�
	 * �������ڴ�����ʱ��ʽ����ʽָ���� EnumSetδͬ����������ʹ��nullԪ�ء�
	 * �����ṩ��һЩ���õķ�������copyOf��Collection <E> c����
	 * ��E first��E ... rest����complementOf��EnumSet <E> s����
	 */
	private static void usingEnumSet() {
		EnumSet<ThreadStatesEnum> enumSet = EnumSet.allOf(ThreadStatesEnum.class);
		
		for (ThreadStatesEnum tsenum : enumSet) {
			System.out.println("Using EnumSet, priority = " + tsenum.getPriority());
		}
	}

	/**
	 * usingEnumMap����������ʾ��java.util.EnumMap��ʹ�ã�
	 * ����Java 1.5 Collections Framework������ġ� EnumMap������ö�����ͼ���Mapʵ�֡�
	 * ö��ӳ���е����м� �������Դ���ӳ��ʱ��ʽ����ʽָ���ĵ���ö�����͡����ǲ���ʹ��null��ΪEnumMap�ļ���
	 * ����EnumMap��ͬ����
	 */
	private static void usingEnumMap() {
		EnumMap<ThreadStatesEnum, String> enumMap = new EnumMap<ThreadStatesEnum, String>(ThreadStatesEnum.class);
		enumMap.put(ThreadStatesEnum.START, "Thread is started");
		enumMap.put(ThreadStatesEnum.RUNNING, "Thread is running");
		enumMap.put(ThreadStatesEnum.WAITING, "Thread is waiting");
		enumMap.put(ThreadStatesEnum.DEAD, "Thread is dead");

		Set<ThreadStatesEnum> keySet = enumMap.keySet();
		for (ThreadStatesEnum key : keySet) {
			System.out.println("key=" + key.toString() + ":: value=" + enumMap.get(key));
		}
	}

	/**
	 * usingEnumInSwitch����������ʾ�������switch case��ʹ��ö�ٳ�����
	 * @param th
	 */
	private static void usingEnumInSwitch(ThreadStatesEnum th) {
		switch (th) {
		case START:
			System.out.println("START thread");
			break;
		case WAITING:
			System.out.println("WAITING thread");
			break;
		case RUNNING:
			System.out.println("RUNNING thread");
			break;
		case DEAD:
			System.out.println("DEAD thread");
		}
	}

	/**
	 * usingEnumValues����������ʾ��values�����������÷����÷�������һ�����飬
	 * �����鰴��������˳�����ö�ٵ�����ֵ����ע�⣬�˷�����java������Ϊÿ��ö���Զ����ɡ�
	 * ������java.util.Enum�����Ҳ���values����ʵ�֡�
	 */
	private static void usingEnumValues() {
		ThreadStatesEnum[] thArray = ThreadStatesEnum.values();

		for (ThreadStatesEnum th : thArray) {
			System.out.println("usingEnumValues ---- " + th.toString() + "::priority=" + th.getPriority());
		}
	}

	/**
	 * usingEnumValueOf������ʾ��java.util.Enum valueOf��enumType��name�����÷���
	 * ͨ�������ǿ��Դ�String����һ��ö�ٶ������ָ����ö������û�о���ָ�����Ƶĳ�����
	 * ����ָ��������󲻱�ʾö�����ͣ����׳�IllegalArgumentException��
	 * ����κβ���Ϊnull����Ҳ���׳�NullPointerException��
	 */
	private static void usingEnumValueOf() {
		ThreadStatesEnum th = Enum.valueOf(ThreadStatesEnum.class, "START");
		System.out.println("usingEnumValueOf th priority=" + th.getPriority());
	}

	/**
	 * usingEnumMethods������ʾ����δ���ö�ٶ����Լ����ʹ�����ķ�����
	 * ������ʾ��ʹ��setPriority��int i������������ö�ٵı�����
	 * @throws IOException
	 */
	private static void usingEnumMethods() throws IOException {
		ThreadStatesEnum thc = ThreadStatesEnum.DEAD;
		System.out.println("priority is:" + thc.getPriority());

		thc = ThreadStatesEnum.DEAD;
		System.out.println("Using overriden method." + thc.toString());

		thc = ThreadStatesEnum.START;
		System.out.println("Using overriden method." + thc.toString());
		thc.setPriority(10);
		System.out.println("Enum Constant variable changed priority value=" + thc.getPriority());
		thc.close();
	}

}
