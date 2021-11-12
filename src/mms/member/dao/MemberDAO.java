package mms.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		
		String sql = "insert into members values(member_id_seq.nextval, ?, ?, ?, ?, ?)";

		try {
			getInstance();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newMember.getName());
			pstmt.setString(2, newMember.getAddr());
			pstmt.setString(3, newMember.getNation());
			pstmt.setString(4, newMember.getEmail());
			pstmt.setInt(5, newMember.getAge());
			// sql ����
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
		getInstance();
		ArrayList<Member> list = new ArrayList<>(); // ��ü ���� ����
		String sql = null;
		ResultSet rs = null;

		try {
			sql = "SELECT * FROM mms_member";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // SELECT

			// rs.next(): ù��° ���ڵ�� �̵�
			// rs.next(): �ι�° ���ڵ�� �̵�
			// rs.next(): ����° ���ڵ�� �̵�
			while (rs.next() == true) {
				Member vo = new Member();

				// vo ��ü�� ���� �����մϴ�.
				// ���ڵ�(rs) ---> ��ü�� ��ȯ(vo)

				vo.setId(rs.getInt(1));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setEmail(rs.getString("email"));
				vo.setNation(rs.getString("nation"));
				vo.setAge(rs.getInt("age"));
				// �÷��� ���� ����� vo ��ü�� ArrayList�� ����
				list.add(vo);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(rs);
		}
		return list;
	}

	public Member selectOldMember(String name) {
		Member vo = new Member();
		String sql = "SELECT * from mms_member where name = ? order by id";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				vo.setId(rs.getInt(1));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setEmail(rs.getString("email"));
				vo.setNation(rs.getString("nation"));
				vo.setAge(rs.getInt("age"));
			}
			
		} catch (SQLException e) {
			
		}
		
		return vo;
	}

	public int updateMember(Member updateMember) {
		int cnt = 0;
		getInstance();
		PreparedStatement pstmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE MEMBER ");  //������ ���뿡 �߰� ���� (�ӵ� ������)
		sql.append("SET nation = ?, "); //�̷��� �ڿ� ��ĭ�� �پ�ߴ�
		sql.append("addr = ?, ");
		sql.append("email = ?, ");
		sql.append("age = ?");
		sql.append("WHERE name = ? ");
		
		//System.out.println(sql);
		
		try {
			pstmt = con.prepareStatement(sql.toString());  //��� ����Ʈ���� �ڵ������� �ȵǼ� �ڿ� �߰�.
			//pstmt = conn.prepareStatement(sql); //String sql �ϰ��
			pstmt.setString(1,updateMember.getNation());
			pstmt.setString(2, updateMember.getAddr());
			pstmt.setString(3, updateMember.getEmail());
			pstmt.setInt(4, updateMember.getAge());
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		return cnt;
	}

	public int deleteMember(String name) {
		int result = 0;
		getInstance();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM MMS_MEMBER \r\n" + 
				"WHERE name = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,name);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con);
			JdbcUtil.close(pstmt);
		}
		return result;
	}

}
