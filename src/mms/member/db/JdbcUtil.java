package mms.member.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
	PreparedStatement pstmt;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		}
	}

	public static Connection getConnection() {
		// db 작업에 필요한 connection 객체를 생성해주는 메소드
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "javalink";
		String pw = "javalink";
		try {
			conn = DriverManager.getConnection(url, id, pw);
			return conn;
		} catch (SQLException e) {
		}
		return null;
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
