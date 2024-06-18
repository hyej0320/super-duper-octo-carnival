package database.dbpool;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection implements Closeable { // 닫을 수 있다는 인터페이스 추가
	Connection conn;
	boolean using;
	
	// 새로운 연결이 생길 때 url, 아이디, 비밀번호를 전달
	public MyConnection(String url, String user, String password) {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	// 이 연결이 사용중인지 확인하는 메서드
	public void use() {
		using = true;
	}
	
	public void release() {
		using = false;
	}
	
	public boolean check() {
		return using;
	}
	
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}

	@Override
	public void close() throws IOException {
		using = false;
	}
}
