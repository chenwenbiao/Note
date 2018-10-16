package org.java.core.base.collection.set;

import java.util.*;

/**
 * �����ַ����У����ǲ�ʹ���м�List����Array����Set��
 *  ���ȴ���һ���յ�HashSet��Ȼ��ʹ��Collections.addAll����������Ԫ�ظ��Ƶ�������Set�У�
 *
 */
public class ArrayToSet2 {
   public static void main(String[] args) {
		
	String[] vowels = {"a","e","i","o","u"};
		
	Set<String> vowelsSet = new HashSet<>();
	
	Collections.addAll(vowelsSet, vowels); 
	System.out.println(vowelsSet);

	/** 
	 * Unlike List, Set is NOt backed by array, 
	 * so we can do structural modification without any issues.
	 */
	vowelsSet.remove("e");
	System.out.println(vowelsSet);
	vowelsSet.clear();
	System.out.println(vowelsSet);
   }
}
