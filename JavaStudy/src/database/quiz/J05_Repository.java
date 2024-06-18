package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.Department;
import database.model.Employee;

public class J05_Repository {

	/*
		1. 도시 이름을 매개변수로 전달하면 해당 도시에서 근무하는 사원들의
	 	   모든 사원 정보와 부서 정보를 리스트 형태로 반환하는 메서드
	 	   (employees와 departments를 JOIN한 모든 정보)
	 	   
	 	2. 부서명을 매개변수로 전달하면 해당 부서의 모든 사원 정보와 직책 정보가
	 	   조회되는 메서드
	 	   (employees와 job를 JOIN한 모든 정보)
	 */
	
	private static DBConnector connector = new DBConnector("HR", "1234");
	
	public static void insertCity(String cityName) {
		List<Employee> employees = new ArrayList<>();
		List<Department> departments = new ArrayList<>();
		
		String sql = "SELECT * FROM employees "
				+ " INNER JOIN departments USING(department_id) "
				+ " INNER JOIN locations USING(location_id) WHERE city = ?";
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);	
		){
			pstmt.setString(1, cityName);
			
			try(
				ResultSet rs = pstmt.executeQuery();	
			){
				while(rs.next()) {
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertDepartmentName(String department) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
