package mms.member.dao;

import java.sql.Connection;
import java.util.ArrayList;
import mms.member.vo.Member;

public class MemberDAO {
	Connection con;

	public MemberDAO(Connection con) {
		this.con = con;
	}

	public int insertNewMember(Member newMember) {
		String sql = "INSERT INTO member values(?,?,?,?,?,?)";
		return 0;
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
