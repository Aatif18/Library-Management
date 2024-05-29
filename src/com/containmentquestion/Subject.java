package com.containmentquestion;

public class Subject {
	 
	private int Subjectid;
	private String subjectname;

	/*
	 * public Subject(int subjectid, String subjectname) { super(); Subjectid =
	 * subjectid; this.subjectname = subjectname; }
	 */
	public int getSubjectid() {
		return Subjectid;
	}
	public void setSubjectid(int subjectid) {
		Subjectid = subjectid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	@Override
	public String toString() {
		return "Subject [Subjectid=" + Subjectid + ", subjectname=" + subjectname + "]";
	}
	
}
