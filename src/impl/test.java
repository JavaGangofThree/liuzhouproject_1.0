package impl;

import java.sql.SQLException;



import model.Plan;

public class test {

	public static void main(String[] args) throws SQLException {
		Plan plan = new Plan(2, "name", "content", "1997-06-06", "sign", 999,999,999);
			
		PlanDaoImpl planDaoImpl = new PlanDaoImpl();
		System.out.println(planDaoImpl.addPlan(plan));
		
	}
}
