Some of the important points to remember about TreeMap in java are:

����ʵ��(Apart from implementing Map interface)Map�ӿ�֮�⣬
Java TreeMap��ʵ����NavigableMap�����ʵ����SortedMap�ӿڡ� 
TreeMap��extends��AbstractMap�ࡣ

public class TreeMap<K,V> extends AbstractMap<K,V>
implements NavigableMap<K,V>, Cloneable, java.io.Serializable{}

TreeMap��Ŀ����key����Ȼ˳������ �����ṩ��һ�����캯���������ṩ���������Comparator��
 ��ˣ������ʹ���κ�����Ϊ������ȷ����ʵ��Comparable�ӿ��Խ�����Ȼ����

Java TreeMap implementation����containsKey��get��put��remove������֤������
��log(n)��ʱ��ķѡ�

TreeMap��ͬ������˲����̰߳�ȫ�ġ� ���ڶ��̻߳�����
������ʹ��Collections.synchronizedSortedMap������ȡ��װͬ����

TreeMap methods to get keyset and values return Iterator that 
are fail-fast in nature, so any concurrent modification will 
throw ConcurrentModificationException.
get keyset and values��TreeMap��������Iterator�������ǹ��Ͽ��ٵģ�
����κβ����޸Ķ����׳�ConcurrentModificationException��

TreeMap in java doesn��t allow null keys, however you 
can have multiple null values associated with different keys.
java�е�TreeMap������ʹ��null�������������Խ����nullֵ�벻ͬ�ļ��������

TreeMap vs HashMap:

1. TreeMap��HashMap��ʵ����Map�ӿ�.
2. TreeMap��Ŀ��������Ȼ˳�����򣬶�HashMap�����κ�˳��洢��Ŀ��
3. TreeMap������ʹ��null���������ǿ�����HashMap��ʹ��һ���ռ���
4. ����TreeMap������ʽ�洢��Ŀ��������ڴ洢�ͼ�������ʱ��HashMap��һ�㡣
4. TreeMapʹ�û���Red-Black����NavigableMapʵ�֣���HashMapʹ��ɢ���㷨ʵ�֡�
5. TreeMapʵ����NavigableMap����������Ի��HashMap�в����ڵ�һЩ���⹦�ܡ�

��ʱ��Java��ʹ��TreeMap?

���������£�HashMap�����ڳ���������Mapʵ�֡� �����������һЩ��������ص�����Ҫ��
��ô�����ʹ��TreeMap��