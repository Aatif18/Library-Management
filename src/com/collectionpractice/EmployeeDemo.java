package com.collectionpractice;

public class EmployeeDemo {
	
	int id;
	String name;
	int contact_no;
	public EmployeeDemo(int id, String name, int contact_no) {
		super();
		this.id = id;
		this.name = name;
		this.contact_no = contact_no;
	}
	
	public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getContact_no() {
        return contact_no;

}

	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", name=" + name + ", contact_no=" + contact_no + "]";
	}
}
