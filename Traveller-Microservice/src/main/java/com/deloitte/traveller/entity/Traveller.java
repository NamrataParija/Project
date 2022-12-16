package com.deloitte.traveller.entity;

public class Traveller {
	private Integer tid;
	private String tname;
	private String tcity;
	public Traveller(Integer tid, String tname, String tcity) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tcity = tcity;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTcity() {
		return tcity;
	}
	public void setTcity(String tcity) {
		this.tcity = tcity;
	}

	
	public Traveller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}



