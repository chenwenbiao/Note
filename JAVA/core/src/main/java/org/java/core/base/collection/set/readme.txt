Java Set�ǲ������ظ�Ԫ�ص�Ԫ�أ�or ���󣩵ļ��ϡ�

 Java Set��һ����չCollection�ӿڵĽӿڡ� 
 ��List��ͬ��Java Set�������򼯺ϣ�����Ԫ��û���ض���˳�� 
 Java Set���ṩ�Կɲ���Ԫ�ص�λ�õĿ��ơ�
  ������ͨ����������Ԫ�أ�Ҳ�����������б��е�Ԫ�ء�

�й�Java Set��һЩ��Ҫ�۵㣺

	1. Java Set�ӿ���Java Collections Framework�ĳ�Ա��
	2. ��List��ͬ��Set����������ظ�Ԫ�ء�
	3. Set���������ֻ���һ��nullԪ�ء�
	4. Set�ӿ���Java 8����һ��Ĭ�Ϸ�����spliterator��
	5. ��List�����鲻ͬ��Set��֧������Ԫ�ص�������λ�á�
	6. Set֧�ַ��ͣ�����Ӧ������ʹ������  ʹ��Generics with Set��������ʱ����ClassCastException��
	7. ���ǿ���ʹ��Set�ӿ�ʵ����ά��ΨһԪ�ء�

	public interface Set<E> extends Collection<E>
	
	public interface Collection<E> extends Iterable<E>



1604/5000
Java Set�ӿ���չ��Collection�ӿڡ�Collection�ӿ���չ��Iterable�ӿڡ�
һЩ���õ�Setʵ������HashSet��LinkedHashSet��TreeSet��
CopyOnWriteArraySet��ConcurrentSkipListSet�� 
AbstractSet�ṩ��Set�ӿڵĹǸ�ʵ�֣��Լ���ʵ��Set�Ĺ�������

һЩ���õ�Java Set������

	int size��������ȡSet�е�Ԫ������
	boolean isEmpty���������Set�Ƿ�Ϊ�ա�
	boolean contains��Object o���������Set����ָ����Ԫ�أ��򷵻�true��
	Iterator iterator���������ش�set��Ԫ�صĵ�������Ԫ�ذ��ض�˳�򷵻ء�
	Object [] toArray���������ذ�����set������Ԫ�ص����顣�����set������������ص�Ԫ�ص�˳�������κα�֤����˷�����������ͬ��˳�򷵻�Ԫ�ء�
	boolean add��E e�������ָ����Ԫ���в����ڣ�������ӵ��ü����У���ѡ��������
	boolean remove��Object o����������ڣ���Ӹü������Ƴ�ָ����Ԫ�أ���ѡ��������
	boolean removeAll��Collection c�����Ӵ�set���Ƴ�ָ��collection�а���������Ԫ�أ���ѡ��������
	boolean retainAll��Collection c������������set�а�����ָ��collection�е�Ԫ�أ���ѡ��������
	void clear�������Ӽ�����ɾ������Ԫ�ء�
	Iterator iterator���������ش�set��Ԫ�صĵ�������

��Java SE 9���а��У�Oracle Corp��ΪSet�ӿ����һЩ���õ�ʵ�÷�����

