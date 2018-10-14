package org.java.core.base.copy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * If our Employee class won��t implement Cloneable interface, below program will
 * throw java.lang.CloneNotSupportedException runtime exception.
 */
public class Employee implements Cloneable {

	private int id;

	private String name;

	private Map<String, String> props;
	
	public Employee(){
		
	}
	
	// ���ǻ����Զ��帴�ƹ��캯������ȡ����ĸ��������������ڿ�¡��
	// Whenever we need a copy of employee object, we can get 
	// it using Employee clonedEmp = new Employee(emp);
	
	// ���ǣ�����������кܶ��������ô��д���ƹ��캯��������һ����Ĺ�����
	// �������ԭʼ�ĺͲ��ɱ�ġ�
	
	public Employee(Employee emp) {
		
		this.setId(emp.getId());
		this.setName(emp.getName());
		
		Map<String, String> hm = new HashMap<>();
		String key;
		Iterator<String> it = emp.getProps().keySet().iterator();
		// Deep Copy of field by field
		while (it.hasNext()) {
			key = it.next();
			hm.put(key, emp.getProps().get(key));
		}
		this.setProps(hm);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	// Shallow Copy:
	/*@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/

	// Deep Copy:
	// �����������Ҫ�ģ���¡Ӧ�÷���һ����ȫ����ԭʼ������¶���
	@Override
	public Object clone() throws CloneNotSupportedException {

		Object obj = super.clone(); // utilize clone Object method

		Employee emp = (Employee) obj;

		// deep cloning for immutable fields
		emp.setProps(null);
		Map<String, String> hm = new HashMap<>();
		String key = null;
		Iterator<String> it = this.props.keySet().iterator();
		// Deep Copy of field by field
		while (it.hasNext()) {
			key = it.next();
			hm.put(key, this.props.get(key));
		}
		emp.setProps(hm);

		return emp;
	}
}
