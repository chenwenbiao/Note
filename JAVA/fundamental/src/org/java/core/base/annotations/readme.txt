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
(Ԫע���������ṩ����ע�����Ϣ)

7. Meta Annotations In Java(There are four types of meta annotations������4�����͵�Ԫע��)
 
 * 1. @Documented �C indicates that elements using this annotation
 * should be documented by javadoc and similar tools
 * (��ʾʹ�ô���ע��Ԫ��Ӧ��javadoc�����ƹ��߼�¼��)
 * This type should be used to annotate the declarations of types whose 
 * annotations affect the use of annotated elements by their 
 * clients. 
 * ������Ӧ����ע�����͵���������ע���Ӱ����ͻ��˶Դ�ע��Ԫ�ص�ʹ��
 * If a type declaration is annotated with Documented, ���ʹ��Documentedע��һ����������
 * its annotations become part of the public API of the annotated elements.
 * ����ע�ͽ���Ϊ��ע��Ԫ�صĹ���API��һ���֡�
 * <p><br>

