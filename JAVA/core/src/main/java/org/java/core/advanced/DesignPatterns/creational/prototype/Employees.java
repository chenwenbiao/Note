package org.java.core.advanced.DesignPatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	// ������һ�������ݿ�������ݵ�Object�� ����������Ҫ�ڳ����ж���޸���Щ���ݣ�
	// ���ʹ��new�ؼ��ִ���Object�������ݿ��ٴμ����������ݲ���һ�������⡣

	// ���õķ����ǽ����ж����¡���¶����У�Ȼ��������ݲ�����
	public void loadData() {
		// read all employees from database and put into the list
		empList.add("xzj");
		empList.add("xiaoming");
		empList.add("liyan");
		empList.add("kingLBJ");
	}

	public List<String> getEmpList() {
		return this.empList;
	}

	/**
	 * ԭ�����ģʽҪ�������ƵĶ���Ӧ�ṩ���ƹ��ܡ� ����Ӧ�����κ���������ɡ� 
	 * ���ǣ��Ƿ�ʹ��Object���Ե�ǳ�����ȡ����Ҫ������ƾ��ߡ�
	 * 
	 * ����ʹ����deep copy
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
	// ���δ�ṩ�����¡�����ǽ����ò��������ݿ������ÿ�λ�ȡԱ���б� 
	// Ȼ����б����ķ�resource��time�Ĳ�����
}
