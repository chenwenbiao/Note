package org.java.core.base.collection.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// Java HashMap values��������Map��ֵ��Collection��ͼ�� 
// �˼�����HashMap֧�֣����HashMap�е��κθ��Ķ�����ӳ��ֵ�����У�
public class HashMapValuesExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", null);
		map.put("4", null);
		map.put(null, "d");

		Collection<String> values = map.values();
		System.out.println("map values = " + values);

		map.remove(null);
		System.out.println("map values after removing null key = " + values);

		map.put("5", "5");
		System.out.println("map values after put = " + values);

		System.out.println(map);
		values.remove("a"); // changing values collection
		System.out.println(map); // updates in map too

	}

}
