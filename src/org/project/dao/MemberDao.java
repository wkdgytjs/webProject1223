package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.project.dbconnect.DBConnect;

public class MemberDao {

	public static class SingleTon {
		public static final MemberDao INSTANCE = new MemberDao();
	}

	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int insertDo(String userId, String userPw, String gender, String hobbysArry, 
			String hometown, String memo) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			
			System.out.println(hobbysArry+" hobbysArry");
			
			conn = DBConnect.getConnection();
			query = "insert into login1222(userId,userPw,gender,hobbys,hometown,memo) values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, gender);
			pstm.setString(4, hobbysArry);
			pstm.setString(5, hometown);
			pstm.setString(6, memo);

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
