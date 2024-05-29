package com.containmentquestion;

public class Topic {
	
	private int topicid;
	private String topicname;

	/*
	 * public Topic(int topicid, String topicname) { super(); this.topicid =
	 * topicid; this.topicname = topicname; }
	 */
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	@Override
	public String toString() {
		return "Topic [topicid=" + topicid + ", topicname=" + topicname + "]";
	}
	
	

}
