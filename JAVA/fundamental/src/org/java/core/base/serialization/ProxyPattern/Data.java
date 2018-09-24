package org.java.core.base.serialization.ProxyPattern;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Both Data and DataProxy class should implement Serializable interface.
 * Data��DataProxy��Ӧ��ʵ�����л��ӿ�<p><br>
 * DataProxy should be able to maintain the state of Data object.
 * DataProxyӦ�ÿ���ά��Data object��״̬<br><p>
 * DataProxy is inner private static class, so that other classes can��t access it.
 * DataProxy���ڲ�˽�о�̬�࣬��������಻���Է�����<br><p>
 * DataProxy should have a single constructor that takes Data as argument.
 * DataProxyӦ����һ������������������Data��Ϊ����<p><br>
 * Data class should provide writeReplace() method returning DataProxy instance. 
 * So when Data object is serialized, the returned stream is of DataProxy class. 
 * However DataProxy class is not visible outside, so it can��t be used directly.
 * Data��Ӧ���ṩ����DataProxyʵ����writeReplace���������� ��ˣ������л�Data����ʱ��
 * ���ص�����DataProxy�ࡣ ����DataProxy�����ⲿ���ɼ�������޷�ֱ��ʹ�á�<p><br>
 * DataProxy class should implement readResolve() method returning 
 * Data object. So when Data class is deserialized, internally DataProxy 
 * is deserialized and when it��s readResolve() method is called, we get Data object.
 * DataProxy��Ӧ��ʵ�ַ���Data�����readResolve���������� ��ˣ��������л�Data��ʱ��
 * �ڲ�DataProxy�������л���������readResolve��������ʱ�����ǵõ�Data����
 * <p><br>
 * Finally implement readObject() method in Data class and 
 * throw InvalidObjectException to avoid hackers attack trying to 
 * fabricate Data object stream and parse it.
 * �����Data����ʵ��readObject�����������׳�InvalidObjectException
 * �Ա���ڿ͹�����ͼ����Data����������������
 */
public class Data implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3853778866644741701L;

	private String data;
	
	public Data(String d){
		this.data=d;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString(){
		return "Data{data=" + data + "}";
	}
	
	//serialization proxy class
	private static class DataProxy implements Serializable{
		
		private static final long serialVersionUID = 8333905273185436744L;
		
		private String dataProxy;
		private static final String PREFIX = "ABC";
		private static final String SUFFIX = "DEFG";
		
		public DataProxy(Data d){
			//obscuring data for security
			this.dataProxy = PREFIX + d.data + SUFFIX;
		}
		
		private Object readResolve() throws InvalidObjectException {
			if(dataProxy.startsWith(PREFIX) && dataProxy.endsWith(SUFFIX))
				return new Data(dataProxy.substring(3, dataProxy.length() -4));
			else 
				throw new InvalidObjectException("data corrupted");
		}
	}
	
	//replacing serialized object to DataProxy object
	private Object writeReplace(){
		return new DataProxy(this);
	}
	
	private void readObject(ObjectInputStream ois) throws InvalidObjectException{
		throw new InvalidObjectException("Proxy is not used, something fishy");
	}
}
