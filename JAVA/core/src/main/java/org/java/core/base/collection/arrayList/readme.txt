ArrayList��ʹ�����ļ����࣬

ArrayList�̳���AbstractList��AbstractList��һ��List�ӿڵĹǸ�ʵ�֣�Ҳ����ʵ����List�ӿڵĴ󲿷ַ���.

ArrayList�Ĵ�С��

	Java ArrayList��List�ӿڵĿɵ�����С������ʵ�֣�����ζ������Ĭ�ϴ�С��ʼ��
���ڽ�����������ӵ������б�ʱ�Զ�����.

��ȻArrayListҲimplements��List:
class ArrayList<E> extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, java.io.Serializable.

abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>.

һЩ��Ҫ�ķ�����:

1. Java ArrayList������Vector���ƣ�ֻ������ͬ��������ڵ��̻߳��������ܸ��á�
2. Java ArrayList�����̰߳�ȫ�ģ�����ڶ��̻߳�����ʹ��ʱ�����ر�С�ġ�
3. Java ArrayList���԰����ظ�ֵ����������null��ֵ��
4. java ArrayList�еĶ���˳����ӡ� ��ˣ���ʼ�տ���ͨ������0������һ������
5. Java ArrayListĬ����������Ϊ10.�������ǿ���ͨ�����Ĺ��캯����ͨ������ensureCapacity��int minCapacity������������Ĭ��������
6. Java ArrayList Iterator��ListIteratorʵ���ǿ���ʧ�ܵġ� �����iterator�������޸��б�ṹ, 
 ��ȥ�õ����������add��remove֮����κ�������ʽ�޸��б�ṹ������׳�ConcurrentModificationException��
7. Java ArrayList�ṩ����Ԫ�ص�������ʣ���Ϊ�������������� ���ǿ���ͨ���������������κ�Ԫ�ء�
8. Java ArrayList֧��Generics�����Ǵ���ArrayList���Ƽ�������
// List list = new ArrayList(); //not recommended
// List<String> list1 = new ArrayList<String>(); // recommended way

����3�й�����:
1. ArrayList(): ���ؿ��б��ҳ�ʼ����Ϊ10.
2. ArrayList(int initialCapacity):���ؿ��б��ҳ�ʼ����initialCapacity��
����֪���б��а����������ݲ���ϣ��ͨ���ṩ������ʼ��������ʡ���·���ʱ��ʱ���˹��캯���ǳ����á�
3. ArrayList(Collection<? extends E> c):��ArrayList���캯��������
���ϵĵ��������ص�˳�򷵻ذ���ָ������Ԫ�ص��б�

// Java ArrayList default constructor
List<String> vowels = new ArrayList<String>();

//Java ArrayList constructor with initial capacity
List<String> dictionaryWordsList = new ArrayList<String>(50000);

vowels.add("A");
vowels.add("B");
vowels.add("C");
vowels.add("D");
vowels.add("E");

//Creating my list from different collection source
List<String> myList = new ArrayList<String>(vowels);

	�̰߳�ȫ:
		
		Java ArrayList�����̰߳�ȫ�ġ� ��ˣ�������ڶ��̻߳����й�������ʹ������Ĵ�������ȡ�̰߳�ȫ��ArrayList:

List<Integer> synchronizedList = Collections.synchronizedList(ints);
