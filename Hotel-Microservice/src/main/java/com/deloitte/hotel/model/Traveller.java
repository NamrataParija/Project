package com.deloitte.hotel.model;

public class Traveller {
	private String tname;
	private Integer tid;
	private double troomno;

	public Integer gettid() {
		return tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public double getTroomno() {
		return troomno;
	}

	public void setTroomno(double troomno) {
		this.troomno = troomno;
	}

	public Traveller(String tname, Integer tid, double troomno) {
		super();
		this.tname = tname;
		this.tid = tid;
		this.troomno = troomno;
	}

	public Traveller() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
