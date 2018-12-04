package org.java.core.base.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * ��ע��MethodInfo��4�����͵�Ԫע��
 * @Target ��ʾMethodInfo���ע�����õĳ���Ԫ�ص�������: method(����).
 * 
 * 
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
	// author�ֶ���String���ͣ�Ĭ��ֵxzj
	String author() default "xzj";
	String date();
	// revision�ֶ���int���ͣ�Ĭ��ֵ��1
	int revision() default 2;
	// comments�ֶ���String���ͣ�û��Ĭ��ֵ,���Դ��ֶ���ʹ�õ�ʱ�򲻿�ȱʧ
	String comments();
}
