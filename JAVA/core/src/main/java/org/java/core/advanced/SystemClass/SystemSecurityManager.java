package org.java.core.advanced.SystemClass;

public class SystemSecurityManager {
	
	//SecurityManager class is used to implement security policy for 
	//applications, System class provide useful methods to get SecurityManager 
	//for the currently running JVM and to set the SecurityManager for the application.
	
	//SecurityManager������ʵ��Ӧ�ó���İ�ȫ���ԣ�System���ṩ���õķ�������ȡ��
	//ǰ���е�JVM��SecurityManager��ΪӦ�ó�������SecurityManager��
	
	public static void main(String[] args) {
		SecurityManager secManager = System.getSecurityManager();
		if(secManager == null){
			System.out.println("SecurityManager is not configured");
		}
		SecurityManager mySecManager = new SecurityManager();
		System.setSecurityManager(mySecManager);
		secManager = System.getSecurityManager();
		if(secManager != null){
			System.out.println("SecurityManager is configured");
		}
	}
}
