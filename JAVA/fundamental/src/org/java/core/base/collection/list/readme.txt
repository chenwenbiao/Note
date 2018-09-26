List��һ�����򼯺�,List��һ���ӿڣ��̳���Collection�ӿ�.(ע��interface�ڲ��ǿ���ʵ�ַ�����,��ȻҲ���Բ���ʵ��)

public interface List<E> extends Collection<E>{}

public interface Collection<E> extends Iterable<E> {}

public interface Iterable<T> {}

Some of the important points about Java List are:
1. Java List interface is a member of the Java Collections Framework.
2. List allows you to add duplicate elements.��������ظ�Ԫ��
3. List allows you to have ��null�� elements.������nullԪ��
4. List interface got many default methods in Java 8, for example replaceAll, sort and spliterator.
5. List indexes start from 0, just like arrays.
6. List supports Generics and we should use it whenever possible. 
Using Generics with List will avoid ClassCastException at runtime.��Generics��Listһ��ʹ�ý�������ʱ����ClassCastException��

�ʹ�õ�List��ʵ������: ArrayList, LinkedList, Vector, Stack, CopyOnWriteArrayList. 
AbstractList provides a skeletal implementation of the List interface to reduce the effort in implementing List.
AbstractList�ṩ��List�ӿڵĹǸ�ʵ�֣��Լ���ʵ��List�Ĺ�����������ArrayList��ֱ��extends AbstractList

Some of the useful Java List methods are�����õ�List����:

size(), isEmpty(), contains(Object o), iterator(), toArray(), add(), 
remove(Object o): Removes the first occurrence of the specified element from this list.
retainAll(Collection<?> c):Retains only the elements in this list that are contained in the specified collection.
ֻ���������list�е�Ԫ�أ���ЩԪ�ذ�����ָ���ļ�����.
clear(), get(int index),set(int index, E element), 
ListIterator<E> listIterator(): Returns a list iterator over the elements in the list.�����б���Ԫ�ص��б��������
List<E> subList(int fromIndex, int toIndex)

Java8Ĭ��ʵ�����⼸������: replaceAll, sort(), Spliterator

Most common operations performed on java list are add, remove, set, clear, size etc. 
��õĲ�����Java list��add��remove��set��clear�� size��.