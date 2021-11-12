package mms.member.vo;
/*
 * VO value Object : 데이터베이스 테이블 Member의 각 컬럼값 저장용 객체 : 한 행씩 정보를 저장
 * DTO : Data Transfer Object
 * DO : Domain Object
 * Entity
 * bean
 * 
 * VO : 
 * 1. 모든 필드는 반드시 private 이어야 함
 * 2. 기본 생성자와 매개변수가 있는 생성자를 만들어야 함
 * 3. 모든 필드에 대해서 getter, setter 만들어야 함
 * 4. 직렬화를 반드시 해야 함(입출력)
 * 
 * */
public class Member {
	private int id;
	private String name; // 식별값
	private String addr;
	private String nation;
	private String email;
	private int age;
	public Member() {}
	
	
	public Member(int id, String name, String addr, String nation, String email, int age) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String member = "name = " + getName() +", addr = " + getAddr() + ", email = " + getEmail() 
						+ ", nation = " + getNation() + ", age = " + getAge(); 
		return member;
	}
	
}
