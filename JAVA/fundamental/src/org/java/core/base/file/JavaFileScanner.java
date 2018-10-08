package org.java.core.base.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Java Scanner�������ʹ���κ�������ʽ�ָ���������ֽ⣬������Ҳ�����ڽ����ļ���
 * 
 * Scanner��չ��String��split()�Ĺ��ܣ����Խ��ֽ�Ŀ�ת��int��float��String��
 * long��������װ��
 *
 * ��ʹ��Scanner���ж�ȡ�ļ�������CSV�ļ�
 * 
 * ��Ҫ���������Ϊ�ض��������ͱ��ʱ����ʹ��java Scanner�ࡣ
 * Use java Scanner classes when you need to parse the input into specific datatype tokens.
 */
public class JavaFileScanner {
	
	public static String fileName = "C:\\Users\\a\\Desktop\\test\\progress.txt";
	public static String csvFile = "C:\\Users\\a\\Desktop\\test\\data.csv";

    public static void main(String[] args) throws IOException {
        /**
         *  My Name is Pankaj
         *  My website is journaldev.com
         *  Phone : 1234567890
         */
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path, StandardCharsets.UTF_8.toString());
        
        //read file line by line,���зָ�����Ϊ�ָ��
        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.print("System line separator: " + System.getProperty("line.separator"));
        while(scanner.hasNext()){
            System.out.println("Lines: "+scanner.next());
        }
        scanner.close();
        
        //read CSV Files and parse it to object array
        /**
         * Pankaj,28,Male
         * Lisa,30,Female
         * Mike,25,Male
         */
        scanner = new Scanner(Paths.get(csvFile));
        // �зָ���
        scanner.useDelimiter(System.getProperty("line.separator"));
        while(scanner.hasNext()){
            //parse line to get Emp Object
            Employee emp = parseCSVLine(scanner.next());
            System.out.println(emp.toString());
        }
        scanner.close();
        
        //read from system input
        System.out.println("Read from system input:");
        scanner = new Scanner(System.in);
        System.out.println("Input first word: "+scanner.next());
    }
    
    private static Employee parseCSVLine(String line) {
         Scanner scanner = new Scanner(line);
         // ��������ʽ�����ָ���
         scanner.useDelimiter("\\s*,\\s*");
         String name = scanner.next();
         int age = scanner.nextInt();
         String gender = scanner.next();
         JavaFileScanner jfs = new JavaFileScanner();
         scanner.close();
         return jfs.new Employee(name, age, gender);
    }

    public class Employee{
        private String name;
        private int age;
        private String gender;
        
        public Employee(String n, int a, String gen){
            this.name = n;
            this.age = a;
            this.gender = gen;
        }
        
        @Override
        public String toString(){
            return "Name="+this.name+"::Age="+this.age+"::Gender="+this.gender;
        }
    }

}
