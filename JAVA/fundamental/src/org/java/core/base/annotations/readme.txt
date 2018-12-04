Annotations(��ע����)

�˽�Javaע���Լ�ʹ��ע�͵ĺô��� Demo������java����ע�ͣ���δ����Զ���ע�ͣ�
Ԫע���Լ��������ʹ��Reflection API�������ע�͡�

(ע����Java���ṩ�˴������Ϣ��Javaע�������ע��Ĵ���û��ֱ�ӵ�Ӱ��.)

we will look into following:

1. (ע���÷��Լ���ô�÷���ȥ����ע��)
2. Annotations��Java1.5������,now it��s heavily used (����ʹ��)in Java EE
frameworks like Hibernate, Jersey, Spring.

For example, in Jersey webservice we add PATH annotation 
with URI string to a method and at runtime jersey parses 
it to determine the method to invoke for given URI pattern.

���磬��Jersey webservice�У����ǽ�����URI�ַ�����PATHע����ӵ������У�
��������ʱjersey��������ȷ��Ϊ����URIģʽ���õķ�����

3. Javaע����Ƕ���ڳ����ڲ��Ĺ��ڳ����metadata(Ԫ����)
4. (����ͨ��ע��������߻��߱���������)
5. (���ǿ���ָ��ע��ֻ�ڱ���ʱ���û���ֱ������ʱ����)
6. Annotations metadata can be available at runtime too and annotation 
parsers can use it to determine the process flow.
ע��Ԫ����Ҳ����������ʱ��ÿ��ã�ע���������������ȥ������������

Java Custom Annotation

Creating custom annotation in java is similar to writing 
an interface(����ע����Java��������дһ���ӿ�), except that 
it interface keyword is prefixed 
with @ symbol. We can declare methods in annotation.
���ǿ�����ע��������������

Some important points about java annotations are:

1. Annotation methods can��t have parameters.(ע�ⷽ�������в���)
2. Annotation methods return types are limited to primitives, 
3. String, Enums, Annotation or array of these.
ע�ⷽ���ķ������ͱ�������ԭ�����ͣ��ַ�����ö�٣�ע�⣬����

����: WebSevelet�е����String���Ƿ�������
public @interface WebServlet {
    
    /**
     * The name of the servlet
     */
    String name() default "";
}

4. Java Annotation methods can have default values. (Javaע�ⷽ��������Ĭ��ֵ)

5. Annotations can have meta annotations attached to them. (ע����Ը���Ԫע��)

6. Meta annotations are used to provide information about the annotation.
(Ԫע���������ṩ����ע�����Ϣ,Ҳ����Ԫע����ע���ע��)

7. Meta Annotations In Java

(There are four types of meta annotations������4�����͵�Ԫע��)

	A. @Documented �C indicates that elements using this annotation
	should be documented by javadoc and similar tools.
	��ʾʹ�ô���ע��Ԫ��Ӧ��javadoc�����ƹ��߼�¼��
	
	This type should be used to annotate the declarations of types whose 
	annotations affect the use of annotated elements by their clients. 
	������Ӧ����ע�����͵���������ע���Ӱ����ͻ��˶Դ�ע��Ԫ�ص�ʹ��
	
	If a type declaration is annotated with Documented, ���ʹ��Documentedע��һ����������
	,its annotations become part of the public API of the annotated elements.
	����ע�ͽ���Ϊ��ע��Ԫ�صĹ���API��һ���֡�
	
	B. @Target �C indicates the kinds of program element to which an annotation 
	type is applicable. ��ʾע���������õĳ���Ԫ�ص�����. 
	
	Some possible values are TYPE, METHOD, CONSTRUCTOR,FIELD etc. 
	If Target meta-annotation is not present, 
	then annotation can be used on any program element.
	���Ŀ��Ԫע�ⲻ���ڣ��������κγ�����ʹ��ע��

	C. @Inherited �C indicates that an annotation type is automatically
	inherited.��ʾ�Զ��̳�ע�����͡�
	
	If user queries the annotation type on a class 
	declaration,and the class declaration has no annotation for this type,
	 then the class��s superclass will automatically be 
	queried for the annotation type.
	 ���ע�����������д���InheritedԪע�ͣ������û����������ϲ�ѯע�����ͣ�
	 ����������û�д����͵�ע�ͣ����Զ���ѯ��ĳ����Ի�ȡע�����͡�

	This process will be repeated until an annotation for this type is found, 
	������̽����ظ���ֱ�������͵�ע�ⱻ�ҵ�
	or the top of the class hierarchy (Object) is reached.
	�ﵽ���νṹ(����)�Ķ���.

	D. @Retention �C indicates how long annotations with the 
	annotated type are to be retained(��ʾ��ע�����͵�ע�ⱻ�����೤ʱ��). It takes RetentionPolicy 
	argument whose Possible values are SOURCE, CLASS and RUNTIME.
	(����ҪRetentionPolicy�����������ֵΪSOURCE��CLASS��RUNTIME)


Built-in annotations in Java(Java���ڽ���ע��)

Java Provides three built-in annotations.
(Java�ṩ��3���ڽ�ע��)

	1. @Override,���������ע��֪ͨ�������������ڸ��Ǹ���ķ���.���Ե����෽����ɾ�����߱��ı��ʱ�򣬱���������չʾ������Ϣ
	2. @Deprecated, �������ñ�����֪�����������ʱ�ˣ�������ʹ���ˣ�����Ӧ���ṩΪʲô
	���������ʱ�Լ�����������ȥʹ�õ������Ϣ
	3. @SuppressWarnings,���ֻ�Ǹ��߱���������ĳЩ���棬

	