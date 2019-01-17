package org.java.core.base.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * ��ʱ��Java�������ʱ��java.util.ConcurrentModificationException�Ƿǳ�
 * �������쳣, Java Collection���ǿ���ʧ�ܵģ��Ǹ���ζ�������ĳ���߳�ʹ�õ�����������ʱ
 * �������޸ģ���iterator.next()���׳�ConcurrentModificationException�쳣��
 * 
 */
public class ConcurrentModificationException {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				myList.remove(value);
		}

//		Since we are updating the existing key value in the myMap, its size has not
		//been changed and we are not getting ConcurrentModificationException.
		
//		because HashMap keyset is not ordered like list.
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				//�������쳣
				myMap.put("1", "4");
				// myMap.put("4", "4");//�����ע�͵��������쳣
			}
		}
	}
}
