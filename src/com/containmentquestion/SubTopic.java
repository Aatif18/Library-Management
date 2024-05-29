package com.containmentquestion;

public class SubTopic {
	
	private int subtopicid;
	private String subtopicname;

	/*
	 * public SubTopic(int subtopicid, String subtopicname) { super();
	 * this.subtopicid = subtopicid; this.subtopicname = subtopicname; }
	 */
	public int getSubtopicid() {
		return subtopicid;
	}
	public void setSubtopicid(int subtopicid) {
		this.subtopicid = subtopicid;
	}
	public String getSubtopicname() {
		return subtopicname;
	}
	public void setSubtopicname(String subtopicname) {
		this.subtopicname = subtopicname;
	}
	@Override
	public String toString() {
		return "SubTopic [subtopicid=" + subtopicid + ", subtopicname=" + subtopicname + "]";
	}
	
	
}
