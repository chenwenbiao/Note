package org.java.core.base.generics;

import java.util.List;

/**
 * Java Generic Classes and Subtyping(������)
 * 
 *  ���ǿ�  �Է������ӿڽ��������ͻ�  ͨ��extends��implementing����
 * 
 *  ArrayList<E> implements List<E> that extends Collection<E>,
 *  ���ArrayList <String>��List <String>�������ͣ�
 * List <String>��Collection <String>�������͡�
 *
 * List <String>�������Ϳ�����MyList <String��Object>��MyList <String��Integer>�ȵȡ�
 * @param <E>
 * @param <T>
 */
interface MyList<E, T> extends List<E>{

}
