package com.clito.ClitoFarm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller_details")
public class SellerDetails {

	@Id
	@Column(name="ID", unique = true, nullable = true , length = 5)
	private int id;
	
	@Column(name = "FIRST_NAME", unique = false, nullable = false, length = 20)
	private String firstName;
	
	@Column(name = "LAST_NAME", unique = false, nullable = false, length = 20)
	private String lastName;
	
	@Column(name="Address", length= 100)
	private String address;
	
	@Column(name="City", nullable=false, length=25)
	private String city;
	
	@Column(name="Pincode",  nullable=false, length=6)
	private int pincode;
	
	@Column(name="MobileNo", unique = true, length = 10)
	private int mobileno;
	
	public SellerDetails() {
		
	}

	public SellerDetails(int id, String firstName, String lastName, String address, String city, int pincode,
			int mobileno) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.mobileno = mobileno;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Seller_details [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", city=" + city + ", pincode=" + pincode + ", mobileno=" + mobileno + "]";
	}

	
}

	