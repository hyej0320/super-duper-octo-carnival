package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.EmpDept;
import database.model.Employee;

public class J05_Repository_T {
	// 1.
	private static DBConnector connector = new DBConnector("HR", "1234");
	
	public static List<EmpDept> getEmployeesByCityname(String cityName) {
		List<EmpDept> list = new ArrayList<>();
		String sql = "SELECT "
				+ "employee_id, "
				+ "first_name, "
				+ "last_name, "
				+ "email, "
				+ "phone_number, "
				+ "hire_date, "
				+ "job_id, "
				+ "salary, "
				+ "commission_pct, "
				+ "employees.manager_id AS \"EMP_MANAGER_ID\", "
				+ "department_id, "
				+ "department_name, "
				+ "departments.manager_id AS \"DEPT_MANAGER_ID\", "
				+ "location_id "
				+ "FROM employees "
				+ "INNER JOIN departments USING(department_id) "
				+ "INNER JOIN locations USING(location_id) "
				+ "WHERE locations.city = ? ";
		
		try(
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, cityName);
			try (
				// 물음표를 채운 뒤 결과를 받아야 함
				ResultSet rs = pstmt.executeQuery();
			){
				while(rs.next()) {
					EmpDept empDept = new EmpDept(rs);
					list.add(empDept);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
	
		}		

		return list;
	}
	
	public static void main(String[] args) {
		for(EmpDept empDept : getEmployeesByCityname("Seattle")) {
			System.out.println(empDept);
		};
	}
}
