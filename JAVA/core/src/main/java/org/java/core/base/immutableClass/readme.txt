�������ǽ�ѧϰ�����java�д������ɱ��ࡣ ���ɱ��������״̬�ڳ�ʼ���󲻻���ĵ�ʵ���� 
���磬String��һ�����ɱ��࣬һ��ʵ��������ֵ��Զ����ı䡣

���ɱ��������ڻ���Ŀ�ģ���Ϊ������Ҫ����ֵ�ı仯��
���ɱ���������ô�������������̰߳�ȫ�ģ������ڶ��̻߳������㲻��Ҫ�����̰߳�ȫ��

Ҫ��java�д������ɱ��࣬����ִ�����²���:

1. ��������Ϊfinal��������Ͳ����Ա���չ��(Declare the class as final so it can't be extended.)
2. �������ֶ���Ϊ˽�У��Ա㲻����ֱ�ӷ��ʡ�(Make all fields private so that direct access is not allowed.)
3. ��ҪΪ�����ṩsetter����(Don't provide setter methods for variables.)
4. ʹ���пɱ��ֶγ�Ϊ�����ֶΣ��Ա�����ֵֻ�ܷ���һ�Ρ�(Make all mutable fields final so that it��s value can be assigned only once.)
5. ͨ��ִ����㸴�ƵĹ��캯����ʼ�������ֶΡ�(Initialize all the fields via a constructor performing deep copy.)
6. ��getter������ִ�п�¡�����Է��ظ����������Ƿ���ʵ�ʵĶ������á�
(Perform cloning of objects in the getter methods to return a copy 
rather than returning the actual object reference.)

Ϊ������4��͵�5�㣬����������һ���������õ�ʾ��Final�࣬����ʵ�����󲻻����ֵ��

