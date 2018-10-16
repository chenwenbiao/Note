public interface Map<K,V>{}

Java Map��collections framework��һ���֡� 
Java Map�������ڴ洢��ֵӳ�䡣 Java Map���ܰ����ظ������������ظ�ֵ��

Java�����е�Mapʵ������HashMap��Hashtable��TreeMap��ConcurrentHashMap��LinkedHashMap��
AbstractMap���ṩ��Map�ӿڵĹǼ�ʵ�֣������Map��������չ��AbstractMap�ಢʵ��������ķ�����

����java��Map��һЩ��Ҫ�۵���:

Map provides three collection views �C set of keys, set of key-value mappings and collection of values.

Map�ṩ������������ͼ: ������ ��ֵӳ�伯�� ֵ���ϡ�

Map����֤ӳ���˳�򣬵���ȡ����ʵ�֡����磬HashMap����֤ӳ���˳��
��TreeMap�Ϳ��Ա�֤.

Mapʹ��hashCode��equals��������ȡ�ͷ��ò��������Կɱ��಻�ʺ�Map����
���hashCode��equals��ֵ��put֮�������ģ�����get�����н��޷������ȷ��ֵ��
��ΪMap�Ǹ���key��hashCode������value��λ�õģ����key��hashCode��equalsֵ�仯�ˣ�
����������λ��.

һЩ��Ҫ��Map����:

	int size���������ش�Map�м� - ֵӳ���������
	boolean isEmpty���������û��ӳ�䣬�򷵻�true�����򷵻�false��
	boolean containsValue��Object value�������������һ����ӳ�䵽ָ��ֵ���򷵻�true�����򷵻�false��
	V get��Object key��������ӳ�䵽��������ֵ�����û���ҵ�ӳ���򷵻�null��
	V put��K key��V value��������ֵ�Ե�ӳ����ӵ���ͼ�С�����Ѵ���ӳ�䵽�˼���ֵ�����滻��ֵ���˷���������key��������ǰֵ�����û��key��ӳ�䣬�򷵻�null��
	V remove��Object key�����Ӵ�ӳ����ɾ������ӳ�䣨������ڣ������ش�ӳ����ǰ��ü�������ֵ�����ӳ�䲻�����ü���ӳ�䣬�򷵻�null��
	void putAll��Map <��extends K����extends V> m������ָ��ӳ���е�����ӳ�临�Ƶ���ӳ�䡣
	void clear��������Map��ɾ������ӳ�䡣
	Set<K> keySet����������Map�����м���Set��ͼ���˼�����Map֧�֣���˶�Map���κ��޸Ķ�����ӳ����������֮��Ȼ��
	Collection <V> values����������Map������ֵ�ļ�����ͼ���˼�����Map֧�֣����Map�е��κθ��Ķ�����ӳ����ֵ���ϣ���֮��Ȼ��
	Set<Map.Entry <K��V >> entrySet����������Map��ӳ���Set��ͼ����Set��Map֧�֣����Map�е��κ��޸Ķ�����ӳ����Ŀ���У���֮��Ȼ��

��أ�StringBuffer��StringBuilder

Java 8�������Java Map�еķ�������: 

default V getOrDefault(Object key, V defaultValue): ������ָ����ӳ�䵽��ֵ�������ӳ�䲻��������ӳ�䣬�򷵻�defaultValue��
default void forEach��BiConsumer <��super K����super V> action�����Դ�ӳ���е�ÿ����Ŀִ�и���������
default void replaceAll��BiFunction <��super K����super V����extends V> function������ÿ����Ŀ��ֵ�滻Ϊ�ڸ���Ŀ�ϵ��ø��������Ľ����
default V putIfAbsent��K key��V value�������ָ���ļ���δ��ֵ��������ӳ��Ϊnull�������������ֵ����������null�����򷵻ص�ǰֵ��
default boolean remove��Object key��Object value��������ָ������ǰӳ�䵽ָ��ֵʱ��ɾ������Ŀ��
default boolean replace��K key��V oldValue��V newValue��������ǰӳ�䵽ָ��ֵʱ���滻ָ��������Ŀ��
default V replace(K key, V value): ����ָ������ǰӳ�䵽ĳ��ֵʱ�����滻�ü���
default V computeIfAbsent��K key��Function <��super K����extends V> mappingFunction�������ָ���ļ���δ��ֵ���������ӳ��Ϊnull��������ʹ�ø�����ӳ�亯��������ֵ����Ϊnull�������������ӳ�䡣
default V computeIfPresent��K key��BiFunction <��super K����super V����extends V> remappingFunction�������ָ������ֵ������Ϊ��null�����Լ�����������䵱ǰ������ӳ��ӳ��ֵ�������������null����ɾ��ӳ�䡣
default V compute��K key��BiFunction <��super K����super V����extends V> remappingFunction�������Լ���ָ�������䵱ǰӳ��ֵ��ӳ�䣨���û�е�ǰӳ�䣬��Ϊnull����
default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction):���ָ���ļ���δ��ֵ��������null����������������ķǹ��� - ��ֵ�����򣬽����ֵ�滻Ϊ������ӳ�亯���Ľ��������������Ϊnull��ɾ����

��أ�Java BlockingQueueʾ��

����ע�⵽Java 8 Map�ӿ�����ӵ������·������Ǵ���ʵ�ֵ�Ĭ�Ϸ�����
��������Ϊ��ȷ��ʵ��Map interfac���κ��඼���ᷢ���������