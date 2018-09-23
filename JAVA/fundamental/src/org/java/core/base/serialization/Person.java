package org.java.core.base.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * If you notice the java serialization process, 
 * it��s done automatically(�����Զ����). Sometimes we want to 
 * obscure the object data to maintain it��s integrity. 
 * We can do this by implementing java.io.Externalizable 
 * interface and provide implementation of writeExternal() 
 * and readExternal() methods to be used in serialization process.
 *  ��ʱ���������ض��������Ա����������ԡ� ���ǿ���ͨ��ʵ��java.io.Externalizable�ӿ���ʵ����һ�㣬
 *  ���ṩwriteExternal������readExternal����������ʵ�֣��Ա������л�������ʹ�á�
 * <p>
 * 
 */
public class Person implements Externalizable{

	private int id;
	private String name;
	private String gender;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name+"xyz");
		out.writeObject("abc"+gender);
	}

	//Notice that I have changed the field values before converting 
	//it to Stream and then while reading reversed the changes. 
	//In this way, we can maintain data integrity of some sorts. 
	//We can throw exception if after reading the stream data, 
	//the integrity checks fail. 
	//��ע�⣬�Ұ���ת������֮ǰ�ı����ֶε�ֵ����ȡ��ʱ���ַ�ת�˸��ģ�ͨ�����ַ�ʽ
	//���ǿ��Ա���ĳЩ���ݵ������ԣ�
	//So which one is better to be used for serialization in java. 
	//Actually it��s better to use Serializable interface and by 
	//the time we reach at the end of article, you will know why.
	//��ô��һ�����ʺ�����java�е����л��� ʵ�������ʹ��Serializable�ӿڣ������ǵ�����ĩβʱ�����֪��ԭ��
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		//read in the same order as written
		name = (String) in.readObject();
		if(!name.endsWith("xyz")){
			throw new IOException("corrupted data");
		}
		name = name.substring(0, name.length() - 3);
		gender = (String) in.readObject();
		if(!gender.startsWith("abc")){
			throw new IOException("corrupted data");
		}
		gender = gender.substring(3);
	}
	
	@Override
	public String toString(){
		return "Person{id=" + id + ",name=" + name + ",gender=" + gender + "}";
	}
	
}
