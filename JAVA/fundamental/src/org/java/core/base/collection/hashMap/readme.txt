Java HashMap��java�����ܻ�ӭ��Collection��֮һ�� 
Java HashMap�ǻ���Hash table��ʵ�֡� Java�е�HashMap extends��AbstractMap��,
AbstractMapʵ����Map interface.

Java��HashMap��һЩ��Ҫ�۵��ǣ�

Java HashMap����null����nullֵ��
HashMap�������򼯺ϡ�������ͨ��keys set����HashMap��Ŀ(entries)��
������֤���ǰ���������ӵ�HashMap��˳��
HashMap������Hashtable���ƣ�ֻ������ͬ��������null����ֵ��
HashMapʹ������inner class Node<K,V>���洢map entries.

HashMap stores entries into multiple singly linked lists, 
called buckets or bins. Default number of bins 
is 16 and it��s always power of 2.

HashMap��get��put�����ļ�ʹ��hashCode������equals����������
����HashMap�ؼ�����Ӧ���ṩ��Щ����������ʵ�֡�����ǲ��ɱ�����ʺϼ���ԭ��
����String��Interger��

Java HashMap�����̰߳�ȫ�ģ����ڶ��̻߳�����
��Ӧ��ʹ��ConcurrentHashMap���ʹ��
Collections.synchronizedMap����������ȡͬ��ӳ�䡣

Java HashMap�ṩ���ĸ����캯����

public HashMap��������õ�HashMap���캯���� 
�˹��캯��������һ���յ�HashMap����Ĭ�ϳ�ʼ����Ϊ16����������Ϊ0.75��

public HashMap��int initialCapacity������HashMap���캯������ָ����ʼ������0.75�������ӡ� 
�����֪��Ҫ�洢��HashMap�е�ӳ����������ڱ�������ɢ�зǳ����á�

public HashMap��int initialCapacity��float loadFactor�������HashMap���캯��������һ����
��ָ����ʼ�����ͼ������ӵĿ�HashMap�� ���֪��Ҫ��HashMap�д洢�����ӳ�����������ʹ�ô˷����� 
�ڳ�������£���Ӧ�ñ��������������Ϊ����ϵ��0.75�����ڿռ��ʱ��ɱ�֮��������õ�Ȩ�⡣

public HashMap��Map <��extends K����extends V> m��������һ��ӳ�䣬��ӳ����ָ����ӳ����ͬ����������Ϊ0.75

java��HashMap����Ҫ������

public void clear���������HashMap������ɾ������ӳ�䣬HashMap����Ϊ�ա�
public boolean containsKey��Object key���������Կ���ڣ���˷�������'true'�����򷵻�'false'��
public boolean containsValue��Object value�������ֵ���ڣ����HashMap��������true�����򷵻�false��
public Set <Map.Entry <K��V >> entrySet�������˷�������HashMapӳ���Set��ͼ����set��map֧�֣���˶�map�ĸ��Ľ���ӳ��set�У���֮��Ȼ��
public V get��Object key��������ӳ�䵽ָ������ֵ�����û�м���ӳ�䣬�򷵻�null��
public boolean isEmpty��������������ڼ�ֵӳ�䣬�򷵻�true��ʵ�ó��򷽷���
public Set <K> keySet���������ش�ӳ���а����ļ���Set��ͼ���ü��ɵ�ͼ֧�֣���˶Ե�ͼ�ĸ��Ľ���ӳ�ڼ��У���֮��Ȼ��
public V put��K key��V value������ָ��ֵ���ӳ���е�ָ��������������ӳ����ǰ��������ӳ�䣬���滻��ֵ��
public void putAll��Map <��extends K����extends V> m������ָ����ͼ�е�����ӳ�临�Ƶ��˵�ͼ����Щӳ�佫�滻��ӳ��Ե�ǰλ��ָ��ӳ���е��κμ����κ�ӳ�䡣
public V remove��Object key�����Ӵ�ӳ�����Ƴ�ָ������ӳ�䣨������ڣ���
public int size���������ش�ӳ���м� - ֵӳ���������
public Collection <V> values���������ش�ӳ���а�����ֵ��Collection��ͼ���ü����ɵ�ͼ֧�֣���˶Ե�ͼ�ĸ��Ľ���ӳ�ڼ����У���֮��Ȼ��


There are many new methods in HashMap introduced in Java 8��

public V computeIfAbsent��K key��Function <��super K����extends V> mappingFunction�������ָ���ļ���δ��ֵ��������ӳ��Ϊnull������˷�������ʹ�ø�����ӳ�������ֵ��������������HashMap������Null��
public V computeIfPresent��K key��BiFunction <��super K����super V����extends V> remappingFunction�������ָ������ֵ������Ϊ��null�����Լ�����������䵱ǰ������ӳ��ӳ��ֵ��
public V compute��K key��BiFunction <��super K����super V����extends V> remappingFunction������HashMap�������Լ���ָ�������䵱ǰӳ��ֵ��ӳ�䡣
public void forEach��BiConsumer <��super K����super V> action�����˷���Ϊ��ӳ���е�ÿ����Ŀִ�и���������
public V getOrDefault��Object key��V defaultValue������get��ͬ�������δ�ҵ�ָ������ӳ�䣬�򷵻�defaultValue��
public V merge��K key��V value��BiFunction <��super V����super V����extends V> remappingFunction�������ָ���ļ���δ��ֵ��������null�����������������non���� - ��ֵ�����򣬽����ֵ�滻Ϊ������ӳ�亯���Ľ��������������Ϊnull��ɾ����
public V putIfAbsent��K key��V value�������ָ���ļ���δ��ֵ���������ӳ��Ϊnull�������������ֵ�����������null�����򷵻ص�ǰֵ��
public boolean remove��Object key��Object value��������ָ������ǰӳ�䵽ָ��ֵʱ��ɾ������Ŀ��
public boolean replace��K key��V oldValue��V newValue��������ǰӳ�䵽ָ��ֵʱ���滻ָ��������Ŀ��
public V replace��K key��V value��������ָ������ǰӳ�䵽ĳ��ֵʱ�����滻�ü���
public void replaceAll��BiFunction <��super K����super V����extends V> function������ÿ����Ŀ��ֵ�滻Ϊ�ڸ���Ŀ�ϵ��ø��������Ľ����

How HashMap works in java?

java�е�HashMapʹ������inner class Node<K��V>���洢ӳ��mappings.
HashMapʹ��ɢ���㷨������key��ʹ��hashCode������equals������������get��put������

HashMapʹ�õ��������洢Ԫ�أ���ЩԪ�س�Ϊbin��buckets�������ǵ���put����ʱ��
key��hashCode����ȷ���洢ӳ��(storing the mappings)�Ĵ洢��(buckets)��

һ��ʶ���Ͱ(buckets or �洢��)��hashCode�����ڼ���Ƿ��Ѵ��ھ�����ͬhashCode��key��
������ھ�����ͬhashCode������key������key��ʹ��equals����������
���equals����true���򸲸�value��
���򽫶Դ˵������б�Ͱ(bucket)������ӳ�䡣���û�о�����ͬhashCode��key����ӳ����뵽Ͱ�С�

����HashMap get�������ٴ�ʹ��key��hashCode��ȷ��Ҫ����ֵ�Ĵ洢Ͱ(�洢��)(bucket)��
ʶ����洢Ͱ�󣬱�����Ŀ��ʹ��hashCode��equals�����ҳ�Entry������ҵ�ƥ�䣬�򷵻�ֵ�����򷵻�null��

���и���������漰������ɢ���㷨�Ի�ȡ��Կ������ӳ��ӳ��ȵȡ����Ƕ������ǵĹ�����
ֻ���סHashMap������Key�Ϲ�����������Ҫ���õ�hashCodeʵ�ֺ�equals�����Ա��ⲻ��Ҫ����Ϊ��

