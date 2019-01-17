package org.java.core.base.collection.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Java HashMap keySet��������HashMap�м���Set��ͼ�� ��Set��ͼ��HashMap֧�֣�
// HashMap�е��κθ��Ķ���ӳ��Set�У���֮��Ȼ��
public class HashMapKeySetExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");

		Set<String> keySet = map.keySet();
		System.out.println(keySet);

		map.put("4", "d");
		System.out.println(keySet); // keySet is backed by Map

		keySet.remove("1");
		System.out.println(map); // map is also modified

		keySet = new HashSet<>(map.keySet()); // copies the key to new Set
		map.put("5", "5");
		System.out.println(keySet); // keySet is not modified
	}

}
