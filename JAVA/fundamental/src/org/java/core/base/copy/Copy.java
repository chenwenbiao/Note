package org.java.core.base.copy;

/**
 * ǳ�������������
 */
class Team implements Cloneable{
	
	public String name;
	
	public void setName(String name) { this.name = name;}
	
	public String getName() { return name; }
	
	/**
	 * ǳ����
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Player implements Cloneable{
	private String name;
	
	public void setName(String name) { this.name = name; }
	
	public String getName() { return name; }
	
	/**
	 * ���
	 */
	@Override
	public Object clone() {
		Object obj = null;
		
		return obj;
	}
}

public class Copy {
	
	public static void main(String[] args) {
		Team team = new Team();
		team.setName("lakers");
		
	}
}
