package org.java.core.base.jdbc.BatchProcessing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * �˷�����ʹ��Statement���ƣ���PreparedStatement�ṩ���������Ʋ�������SQLע�빥����
 *
 */
public class JDBCPreparedStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String query = "insert into Employee (empId, name) values (?,?)";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(query);
			
			long start = System.currentTimeMillis();
			for(int i =0; i<10000;i++){
				ps.setInt(1, i);
				ps.setString(2, "Name"+i);
				ps.executeUpdate();
			}
			System.out.println("Time Taken="+(System.currentTimeMillis()-start));
			
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
