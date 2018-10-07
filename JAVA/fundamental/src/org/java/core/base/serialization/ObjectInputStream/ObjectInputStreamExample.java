package org.java.core.base.serialization.ObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.java.core.base.serialization.Employee;

/**
 * ת��������(file)Ϊ����Ĺ��̽��������л�,ObjectInputStream��
 * Ŀ�ľ����ṩ������ת��������Ϊ�����һ�ַ�ʽ,
 */
public class ObjectInputStreamExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream is = new FileInputStream("EmployeeObject.ser");
		ObjectInputStream ois = new ObjectInputStream(is);
		Employee emp = (Employee) ois.readObject();//We have to do class casting to convert Object to actual class
		ois.close();
		is.close();
		System.out.println(emp.toString());
	}
}
