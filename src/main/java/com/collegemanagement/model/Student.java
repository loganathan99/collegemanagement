package com.collegemanagement.model;

public class Student {
	private Integer id;
	private String name;
	private Long Mobile;
	private String mail;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return Mobile;
	}

	public void setMobile(Long mobile) {
		Mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student(Integer id, String name, Long mobile, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		Mobile = mobile;
		this.mail = mail;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Mobile=" + Mobile + ", mail=" + mail + ", password="
				+ password + "]";
	}
	

}
