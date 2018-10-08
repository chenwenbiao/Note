һ����һЩJava Lock API����Ҫ�Ľӿں��ࣺ

Lock(is a interface):
��������£�����ʹ��synchronized�ؼ��־Ϳ����ˣ�������һЩȱ�㵼��
Java Concurrency��������Lock�� Java 1.5 Concurrency 
API�ṩ�˴���Lock�ӿڵ�java.util.concurrent.locks����һЩʵ�������Ľ�Object�������ơ�

Condition(is a interface):
Condition����ʼ����Lock���󴴽���һЩ��Ҫ�ķ�����await()��������wait(),
signal()��signalAll()��������notify������notifyAll����������

ReadWriteLock(is a interface)��
������һ�Թ���������һ������ֻ����������һ������д�롣
ֻҪû��д����̣߳������������ɶ����ȡ���߳�ͬʱ���С�д���Ƕ�ռ�ġ�

ReentrantLock:(is a class):
��㷺ʹ�õ�Lock�ӿڵ�ʵ���࣬��������synchronized�ؼ������Ƶķ�ʽʵ��Lock�ӿڡ�
����Lock�ӿ�ʵ��֮�⣬ReentrantLock������һЩʵ�ó��򷽷�����ȡ���������̣߳��̵߳ȴ���ȡ���ȡ�

synchronized�鱾�����ǿ������(reentrant)�������һ���߳������˼���������
������һ��ͬ������Ҫ������ͬһ�����������ϣ����߳̿��Խ���ô���顣
����Ϊ���������ΪReentrantLock��ԭ��.

Java Lock vs synchronized:

1. Java Lock APIΪ�����ṩ�˸���Ŀɼ��Ժ�ѡ�
�������߳̿������������ڵصȴ�������ͬ�������ǿ���ʹ��tryLock������ȷ���߳̽��ȴ��ض�ʱ�䡣
2. Synchronization code������������ά������ʹ��Lock���ǲ��ò�
ʹ��try-finally����ȷ����ʹ��lock������unlock������������֮���׳��쳣Ҳ���ͷ�Lock��
3. synchronization blocks or methodsֻ�ܸ���һ�ַ�����
�����ǿ�����һ�������л�ȡ������ʹ��Lock API����һ���������ͷ�����
4. synchronized keyword���ṩ��ƽ�ԣ������ǿ����ڴ���
ReentrantLock����ʱ����ƽ������Ϊtrue���Ա���ȴ����߳����Ȼ������
���ǿ���ΪLock������ͬ����������ͬ���߳̿�����Բ�ͬ�������ȴ����������磬����Ƕ��̣߳����Բ��õȴ���
�����д�߳̾���Ҫ�ȴ���