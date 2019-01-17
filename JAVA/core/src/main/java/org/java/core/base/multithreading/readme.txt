Java Thread dump is list of all the threads active in the JVM.
Java Thread dump�����л�Ծ��JVM�е��̵߳��б�.

Java thread dump is very helpful in analyzing bottlenecks 
in the application and deadlock situations.
Java thread dump��һ���ǳ����õ��ڷ���Ӧ�õ�ƿ���Լ��������ε�ʱ��.

Here we will learn multiple ways through 
which we can generate thread dump for a java program. 
These instructions are valid for *nix operating 
systems but in windows the steps might be little different.
�������ǽ���ѧ���ܶ��ַ�ʽ��ͨ����Щ��ʽ���ǿ�������thread dumpΪһ��java����
��Щ�������*nix����ϵͳ����Ч�ģ����Ƕ���windows����Щ�����п��ܲ�ͬ.

VisualVM Profiler: If you are analyzing application for slowness, 
you must use a profiler. We can generate thread dump for 
any process using VisualVM profiler very easily. 
You just need to right click on the running process 
and click on ��Thread Dump�� option to generate it.
��������ڷ���Ӧ�ó�������ԭ�������ʹ��һ���������� ���ǿ���Ϊ�κεĽ�����VisualVM�������ǳ����׵������߳�dump
��ֻ���Ҽ������������еĽ��̼��ɣ���������Thread Dump��ѡ������������

jstack: Java comes with jstack tool through which 
we can generate thread dump for a java process. 
This is a two step process.

	Find out the PID of the java process using ps -eaf | grep java command

	Run jstack tool as jstack PID to generate the thread 
	dump output to console, you can append thread dump output 
	to file using command ��jstack PID >> mydumps.tdump��

We can use kill -3 PID command to generate the thread dump. 
This is slightly different from other ways to generate thread dump.
When kill command is issued, thread dump is generated to the System 
out of the program. So if it��s a java program with console as system
out, the thread dump will get printed on the console. If the java 
program is a Tomcat server with system out as catalina.out, then 
thread dump will be generated in the file.

Java 8 has introduced jcmd utility. You should use this instead of 
jstack if you are on Java 8 or higher. Command to generate 
thread dump using jcmd is jcmd PID Thread.print.
Above are four different ways to generate thread dump in 
java. Usually I prefer jstack or jcmd command to generate 
thread dump and analyze. Note that whatever way you choose, 
thread dump will always be the same.

Thread dump is the list of all the threads, every 
entry shows information about thread which includes following in the order of appearance.

Thread Name: Name of the Thread
Thread Priority: Priority of the thread
Thread ID: Represents the unique ID of the Thread
Thread Status: Provides the current thread state, for 
example RUNNABLE, WAITING, BLOCKED. While analyzing 
deadlock look for the blocked threads and resources 
on which they are trying to acquire lock.

Thread callstack: Provides the vital stack information 
for the thread. This is the place where we can see the 
locks obtained by Thread and if it��s waiting for any lock.