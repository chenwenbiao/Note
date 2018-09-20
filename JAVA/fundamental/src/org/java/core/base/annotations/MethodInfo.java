package org.java.core.base.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * Annotations in java provide information about the code. 
 * Java annotations have no direct effect on the code (ע����Java���ṩ�˴������Ϣ��Javaע�������ע��Ĵ���û��ֱ�ӵ�Ӱ��.)
 * they annotate. In java annotations tutorial, we will look into following:
 * <p><br>
 * annotations usage and how to parse annotations using reflection(ע���÷��Լ���ô�÷���ȥ����ע��)
 * <p><br>
 * Annotations are introduced in Java 1.5 and now it��s 
 * heavily used (����ʹ��)in Java EE frameworks like Hibernate, Jersey, Spring.
 * <br>
 * Java Annotation is metadata about the program embedded 
 * in the program itself. (Javaע����Ƕ���ڳ����ڲ��Ĺ��ڳ����Ԫ�ؾ�)
 * <br>
 * It can be parsed by the annotation
 * parsing tool or by compiler. (����ͨ��ע��������߻��߱���������)
 * <br>
 * We can also specify annotation availability to either compile time only or till runtime also.
 * (���ǿ���ָ��ע��ֻ�ڱ���ʱ���û���ֱ������ʱ����)
 * <p><br>
 * Annotations metadata can be available at runtime too and annotation 
 * parsers can use it to determine the process flow.
 * ע��Ԫ����Ҳ����������ʱ��ÿ��ã�ע���������������ȥ������������
 * <br>
 * For example, in Jersey webservice we add PATH annotation 
 * with URI string to a method and at runtime jersey parses it to determine 
 * the method to invoke for given URI pattern.
 * ���磬��Jersey webservice�У����ǽ�����URI�ַ�����PATHע����ӵ������У�
 * ��������ʱjersey��������ȷ��Ϊ����URIģʽ���õķ�����
 * <br>
 * Java Custom Annotation
 * <p><br>
 * Creating custom annotation in java is similar to writing 
 * an interface(����ע����Java��������дһ���ӿ�), except that it interface keyword is prefixed 
 * with @ symbol. We can declare methods in annotation.
 * <p><br>
 * Some important points about java annotations are:
 * <p>
 * 1. Annotation methods can��t have parameters.(ע�ⷽ�������в���)<br>
 * 2. Annotation methods return types are limited to primitives, 
 * String, Enums, Annotation or array of these.
 * (ע�ⷽ���ķ������ͱ�������ԭ�����ͣ��ַ�����ö�٣�ע�⣬����)<p><br>
 * 3. Java Annotation methods can have default values.(Javaע�ⷽ��������Ĭ��ֵ)
 * <p><br>
 * 4. Annotations can have meta annotations attached to them. (ע�Ϳ��Ը���Ԫע��)
 * Meta annotations are used to provide information about the annotation.
 * (Ԫע���������ṩ����ע�����Ϣ)
 * <p><br>
 * Meta Annotations In Java(There are four types of meta annotations������4�����͵�Ԫע��)
 * <p><br>
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
 * @Target �C indicates the kinds of program element to which an annotation 
 * type is applicable(��ʾע���������õĳ���Ԫ�ص����ࡣ). Some possible values are 
 * TYPE, METHOD, CONSTRUCTOR,FIELD etc. If Target meta-annotation is not present, 
 * then annotation can be used on any program element.���Ŀ��Ԫע�ⲻ���ڣ��������κγ�����ʹ��ע��
 * <p><br>
 * @Inherited �C indicates that an annotation type is automatically
 * inherited.��ʾ�Զ��̳�ע�����͡�
 * If user queries the annotation type on a class 
 * declaration,����û����������ϲ�ѯע������ and the class declaration has no annotation for 
 * this type����������û�д�����ע��, then the class��s superclass will automatically be 
 * queried for the annotation type(����ĳ��ཫ�Զ�����ѯ�Ի�ȡע������). 
 * This process will be repeated until an annotation for this type is found, ������̽����ظ���ֱ�������͵�ע�ⱻ�ҵ�
 * or the top of the class hierarchy (Object) is reached.(�ﵽ���νṹ(����)�Ķ���)
 * <p><br>
 * @Retention �C indicates how long annotations with the 
 * annotated type are to be retained(��ʾ��ע�����͵�ע�ⱻ�����೤ʱ��). It takes RetentionPolicy 
 * argument whose Possible values are SOURCE, CLASS and RUNTIME.( ����ҪRetentionPolicy�����������ֵΪSOURCE��CLASS��RUNTIME)
 * <p><br>
 * Built-in annotations in Java(Java���ڽ���ע��)
 * <p><br>
 * Java Provides three built-in annotations.(Java�ṩ��3���ڽ�ע��)<br>
 * 1. @Override,���������ע��֪ͨ�������������ڸ��Ǹ���ķ���.���Ե����෽����ɾ�����߱��ı��
 * ʱ�򣬱���������չʾ������Ϣ
 * 2. @Deprecated, �������ñ�����֪�����������ʱ�ˣ�������ʹ���ˣ�����Ӧ���ṩΪʲô
 * ���������ʱ�Լ�����������ȥʹ�õ������Ϣ
 * 3. @SuppressWarnings,���ֻ�Ǹ��߱���������ĳЩ���棬
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
	String author() default "Pankaj";
	String date();
	int revision() default 1;
	String comments();
}
