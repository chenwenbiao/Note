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
 * annotations usage and how to parse annotations using reflection
 * <p><br>
 * Annotations are introduced in Java 1.5 and now it��s 
 * heavily used (����ʹ��)in Java EE frameworks like Hibernate, Jersey, Spring.
 * Java Annotation is metadata about the program embedded 
 * in the program itself. It can be parsed by the annotation
 * parsing tool or by compiler. We can also specify annotation 
 * availability to either compile time only or till runtime also.
 * (Javaע����Ƕ���ڳ����ڲ��Ĺ��ڳ����Ԫ�ؾ�,������ͨ��ע��������߻��߱���������,���ǿ���ָ��ע���ڱ���ʱ���û���ֱ������ʱ����)
 * <p><br>
 * Java Custom Annotation
 * <p><br>
 * Creating custom annotation in java is similar to writing 
 * an interface(����ע����Java��������дһ���ӿ�), except that it interface keyword is prefixed 
 * with @ symbol. We can declare methods in annotation.
 * <p><br>
 * Some important points about java annotations are:
 * <p>
 * Annotation methods can��t have parameters.(ע�ⷽ�������в���)
 * Annotation methods return types are limited to primitives, String, Enums, Annotation or array of these.
 * (ע�ⷽ���ķ������ͱ�������ԭ�����ͣ��ַ�����ö�٣�ע�⣬����)<p><br>
 * Java Annotation methods can have default values.(Javaע�ⷽ��������Ĭ��ֵ)
 * <p><br>
 * Annotations can have meta annotations attached to them. (ע�Ϳ��Ը���Ԫע��)
 * Meta annotations are used to provide information about the annotation.
 * (Ԫע���������ṩ����ע�����Ϣ)
 * <p><br>
 * Meta Annotations In Java(There are four types of meta annotations)
 * <p><br>
 * @Documented �C indicates that elements using this annotation
 * should be documented by javadoc and similar tools(��ʾʹ�ô���ע��Ԫ��Ӧ��javadoc�����ƹ��߼�¼��).
 * This type should be used to annotate the declarations of types whose 
 * annotations affect the use of annotated elements by their 
 * clients. If a type declaration is annotated with Documented, 
 * its annotations become part of the public API of the annotated elements.
 * <p><br>
 * @Target �C indicates the kinds of program element to which an annotation 
 * type is applicable. Some possible values are TYPE, METHOD, CONSTRUCTOR,
 * FIELD etc. If Target meta-annotation is not present, then annotation
 * can be used on any program element.
 * <p><br>
 * @Inherited �C indicates that an annotation type is automatically
 * inherited. If user queries the annotation type on a class 
 * declaration, and the class declaration has no annotation for 
 * this type, then the class��s superclass will automatically be 
 * queried for the annotation type. This process will be repeated until an annotation for this type is found, or the top of the class hierarchy (Object) is reached.
 * <p><br>
 * @Retention �C indicates how long annotations with the 
 * annotated type are to be retained. It takes RetentionPolicy 
 * argument whose Possible values are SOURCE, CLASS and RUNTIME
 * <p><br>
 * Built-in annotations in Java
 * <p><br>
 * Java Provides three built-in annotations.
 * 
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
