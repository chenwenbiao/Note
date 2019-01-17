Java SortedMap is a Map ������key�����ȫ��������.

Java SortedMap���Ը����������Ȼ˳��(the natural ordering)��������
Ҳ�����ڴ���mapʱ�ṩComparator��

��������ڴ���SortedMapʱ���ṩ�κ�Comparator�����Comparator���Խ���
map��key������map��all key elements������ʵ��Comparable�ӿ���ȷ������

TreeMap -> NavigableMap -> SortedMap -> Map

���ݹ淶(As per the specification.)������ͨ�õ�sorted map implementation classedӦ�ṩ���±�׼���캯����

1. A void (no arguments) constructor: ��Ӧ�ô���һ���������(key)����Ȼ˳��(the natural ordering)���������ӳ�䡣
2. A constructor with an argument of type Comparator: ��Ӧ�ô���һ������sorted map����key����ָ���ıȽ���(Comparator)��������
3. A constructor with an argument of type Map:  It should create a sorted map with elements 
of provided map which is sorted according to the natural ordering of its keys.
4. A constructor with an argument of type SortedMap: It should behave as a copy 
constructor and create a new sorted map with the same elements and the same 
ordering of provided sorted map.
��Ӧ�ñ���Ϊ���ƹ��캯����������һ���µ�����Ԫ�أ����ṩ��ͬ��Ԫ�غ��ṩ������ӳ�����ͬ˳��

Of course, it��s impossible to enforce these recommendation as interfaces 
can��t specify constructors unlike methods.
(�ӿڲ����󷽷����� ָ��������)

��Map��ȣ��ṩ�˼��ֶ���ķ�������������:

Comparator comparator���������������ڵ�ͼ�жԼ���������ıȽ���ʵ�������������Ȼ˳��Լ����������򷵻�null��
Set <Map.Entry> entrySet���������ص�ͼ�а�����һ��ӳ�䡣
K firstKey���������ص�ͼ�еĵ�һ������ͣ�����
K lastKey���������ص�ͼ�е����һ������ߣ�����
Set keySet���������ذ�����ͼ���м���Set��
SortedMap headMap��K toKey�������ؼ�С��toKey�ĵ�ͼ���ֵ���ͼ��
SortedMap tailMap��K fromKey��������������ڻ����fromKey��ӳ�䲿�ֵ���ͼ��
Collection values���������ش�ӳ���а�����ֵ��Collection��ͼ��

Note that Set returned in above methods is a view of the actual Set. Changes done on these 
views are reflected on actual data structure as well.
��ע�⣬���������з��ص�Set��ʵ��Set����ͼ������Щ��ͼ�����ĸ���Ҳ�ᷴӳ��ʵ�����ݽṹ�С�