package com.goldimaurya;

import java.util.Arrays;

public class SudentDemo {
	
	// create Object
	int rollNo;
	String name;
	// create Constructor
	public SudentDemo(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	// create bean / getter and setter 
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SudentDemo [rollNo=" + rollNo + ", name=" + name + "]";
	}	

}