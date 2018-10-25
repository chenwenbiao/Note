package org.java.core.base.collection.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

// HashMap replaceAll���������ڽ�ÿ����Ŀ��ֵ�滻Ϊ�ڸ���Ŀ�ϵ��ø��������Ľ���� 
// ��Java 8������˴˷��������ǿ��Խ�lambda���ʽ���ڴ˷���������
public class HashMapReplaceAllExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put(null, "c");

		System.out.println("map before replaceAll = " + map);
		BiFunction<String, String, String> function = new MyBiFunction();
		map.replaceAll(function);
		System.out.println("map after replaceAll = " + map);

		// replaceAll using lambda expressions
		map.replaceAll((k, v) -> {
			if (k != null) return k + v;
			else return v;});
		System.out.println("map after replaceAll lambda expression = " + map);

	}

}

class MyBiFunction implements BiFunction<String, String, String> {

	@Override
	public String apply(String t, String u) {
		if (t != null)
			return t + u;
		else
			return u;
	}

}
