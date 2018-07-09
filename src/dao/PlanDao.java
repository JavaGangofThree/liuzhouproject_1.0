package dao;

import java.sql.SQLException;
import java.util.List;

import model.Plan;

public interface PlanDao {
	//增加
	public boolean addPlan(Plan plan)throws SQLException;
	//删除
	public boolean deletePlan(Plan plan)throws SQLException;
	//修改
	public boolean updatePlan(Plan plan)throws SQLException;
	//查询 
	public List<Plan> queryPlan(Plan plan)throws SQLException;
}
