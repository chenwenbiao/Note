Some of the rename operation behaviours are platform dependent. For example it might 
fail if you move a file from one filesystem to another or if a file already exists 
with the same name at destination directory.

һЩ���²�������Ϊ������������ƽ̨�ģ�����������һ���ļ�ϵͳ�ƶ�һ���ļ�����һ�������Ŀ���ļ������Ѿ�������
��ͬ�ļ������ļ������п��ܲ���ʧ��.

In Mac OS, if destination file already exists renameTo override the existing file with source file.

�ƶ��ļ���ͨ��renameTo��������ʵ�ֵġ� �ƶ��ļ�����ı��ļ����ݣ�ֻ��ı��ļ�Ŀ¼��λ�á� 
�ļ�����·���������ļ�����Ŀ¼��Ϣ��renameTo����Ҳ���Ը���Ŀ¼·�����Ӷ��ƶ��ļ���

����Ӧ��ʼ�ռ��renameTo����ֵ��ȷ���������ļ��ɹ�����Ϊ��������ƽ̨���������������ʧ���򲻻��׳�IO�쳣��