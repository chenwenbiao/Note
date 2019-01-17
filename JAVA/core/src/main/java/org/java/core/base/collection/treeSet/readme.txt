Java TreeSet �� java.util.SortedSet�����е�ʵ��.

SortedSet ��һ���ӿڣ��� extends java.util.Set. 
Java Sorted Set ���������е�Ԫ������

public class TreeSet<E> extends AbstractSet<E>
implements NavigableSet<E>, Cloneable, java.io.Serializable{}

public interface NavigableSet<E> extends SortedSet<E> {}

public interface SortedSet<E> extends Set<E> {}

public interface Set<E> extends Collection<E> {}

public interface Collection<E> extends Iterable<E> {}

In other words.�����ǵ���TreeSet��ʱ�����ǿ����ڴ���˳������ݣ�
Java TreeSetԪ�ذ�����Ȼ˳�����򣬻������ǿ����ڴ���SortedSetʱ�ṩComparator��
���������set�����ڼ䲻�ṩ�ض���Comparator����Ԫ�ر���ʵ��Comparable��ȷ����Ȼ���� 

���ݹ淶����������ʵ����Ӧ�ṩ4�����͵Ĺ��캯����
As per specification, all sorted set implementation 
classes should provide 4 types of constructors.

A void (no arguments) constructor:����Ӧ�ô���һ������Ԫ�ص���Ȼ˳����������򼯡�
A constructor with an argument of type Comparator:����Ӧ�ô���һ�������ṩ��Comparator��������򼯡�
A constructor with an argument of type Collection����Ӧ�ô���һ�������ṩ����Ԫ�ص����򼯺ϣ��ü��ϸ���Ԫ�ص���Ȼ˳������
A constructor with an argument of type SortedSet:����Ӧ�ñ���Ϊ���ƹ��캯������ʹ����ͬ��Ԫ�غ��ṩ�����򼯵���ͬ˳�򴴽��µ����򼯡�

���ҵ���interface����contains constructors.û���κη��� ǿ����Щ�Ƽ�.
there isn't any way to enforce these recommendations.

Java SortedSet����:

��Set��ȣ�SortedSet�϶�����һЩ�������Ȩ����Ϊ�����������ʡ�
�����������Ѿ��µ�������������Set�ӿڵļ̳з���֮�⣬�����ṩ��һЩ����������

Comparator<? super E> comparator()���������ڶԼ����е�Ԫ�ؽ�������ıȽ���ʵ�������Ԫ�ذ�����Ȼ˳�������򷵻�null��
SortedSet <E> subSet��E fromElement��E toElement�������ظ�����Χ�Ĵ˼��ϵ�һ���֡� ��fromElement�ǰ����Եģ���toElement�Ƕ�ռ�ģ�����ע�⣬�������Ӽ�����ͼ����ˣ��Է��ؼ�ִ�еĸ��Ľ���ӳ��ʵ�ʼ��С�
SortedSet <E> headSet��E toElement�������ش�set�Ĳ�����ͼ����Ԫ���ϸ�С��toElement��
SortedSet <E> tailSet��E fromElement�������ش�set�Ĳ�����ͼ����Ԫ�ش��ڻ����fromElement��
E first���������ؼ�����ǡ���Ǽ��������Ԫ�صĵ�һ��Ԫ�ء�
E last���������ؼ��������һ��Ԫ�أ���ǡ���Ǽ����е����Ԫ�ء�