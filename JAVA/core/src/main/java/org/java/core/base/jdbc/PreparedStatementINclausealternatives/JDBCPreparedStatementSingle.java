package org.java.core.base.jdbc.PreparedStatementINclausealternatives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPreparedStatementSingle {

	private static final String QUERY = "select empid, name from Employee where empid = ?";
	
	public static void printData(int[] ids){
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(QUERY);
			
			// ִ�ж�ε�executeQuery��ѯ,��ѯ10����¼����ִ��10��
			
			// �����ܼ򵥣����ٶȺ�������Ϊ�����100����������ô��������100�����ݿ���á� 
			// �⽫����100��ResultSet������Щ����ʹϵͳ���أ����һ��ᵼ�������½��� ���Բ��Ƽ����ַ�����
			for(int empid : ids){
				ps.setInt(1, empid);
				rs = ps.executeQuery();
				
				while(rs.next()){
					System.out.println("Employee ID="+rs.getInt("empid")+", Name="+rs.getString("name"));
				}
				
				//close the resultset here
				try{
					rs.close();
				} catch(SQLException e){}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
