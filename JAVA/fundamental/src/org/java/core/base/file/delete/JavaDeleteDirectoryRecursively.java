package org.java.core.base.file.delete;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Earlier we had to write recursion based code to delete a directory with
 * nested directories. But with Java 7, we can do this using Files class.
 * ֮ǰ���ǲ��ò���д���ڵݹ�Ĵ�����ɾ������Ƕ��Ŀ¼��Ŀ¼�� ����ʹ��Java 7�����ǿ���ʹ��Files������ɡ�
 *
 */
public class JavaDeleteDirectoryRecursively {

	public static void main(String[] args) throws IOException {

		Path directory = (Path) Paths.get("C:\\Users\\a\\Desktop\\test");
		Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) throws IOException {
				Files.delete(file); // this will work because it's always a File
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				Files.delete(dir); // this will work because Files in the directory are already deleted
				return FileVisitResult.CONTINUE;
			}
		});
	}
}
