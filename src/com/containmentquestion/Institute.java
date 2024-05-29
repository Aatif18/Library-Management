package com.containmentquestion;

public class Institute {
	
	private int institudeid;
	private String institudename;
	Branch b;
	Subject s;
	Topic t;
	SubTopic st;
	Question q;
	
	/*
	 * public Institute(int institudeid, String institudename, Branch b, Subject s,
	 * Topic t, SubTopic st, Question q) { super(); this.institudeid = institudeid;
	 * this.institudename = institudename; this.b = b; this.s = s; this.t = t;
	 * this.st = st; this.q = q;
	 * 
	 * }
	 */
	public int getInstitudeid() {
		return institudeid;
	}
	public void setInstitudeid(int institudeid) {
		this.institudeid = institudeid;
	}
	public String getInstitudename() {
		return institudename;
	}
	public void setInstitudename(String institudename) {
		this.institudename = institudename;
	}
	public Branch getB() {
		return b;
	}
	public void setB(Branch b) {
		this.b = b;
	}
	public Subject getS() {
		return s;
	}
	public void setS(Subject s) {
		this.s = s;
	}
	public Topic getT() {
		return t;
	}
	public void setT(Topic t) {
		this.t = t;
	}
	public SubTopic getSt() {
		return st;
	}
	public void setSt(SubTopic st) {
		this.st = st;
	}
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	@Override
	public String toString() {
		return "Institute [institudeid=" + institudeid + ", institudename=" + institudename + ", b=" + b + ", s=" + s
				+ ", t=" + t + ", st=" + st + ", q=" + q + "]";
	}
	

}
