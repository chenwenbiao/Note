package org.java.core.advanced.DesignPatterns.structural.adapter;

/**
 *  ǽ���ϵĲ���
 */
public class Socket {
	
	public Volt getVolt() {
		return new Volt(120);
	}
	
}
