��3�����еķ�ʽ��Java�д����ļ�:

1. File.createNewFile()

When we initialize File object, we provide the file name and then we can call 
createNewFile() method to create new file in Java.

File createNewFile() method returns true if new file is created and false if '
file already exists. This method also throws java.io.IOException when it��s not 
able to create the file. The files created is empty and of zero bytes.

When we create the File object by passing file name, it can be with absolute path, 
or we can only provide the file name or we can provide relative path.
�����Ǵ����ļ������������file name��ʱ���������Ǿ���·�����������ǿ���ֻ�ṩ�ļ������������ǿ����ṩ���·��.

For non-absolute path, File object tries to locate files in the project root directory. 
If we run the program from command line, for non-absolute path, File object tries to locate 
files from the current directory.
���ڷǾ���·�����ļ�����������Ŀ�ĸ�Ŀ¼��ȷ���ļ���λ�ã�������Ǵ� ���������г��򣬶��ڷǾ���·�����ļ�����Ὣ��ǰĿ¼��ȷ���ļ���λ��

While creating the file path, we should use System property file.separator to make our program platform independent.
�������ļ���ʱ������Ӧ��ʹ��ϵͳ���ļ��ָ������Ա������ƽ̨�������ǵĳ���

