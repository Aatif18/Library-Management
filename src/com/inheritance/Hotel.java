package com.inheritance;

import java.util.Date;

public class Hotel {
	
	private String name;
    private String address;
    private String contactNo;
    private String email;

    public Hotel(String name, String address, String contactNo, String email) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
    }
    
    // Getters and setters
}

class Customer {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String contactNo;
    private String idProof;
    private String email;

    public Customer(int id, String name, int age, String gender, String contactNo, String idProof, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.idProof = idProof;
        this.email = email;
    }
    
    // Getters and setters
}

class Room {
    private int roomNo;
    private double price;
    private boolean available;
    private String bedType;

    public Room(int roomNo, double price, boolean available, String bedType) {
        this.roomNo = roomNo;
        this.price = price;
        this.available = available;
        this.bedType = bedType;
    }
    
    // Getters and setters
}

class CheckIn {
    private int customerId;
    private String name;
    private int roomNo;
    private Date checkInDate;
    private Date checkOutDate;

    public CheckIn(int customerId, String name, int roomNo, Date checkInDate, Date checkOutDate) {
        this.customerId = customerId;
        this.name = name;
        this.roomNo = roomNo;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        
        
    }

	@Override
	public String toString() {
		return "CheckIn [customerId=" + customerId + ", name=" + name + ", roomNo=" + roomNo + ", checkInDate="
				+ checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
    
    // Getters and setters
}


