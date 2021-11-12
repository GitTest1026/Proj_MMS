package mms.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import mms.member.db.JdbcUtil;
import mms.member.vo.Member;

public class MemberDAO {
	Connection con;
	PreparedStatement pstmt;
	private static MemberDAO instance = new MemberDAO(JdbcUtil.getConnection());

	public MemberDAO(Connection con) {
		this.con = con;
	}

	public static MemberDAO getInstance() {
		return instance;
	}

	public int insertNewMember(Member newMember) {
		int result = 0;

		String sql = "insert into members values(?, ?, ?, ?, ?, ?)";

		try {
			getInstance();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, newMember.getId());
			pstmt.setString(2, newMember.getName());
			pstmt.setString(3, newMember.getAddr());
			pstmt.setString(4, newMember.getNation());
			pstmt.setString(5, newMember.getEmail());
			pstmt.setInt(6, newMember.getAge());
			// sql ½ÇÇà
			result = pstmt.executeUpdate(); // 1 or 0
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		return result;
	}

	public ArrayList<Member> selectMemberList() {

		return null;
	}

	public Member selectOldMember(String name) {
		return null;

	}

	public int updateMember(Member updateMember) {
		return 0;

	}

	public int deleteMember(String name) {
		return 0;

	}

}
