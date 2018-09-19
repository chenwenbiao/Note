Java Heap��String Pool�ͷ�String Pool�Ĳ�����ɣ���ͼ:https://cdn.journaldev.com/wp-content/uploads/2012/11/String-Pool-Java1.png

A. Why String is immutable and final?

0. Why String is immutable in java is one of the popular interview question,
We know that String is immutable and final in java and java runtime maintains 
a String pool that makes it a special class.
Ϊʲô��Java��String�ǲ��ɱ�ģ�String��java����final�ģ����ɱ�ģ�Java����ʱά����һ��String Pool
ʹString��Ϊһ���������.

Let��s look at some benefits of String immutability, 
that will help in understanding why String is immutable in java.

1. String pool is possible (�ַ������ǿ��ܵ�)only because String is immutable in java(��ΪString��java���ǲ��ɱ��), 
this way Java Runtime saves a lot of java heap space(�ѿռ�) because different 
String variables can refer to same String variable in the pool. If String
would not have been immutable, then String interning would not have been 
possible(���String���ǲ��ɱ�ģ���ôString interning�Ͳ�����) because
if any variable would have changed the value, it would 
have been reflected to other variables also.

2. If String is not immutable then it would cause severe security 
threat to the application. For example, database username, password 
are passed as String to get database connection and in socket programming
 host and port details passed as String. Since String is immutable it��s 
 value can��t be changed otherwise any hacker could change the referenced 
 value to cause security issues in the application.
2.����ַ������ǲ��ɱ�ģ���������ص���в��Ӧ�õİ�ȫ�����磬
���ݿ��û���������ΪString�����Ի�ȡ���ݿ�����,�Լ����׽��ֱ���У������Ͷ˿ں���ϸ��Ϣ����Ϊ�ַ������ݵġ�
��Ϊ�ַ����ǲ��ɱ�ģ���������ֵ�ǲ����Ա��ı�ģ������κκڿ;Ϳ���ͨ���ı䱻���õ�ֵ�������Ӧ���еİ�ȫ����.

3.Since String is immutable, it is safe for multithreading and a 
single String instance can be shared across different threads. 
This avoid the usage of synchronization for thread safety, 
Strings are implicitly thread safe.
��Ϊ�ַ����ǲ��ɱ�ģ����ڶ��߳��ǰ�ȫ�ģ�һ���������ַ���ʵ�����Կ粻ͬ���̷߳��ʡ�
����ͱ�����Ϊ���̰߳�ȫʹ��ͬ�����ַ�������ʽ�̰߳�ȫ�ġ�

4. Strings are used in java classloader and immutability provides security 
that correct class is getting loaded by Classloader. For example, think 
of an instance where you are trying to load java.sql.Connection class 
but the referenced value is changed to myhacked.Connection class that 
can do unwanted things to your database.
�ַ�����Java���������ʹ�ã����ɱ����ṩ����ȷ���������ȷ�����صİ�ȫ���ϡ�������һ�������ڳ���
ȥ����java.sql.Connection���ʵ�����������õ�ֵ���ĳ�myhacked.Connection�࣬����
�����ݿ�ִ�в�����������.

5. ince String is immutable, its hashcode is cached at the time of creation 
and it doesn��t need to be calculated again. This makes it a great 
candidate for key in a Map and it��s processing is fast than other 
HashMap key objects. This is why String is mostly used Object as HashMap keys.
��ΪString�ǲ��ɱ�ģ�����hashcode���ڴ�����ʱ�򱻻��棬������Ҫ�ٴα����㣬String��ΪHashMap��key�������ٶȱ�����objects��Ϊkey�ٶ�
Ҫ��ܶ࣬�����Ϊʲô�ܶ�ʱ������ΪHashMap��key��

Above are some of the reasons I could think of that 
shows benefits of String immutability. It��s a great feature 
of Java String class and makes it special.

B. What is Java String Pool?(https://www.journaldev.com/797/what-is-java-string-pool)

As the name suggests, String Pool in java is a pool of Strings 
stored in Java Heap Memory. We know that String is special class
in java and we can create String object using new operator as well as 
providing values in double quotes.
��ͬ������չʾ�ģ�String Pool��Java���Ǵ洢��Java���ڴ����ַ�����,����֪��String��Java��
��������࣬���ǿ�����new�����������ַ�����Ҳ������˫���Ŵ���String

Here is a diagram which clearly explains how String Pool is maintained 
in java heap space and what happens when we use different ways to create Strings.

String Pool is possible only because String is immutable in Java �ַ����ǿ��ܵ�ֻ��ΪString
��java���ǲ��ɱ��.

String pool helps in saving a lot of space for Java Runtime 
although it takes more time to create the String.(�ַ�����Java����ʱ������ʡ
�˲��ٿռ䣬������Ҫ���Ѹ����ʱ��ȥ�����ַ���)

When we use double quotes to create a String, it first looks for String with same value 
in the String pool, if found it just returns the reference else 
it creates a new String in the pool and then returns the reference.
������˫���Ŵ����ַ�����ʱ�����Ȼ����ַ�����Ѱ��������ֵͬ���ַ����ҵ��ͷ�������ַ������ã��������
�ַ����д����µ��ַ��أ�Ȼ�󷵻�����ַ��ص�����.

However using new operator, we force String class to create a new 
String object in heap space. We can use intern() method to put it 
into the pool or refer to other String object from string pool having same value.
Ȼ����new������������ǿ���ڶ��ڴ��д����µ�String�������ǿ�����intern���������ŵ�pool�У�����
��������String pool��������ֵͬ�������ַ�����

Sometimes in java interview, you will be asked question around String pool. 
For example, how many string is getting created in below statement?
String str = new String("Cat");

In above statement, either 1 or 2 string will be created. If there is 
already a string literal ��Cat�� in the pool, then only one string ��str�� 
will be created in the heap. If there is no string literal ��Cat�� in the pool, 
then it will be first created in the pool and then in the heap space, so total 
2 string objects will be created.
�����������У�1������2�����ᱻ�����������pool���Ѿ���һ��Cat����ôֻ��һ��Cat����heap�д���
�����pool��û��Cat,��ô������Pool�д���Cat��Ȼ����heap�д���heap, str������heap�е�Cat.

Detailed explanation is �C(ϸ�ڽ���)
String pool is also part of heap.(String Pool��heap��һ����)
So the string will always be created in heap. 
But string may be or may not be created in pool.

String str = new String(��Cat��);

So in above sentence, if ��Cat�� is present in string pool, 
it will only be created in heap and will not be created in String pool.

But if it is not present in String pool it will be created 
in string pool as well as heap space (or we can say space apart from String pool)

Java String subSequence

ΪʲôStringʵ��subSequence����?
Java 1.4 introduced CharSequence interface and String implements this 
interface, this is the only reason for the implementation of subSequence
 method in String class. Internally it invokes the String substring method.
Java��1.4������CharSequence�ӿڣ�Stringʵ��������ӿڣ������Ψһ��ԭ����String��ʵ���������
�˷����ڲ�������substring����.

An invocation of this method of the form str.subSequence(begin, end) 
behaves in exactly the same way as the invocation of str.substring(begin, end).
str.subSequence(begin, end) �� str.substring(begin, end)Ч��һģһ��
���ۣ�

There is no benefit in using subSequence method, ideally you should
 always use String substring method.
 ʹ��subSequence����û���洦�����������Ӧ������ʹ��substring����.
