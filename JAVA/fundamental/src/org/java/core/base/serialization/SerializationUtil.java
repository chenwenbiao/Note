package org.java.core.base.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * A simple class with generic serialize and deserialize method implementations
 */
public class SerializationUtil {
	
	//deserialize to Object from given file
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
	
	//serialize the given object and save it to file.
	public static void serialize(Object obj, String fileName) throws IOException{
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oop = new ObjectOutputStream(fos);
		oop.writeObject(obj);
		oop.close();
	}
	//Notice that the method arguments work with Object that 
	//is the base class of any java object. It��s written in this way to be generic in nature.
	//ע�ⷽ������ʹ�õ���Object,���е���Ļ��඼��Object�����������ַ�ʽ��ͨ�õ�.
}
