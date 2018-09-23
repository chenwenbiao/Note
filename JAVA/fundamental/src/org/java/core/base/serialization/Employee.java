package org.java.core.base.serialization;

import java.io.Serializable;

/**
 * ע�⵽����һ���򵥵�Java bean,��һЩ���Ժ�getter setter������
 * �������Ҫһ���������Բ������л������������ʹ��transient�ؼ��֣�(transient: ��ʱ��)
 * ������salary���������ġ�
 */
public class Employee implements Serializable{


	//����ʹ��serialver����ڿ���̨����: serialver -classpath . com.journaldev.serialization.Employee
	//ע������·����bin�����ɵ��ֽ����ļ�.��ȻҲ����ʹ��IDE�Զ�����.
	private static final long serialVersionUID = 6115687027597651376L;
	
	private static final boolean FLAG = true;
	private String name;
	private int id;
	transient private int salary;
	private String password;
	
	@Override
	public String toString(){
		return "Employee{name="+name+",id="+id+",salary="+salary+"}";
	}
	
	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
