package org.java.core.base.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
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
