Serialization��JDK1.1�����룬��Java���ĵ���Ҫ�ص�֮һ.

Serialization��Java���������ǰ�һ������ת��������Ȼ������
�Ϳ���ͨ�����緢�ͻ��߰������浽�ļ����ߴ洢�����ݿ������Ա��Ժ�ʹ��.

Deserialization��һ��ת��������Ϊʵ�ʵĽ�Ҫ�ڳ�����ʹ�õ�Java�������.
Java�е����л����������������ʹ�ã�����������һЩ�򵥵İ�ȫ�Ժ����������⣬
���ǽ��ڱ��ĵĺ��沿�ֽ��ܡ�

�������Ҫһ����������л�����ֻ����ʵ��java.io.Serializable�ӿ�.
Serializable��Java����һ����ǽӿڣ�û���ֶλ��߷�����ʵ��.������һ��
ѡ��μӵ� ���̣�ͨ�������������ǵ������л�.

Serialization��Java������ObjectInputStream��ObjectOuputStreamʵ�֣�
����������Ҫ����һ����װ����װ���ǣ������ű��浽�ļ���ͨ�����緢��.

��̬����Ҳ���ᱻ���л�����Ϊ������������Ƕ���.
ʹ��transient�ؼ��ֿ��Բ����л�ĳһ����Ա����.

cmd���������������Ϊһ��ʵ��Serialiable����serialVersionUID:
serialver -classpath . com.journaldev.serialization.Employee(bin/�µ�����)

Note that it��s not required that the serial version is 
generated from this program itself, we can assign this 
value as we want. It just need to be there to let deserialization 
process know that the new class is the new version of the same 
class and should be deserialized of possible.
��ע�⣬�ó����Զ�����serial version id���Ǳ���ģ����ǿ����Զ���������������Ҫ��ֵ��
��ֻ���÷����л��Ĺ�����֪����������ͬ����°汾��Ӧ�ñ������л�������.

�������������3�иı䣺

1. Adding new variables to the class
����һ���µı�������
2. Changing the variables from transient to non-transient, 
for serialization it��s like having a new field.�ѱ�����transient���non-transient.�������л���������һ�����ֶ�
3. Changing the variable from static to non-static, 
for serialization it��s like having a new field.�ѱ����Ӿ�̬�ı�Ϊ�Ǿ�̬�ģ��������л���������һ�����ֶ�

But for all these changes to work, the java class should have serialVersionUID defined for the class
������Щ�ı�Ҫ��Ч��Java class����Ҫ��serialVersionID����������

 * �����Ѿ����������л���java�����Զ��ģ�������Ҫ���ľ���ʵ�����л��ӿڣ�
 * The implementation is present in the ObjectInputStream and ObjectOutputStream classes
 * ��ʵ�ִ�����ObjectInputStream��ObjectOutputStream�У��������������ı�����
 * ���ڱ������ݵķ�ʽ������������һЩ������Ϣ��object�У��ڱ���/����֮ǰ������Ҫ�����Ǽ���/���ܣ�
 * ������4�����������ṩ��ȥ�ı����л���Ϊ.������д�����Щ�������������������л�Ŀ��.
 
1. readObject(ObjectInputStream ois): If this method is present in the class, 
ObjectInputStream readObject() method will use this method for reading the object from stream.

2. writeObject(ObjectOutputStream oos): If this method is present in the class, 
ObjectOutputStream writeObject() method will use this method for writing the 
object to stream. One of the common usage is to obscure the object variables 
to maintain data integrity.

3. Object writeReplace(): If this method is present, then after serialization 
process this method is called and the object returned is serialized to the stream.

4. Object readResolve(): If this method is present, then after 
deserialization process, this method is called to return the final 
object to the caller program. One of the usage of this method is to 
implement Singleton pattern with Serialized classes. 
Read more at Serialization and Singleton.

Usually while implementing above methods, it��s kept as private 
so that subclasses can��t override them(���಻���Ը�������). They are meant for serialization 
purpose only and keeping them private avoids any security issue.(�����������л�Ŀ�Ķ��ѣ���������˽��
�����κΰ�ȫ����)