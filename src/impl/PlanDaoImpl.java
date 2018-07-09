package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.interceptor.ResetAbandonedTimerMBean;

import java.sql.PreparedStatement;
import java.sql.Statement;

import dao.PlanDao;
import model.Plan;
import util.C3P0;

public class PlanDaoImpl implements PlanDao {

	@Override
	public boolean addPlan(Plan plan) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;	
		int i = 0; //判断sql语句是否成功执行
		System.out.println(plan.toString());	
		try {
			connection = C3P0.getConnection();
			//不插入id  因为id为自增的
			String sql = "insert into t_plan(name,content,time,sign,syspara_id,personnel_id,type_id) values(?,?,?,?,?,?,?)";
			ps = (PreparedStatement) connection.prepareStatement(sql);		
			ps.setString(1, plan.getName());
			ps.setString(2, plan.getContent());
			ps.setString(3, plan.getTime());
			ps.setString(4, plan.getSign());
			ps.setInt(5, plan.getSyspara_id());
			ps.setInt(6, plan.getPersonnel_id());
			ps.setInt(7, plan.getType_id());
	//		ps.setInt(8, plan.getId());
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			C3P0.close(connection);		
		}
		if(i==0){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public boolean deletePlan(Plan plan) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;		
		System.out.println(plan.toString());
		int i = 0;
		try {
			connection = C3P0.getConnection();
			String sql = "delete from t_plan where id =?";
			ps = (PreparedStatement) connection.prepareStatement(sql);	
			ps.setInt(1, plan.getId());
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			C3P0.close(connection);
		}
		if(i==0){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public boolean updatePlan(Plan plan) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;		
		System.out.println(plan.toString());
		int i = 0;
		try {
			connection = C3P0.getConnection();
			String sql = "update t_plan set name=?,content=?,time=?,sign=?,syspara_id=?,personnel_id=?,type_id=? where id=?";
			ps = (PreparedStatement) connection.prepareStatement(sql);	
			ps.setString(1, plan.getName());
			ps.setString(2, plan.getContent());
			ps.setString(3, plan.getTime());
			ps.setString(4, plan.getSign());
			ps.setInt(5, plan.getSyspara_id());
			ps.setInt(6, plan.getPersonnel_id());
			ps.setInt(7, plan.getType_id());
			ps.setInt(8, plan.getId());
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			C3P0.close(connection);
		}
		if(i==0){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public List<Plan> queryPlan(Plan plan) throws SQLException {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	
	
}
