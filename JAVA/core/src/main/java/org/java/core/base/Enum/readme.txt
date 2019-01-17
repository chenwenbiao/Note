Java Enum��Java 1.5����Ϊһ�����������룬���ֶ��ɹ̶��ĳ�������ɡ�
Java Enum was introduced in Java 1.5 as a new type whose fields consists of fixed set of constants. 

���ǿ��Դ���directions(����)ΪJava Enum�����й̶��ֶ�ΪEAST��WEST��NORTH��SOUTH��

 We will also learn using Java Enum valueOf, enum values, 
 EnumSet and EnumMap with examples.
 
 public abstract class Enum<E extends Enum<E>>
 implements Comparable<E>, Serializable {}

 Java enum�ؼ������ڴ���ö�����͡�
 
 �����ǿ���java enum��α�java���еĳ��泣���ֶθ��á�
 
 ������Java��Enums��һЩ��Ҫ�۵�:
 
1. ����java enum����ʽextends��java.lang.Enum�࣬Enum����չ��Object��
��ʵ����Serializable��Comparable�ӿڡ��������ǲ�����ö������չ�κ��ࡣ
2. ����enum��һ���ؼ��֣����ǲ�����������������������com.java.enum������Ч�İ�����
3. Enum����ʵ�ֽӿڡ��������ö��ʾ����ʾ��������ʵ��Closeable�ӿڡ�
4. Enum���캯��ʼ����˽�еġ����Ըĳ�public���ԣ�����ʾ�Ƿ���only private is permitted.
5. �����޷�ʹ��new���������ö��ʵ����
6. ���ǿ�����java enum���������󷽷���Ȼ������ö���ֶζ�����ʵ�ֳ��󷽷���������������У�getDetail�����ǳ��󷽷�������ö���ֶζ�ʵ��������
7. ���ǿ�����ö���ж���һ��������ö���ֶ�Ҳ���Ը������ǡ����磬toString����������ö�ٺ�ö���ֶ��ж��壬START�Ѹ�������
8. Javaö���ֶξ��������ռ䣬����ֻ�ܽ�ö���ֶ�������һ��ʹ�ã���ThreadStates.START
9. ö�ٿ�����switch�����ʹ��
10. ���ǿ�����չ���е�ö�ٶ������ƻ��κ����еĹ��ܡ� ���磬���ǿ�����ThreadStatesö�������һ�����ֶ�NEW��������Ӱ���κ����й��ܡ�
11. ����ö���ֶ��ǳ��������java best practice����block letters and underscore for spaces����ʾ�ո� ����EAST��WEST��EAST_DIRECTION�ȡ�
12. ö�ٳ�������ʽ��̬(static)�����յ�(final)
13. ö�ٳ��������յģ������ı�����Ȼ���Ըı䡣 ���磬���ǿ���ʹ��setPriority��������������ö�ٳ��������ȼ�
14. ����ö�ٳ��������յģ����ǿ���ʹ�á�==����equals����������ȫ�رȽ����ǡ� ���߶�������ͬ�Ľ����

Java Enum����˵��:

1. 