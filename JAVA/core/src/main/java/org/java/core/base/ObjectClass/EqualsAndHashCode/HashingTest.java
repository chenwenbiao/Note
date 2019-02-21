package org.java.core.base.ObjectClass.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

// ��ΪObject hashCode�����������ڲ��Ҵ洢Ͱ(bucket)�Բ���key��
// ���������޷�����HashMap�����������ٴδ�����Կ���������ݣ�
// �������ע�⵽��������Ĺ�ϣ��ֵ��ͬ������Ҳ���ֵ��

// ��������ʹ��eclipse���Դ������Զ�����equals������hashCode����
public class HashingTest {

	public static void main(String[] args) {
		Map<DataKey, Integer> hm = getAllData();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("xzj");
		System.out.println(dk.hashCode());

		Integer value = hm.get(dk);

		System.out.println(value);

	}

	private static Map<DataKey, Integer> getAllData() {
		Map<DataKey, Integer> hm = new HashMap<>();

		DataKey dk = new DataKey();
		dk.setId(1);
		dk.setName("xzj");
		System.out.println(dk.hashCode());

		hm.put(dk, 10);

		return hm;
	}

}