package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J03_DBPractice {

	/*
	 	(1) 관리자 계정으로 DB에 새 계정을 추가한다
	 	
	 	(2) 관리자 계정으로 새 계정에 권한을 부여한다
	 	
	 	(3) 해당 계정에 새 테이블을 추가한다
	 		(기본키로 시퀀스를 사용해야 함, 제약조건을 종류별로 모두 사용해야 한다)
	 		
	 	(4) 프로그램에서 스캐너로 데이터를 입력하면 DB에 행이 추가되어야 한다
	 	
	 	(5) 콘솔에서 여태까지 추가된 모든 행을 조회할 수 있어야 한다
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("채소이름, 수량, 가격 입력 > ");

		String vegName = sc.next();
		int vegQty = sc.nextInt();
		int vegPrice = sc.nextInt();
		
		String driverPath = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "testuser";
		String password = "1234";
		
		try {
			Class.forName(driverPath);
			System.out.println("드라이버 로드 성공!!!!!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 접속 실패;;;;;");
		}
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
		){
			String sqlInsert = "INSERT INTO vegetables VALUES(vegetables_seq.nextval, ?, ?, ?)";
			
			try(
				PreparedStatement pstmt1 = conn.prepareStatement(sqlInsert);
			){
				pstmt1.setString(1, vegName);
				pstmt1.setInt(2, vegQty);
				pstmt1.setInt(3, vegPrice);
				
				int row = pstmt1.executeUpdate();
				System.out.printf("%d행이 추가되었음!\n", row);
				
//				String sql = "SELECT rpad((TO_CHAR)veg_id, 10, ' ') AS \"veg_id\", "
//						+ "rpad(veg_name, 15, ' ') AS \"veg_name\", "
//						+ "rpad((TO_CHAR)qty, 10, ' ') AS \"qty\", "
//						+ "rpad((TO_CHAR)price, 15, ' ') AS \"price\" "
//						+ "FROM vegetables";
				
				String sql = "SELECT * FROM vegetables";
				
				try(
					PreparedStatement pstmt2 = conn.prepareStatement(sql);
					ResultSet rs = pstmt2.executeQuery();	
				){
					while(rs.next()) {
						System.out.printf("%d\t%s\t%d\t%d\n",
								rs.getInt("veg_id"),
								rs.getString("veg_name"),
								rs.getInt("qty"),
								rs.getInt("price"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
