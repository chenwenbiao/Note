package org.java.core.advanced.ValueOrReference;

public class Test {
	
	public static void main(String[] args) {

		//let��s assume that ��red�� is pointing to 50 and ��blue�� is pointing 
		//to 100 and these are the memory location of both Balloon objects.
		//50��100��2��������heap�ڴ��λ��
		
		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100
		
		swap(red, blue);
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());
		
		foo(blue);
		System.out.println("blue color="+blue.getColor());
		
	}

	private static void foo(Balloon balloon) { //baloon=100
		balloon.setColor("Red"); //baloon=100
		balloon = new Balloon("Green"); //baloon=200
		balloon.setColor("Blue"); //baloon = 200
	}

	//when we are calling swap() method, two new variables o1 and o2 
	//are created pointing to 50 and 100 respectively.
	//������ִ��swap������ʱ��2���µı���o1��o2�����������ҷֱ����ָ��50��100
	//the variables are just the reference to the objects,����ֻ�Ƕ��������,�ı�Ĳ��Ƕ�����
	//���Ǳ�������.
	// However we are passing a copy of the reference and hence it��s pass by value
	//���Ǵ��ݸ�swap��ֻ�����ñ������ѣ������ֵ����.
	
	//Generic swap method
	public static void swap(Object o1, Object o2){
		Object temp = o1; //temp=50, o1=50, o2=100
		o1=o2; //temp=50, o1=100, o2=100
		o2=temp; //temp=50, o1=100, o2=50
	}//method terminated
}
