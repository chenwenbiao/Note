package org.java.core.advanced.DesignPatterns.creational.factory;

/**
 * �������ģʽ�е�super class�����ǽӿڣ����������ͨ��java�ࡣ
 *
 */
public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString() {
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
