package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			Connection conn = null;		
			conn = C3P0.getConnection();
			String sql = " select * from `t_test` ";

			PreparedStatement ps = conn.prepareStatement(sql);
		
			
			ResultSet rs = ps.executeQuery();
			
			//执行查询方法，并获取返回结果集
//			ResultSet rs = stat.executeQuery(sql);
			//打印结果
			while( rs.next() ){
				
				System.out.println(rs.getInt("id") ); 
				System.out.println(rs.getString("name") );
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
