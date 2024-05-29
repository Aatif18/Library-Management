package com.containmentquestion;

public class Question {
	
	private int questionid;
	private String questionname;

	/*
	 * public Question(int questionid, String questionname) { super();
	 * this.questionid = questionid; this.questionname = questionname; }
	 */
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestionname() {
		return questionname;
	}
	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}
	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", questionname=" + questionname + "]";
	}
	

}
