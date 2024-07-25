package com.tnsif.collections;

public class Student 
{
	private int rollno;
	private String name;
	private int per;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public Student(int rollno, String name, int per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}
	

}
