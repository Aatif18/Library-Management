package com.containmentquestion;

public class InstituteBSTSTQMain {

	public static void main(String[] args) {
		
		Institute inst = new Institute();
		Branch b = new Branch();
		Subject s = new Subject();
		Topic t = new Topic();
		SubTopic st = new SubTopic();
		Question q = new Question();
		
		b.setBranchid(1);
		b.setBranchname("PUNE");
		
		s.setSubjectid(11);
		s.setSubjectname("JAVA");
		
		t.setTopicid(111);
		t.setTopicname("OOPS");
		
		st.setSubtopicid(22);
		st.setSubtopicname("Polymorphism");
		
		q.setQuestionid(10);
		q.setQuestionname("Method Overloading");
		
		inst.setInstitudeid(48618330);
		inst.setInstitudename("Deeniyat Institude of Technology");
		inst.setB(b);
		inst.setS(s);
		inst.setT(t);
		inst.setSt(st);
		inst.setQ(q);
		
		System.out.println(inst);
	}

}
