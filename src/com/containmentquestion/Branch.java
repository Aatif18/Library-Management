package com.containmentquestion;

public class Branch {
	
	private int branchid;
	private String branchname;

	/*
	 * public Branch(int branchid, String branchname) { super(); this.branchid =
	 * branchid; this.branchname = branchname; }
	 */
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	@Override
	public String toString() {
		return "Branch [branchid=" + branchid + ", branchname=" + branchname + "]";
	}
	
}
