Java Heap Memory and Stack Memory(Java���ڴ��ջ�ڴ�):

Java Heap Space

Java ���ڴ����� java����ʱΪ�����JRE classes�����ڴ��ʱ��ʹ��,����ʲôʱ�����Ǵ����κζ���
�������ڶ��ڴ��б�������

�����ռ��ڶ��ڴ������У����ͷ�û���κ����õĶ���ʹ�õ��ڴ档�ڶѿռ��д������κζ��󶼾���ȫ�ַ���Ȩ�ޣ����Դ�Ӧ�ó�����κ�λ�����á�

Java Stack Memory

Java Stack Memory ����ִ���߳�, ���ǰ��������е��ض�ֵ,��Щֵ���������Ƕ��ݵ�(short-lived)�����������ڶ��ڴ��еĶ�������������ã�
��Щ��������ö����ڷ��������õġ�

Stack memory ������LIFO(����ȳ�)��˳�����ã�ÿ������һ������ʱ��������Stack Memory�д���һ���µĿ飬
�Ա�÷��� ���� locak primitive values(����ԭʼֵ) �� �ڷ������������������

ֻҪ���������������ͱ��û���õģ������Ŀռ������һ�������ͱ�ÿ��ã�Stack memory�Ĵ�С�����Heap Memory�Ƿǳ�С�ġ�
As soon as method ends, the block becomes unused and become available for next method.
Stack memory size is very less compared to Heap memory.


Difference between Java Heap Space and Stack Memory

1. Heap memory is used by all the parts of the application 
whereas stack memory is used only by one thread of execution.
heap memory��Ӧ�ó�������г����ã���stack memory����һ��ִ�е��߳���ʹ�á�

2. Whenever an object is created, it��s always stored in the Heap 
space and stack memory contains the reference to it. Stack memory only 
contains local primitive variables and reference variables to objects in heap space.
ÿ������һ�������ʱ�������Ǳ��洢��heap space�У�stack memory�а����˶��������á�
Stack memory�������˱���ԭʼֵ�����Լ���heap space�ж�������ñ���

3. Objects stored in the heap are globally accessible whereas 
stack memory can��t be accessed by other threads.
�洢��heap�еĶ����ǳ���ȫ�ַ��ʵģ�Ȼ��stack memory�����Ա������̷߳��ʣ�ֻ�ܱ�ִ������һ���̷߳��ʡ�

4. Memory management in stack is done in LIFO manner 
whereas it��s more complex in Heap memory because it��s used globally. 
Heap memory is divided into Young-Generation, Old-Generation etc, 
more details at Java Garbage Collection.
stack�е��ڴ����ʽ��LIFO(LAST IN FIRST OUT����ȳ�)��Ȼ������heap space�Ǹ��Ӹ��ӵģ���Ϊ����
���Ա�����ȫ�ַ��ʵģ�Heap memory���ֳ�������һ������һ���ȵȣ�����ϸ�ڿ�Java�����ռ���

5. Stack memory is short-lived whereas heap memory lives from 
the start till the end of application execution.
stack�ڴ��Ƕ����ģ�Ȼ��heap �ڴ��Ǵӳ���ʼ������ִ�н�����

6. We can use -Xms and -Xmx JVM option to define the startup size and 
maximum size of heap memory. We can use -Xss to define the stack memory size.
���ǿ�����-Xms ��-Xmx JVMѡ��ȥ����heap�ڴ�Ŀ�ʼ��С������С�����ǿ�����-Xssȥ����stack�ڴ�Ĵ�С.

7. When stack memory is full, Java runtime throws java.lang.StackOverFlowError 
whereas if heap memory is full, it throws java.lang.OutOfMemoryError: Java Heap Space error.
��stack�ڴ�����ʱ��Java����ʱ�׳�java.lang.StackOverFlowError ��Ȼ����heap memory����ʱ�򣬻��׳�
java.lang.OutOfMemoryError��java heap space error.

8. Stack memory size is very less when compared to Heap memory. 
Because of simplicity in memory allocation (LIFO), 
stack memory is very fast when compared to heap memory.
stack memory��С�����heap�ռ���Ƿǳ�С�ģ���ΪLIFO�ڴ����ļ򵥣�stack �ڴ������heap memory�ڴ��Ƿǳ����ٵġ�

9. That��s all for Java Heap Space vs Stack Memory in terms of 
java application, I hope it will clear your doubts regarding 
memory allocation when any java program is executed.



java.lang.OutOfMemoryError: Java heap space

java.lang.OutOfMemoryError is thrown when JVM is unable to allocate 
memory to create an object. Java OutOfMemoryError is an Error and occurs a runtime.
��JVM�޷������ڴ�����������ʱ���׳�java.lang.OutOfMemoryError��
 Java OutOfMemoryError��һ�����󣬷���������ʱ��

����������£������ռ����������Ƿ����ռ�ȥ���������Ҫ����˴����������java����ʱ�׳����쳣��

see more: https://www.journaldev.com/21010/java-lang-outofmemoryerror-java-heap-space