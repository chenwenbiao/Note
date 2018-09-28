package org.java.core.base.file.delete;

import java.io.File;

/**
 * This utility class can be used to delete 
 * folders recursively in java
 * <p><br>
 * ��������ǽ�ѧϰ����Եݹ鷽ʽɾ��java�еķǿ�Ŀ¼/�ļ��С� java.io.File delete����
 * ����ɾ����һ���ļ���һ����Ŀ¼�������Ŀ¼��Ϊ�գ���ɾ����������false��
 * ���ǽ��ݹ��ʹ��delete����������ɾ��java�����е�Ŀ¼/�ļ��С�
 */
public class DeleteFolderRecursively {
    public static void main(String[] args) {
        String folder = "C:\\Users\\a\\Desktop\\t";
        //delete folder recursively
        recursiveDelete(new File(folder));
    }
    
    public static void recursiveDelete(File file) {
        //to end the recursive loop
        if (!file.exists())
            return;
        
        //if directory, go inside and call recursively
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                //call recursively
                recursiveDelete(f);
            }
        }
        //call delete to delete files and empty directory
        file.delete();
        System.out.println("Deleted file/folder: "+file.getAbsolutePath());
    }
}
