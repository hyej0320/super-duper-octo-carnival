package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.Coffee;

public class J05_CRUD {

	/*
		1. 모든 커피 목록을 리스트 형태로 반환하는 메서드
		
		2. 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드 (LIKE)
		
		3. 새로운 커피를 추가하는 메서드 (SEQUENCE)
		
		4. 이미 존재하는 커피의 정보를 수정할 수 있는 메서드 (기본키는 수정 불가능)
		
		5. 커피ID를 매개변수로 전달받으면 해당 커피를 삭제하고 삭제 여부를 반환해주는 메서드
	 */
	private static DBConnector connector = new DBConnector("HR", "1234");
	
	public static List<Coffee> getCoffeeList() {
		List<Coffee> coffeeList = new ArrayList<>();
		String sql = "SELECT * FROM coffee ORDER BY c_id";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				Coffee cf1 = new Coffee(rs);
				coffeeList.add(cf1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Coffee coff : coffeeList) {
			System.out.println(coff);
		}
		return coffeeList;
	}
	
	public static List<Coffee> searchCoffeeName(String coffeeName) {
		List<Coffee> coffeeList2 = new ArrayList<>();
		String sql = "SELECT * FROM coffee WHERE c_name LIKE ? ";
		try (
				Connection conn = connector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				pstmt.setString(1, "%" +  coffeeName + "%");
			try(
				ResultSet rs = pstmt.executeQuery();	
			){
				while(rs.next()) {
					Coffee cf2 = new Coffee(rs);
					coffeeList2.add(cf2);					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return coffeeList2;
	}
	
	public static void insertNewCoffee(String coffeeName, int price) {
		String sql = "INSERT INTO coffee (c_id, c_name, price) "
				+ "VALUES(coffee_seq.nextval, ?, ?)";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, coffeeName);
			pstmt.setInt(2, price);
			
			int row = pstmt.executeUpdate();
			System.out.printf("새로운 메뉴 %d개 업데이트!\n", row);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateCoffeeInfo(String changeName, int changePrice, String existCoffee) {
		String sql = "UPDATE coffee SET c_name = ?, price = ? "
				+ "WHERE c_name = ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);		
		){
			pstmt.setString(1, changeName);
			pstmt.setInt(2, changePrice);
			pstmt.setString(3, existCoffee);
			
			int row = pstmt.executeUpdate();
			System.out.printf("%d행 업데이트(%s가 %s로 변경되었습니다)\n", 
					row, existCoffee, changeName);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean deleteCoffee(Coffee coffee) {
		String sql = "DELETE FROM coffee WHERE c_id = ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);		
		){
			pstmt.setInt(1, coffee.getC_id());
			
			int row = pstmt.executeUpdate();
			
			System.out.printf("%d행 삭제\n", row);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("---------- Coffee List ----------");
		getCoffeeList();
		System.out.println();
		
		System.out.println("---------- Search Coffee Name ----------");
		for(Coffee coff : searchCoffeeName("Ame")) {
			System.out.println(coff);
		}
		System.out.println();
		
		System.out.println("-----------Insert New Coffee -----------");
//		insertNewCoffee("Cortado", 2000);
//		getCoffeeList();
		System.out.println();
		
		System.out.println("-----------Update Coffee Information----------");
		updateCoffeeInfo("Cortado", 2300, "Cortado");
		getCoffeeList();
		System.out.println();
		
		System.out.println("-----------Delete Coffee ----------");
		getCoffeeList();
		System.out.println();
	}
}
