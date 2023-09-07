package com.telusko.springmvc.model;




public class Aliens {

	private int aid;
	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", aname=" + aname + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	private String aname;
	
}
