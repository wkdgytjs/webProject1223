package org.project.dto;

public class MemberDto {

	private String userId;
	private String userPw;
	private String gender;
	private String hobbys;
	private String hometown;
	private String memo;
	
	public MemberDto(String userId, String userPw, String gender, String hobbys, String hometown, String memo) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.gender = gender;
		this.hobbys = hobbys;
		this.hometown = hometown;
		this.memo = memo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbys() {
		return hobbys;
	}

	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
}
