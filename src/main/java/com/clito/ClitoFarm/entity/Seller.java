package com.clito.ClitoFarm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seller")
public class Seller {

	@Id
	@Column(name="Seller_id", unique = true, nullable = false, length = 10)
	private int sellerId;
	
	@Column(name="Username", unique = true, nullable = false, length = 20)
	private String userName;
	
	@Column(name="Password", unique = true, nullable = false, length = 20)
	private String password;
	
	@Column(name = "EMAIL", unique = true, nullable = false, length = 30)
	private String email;

	/*
	 * @OneToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="Seller_details_Id", unique = true, nullable = false)
	 * private int sellerDetails;
	 */
	public Seller() {
		
	}

	public Seller(int sellerId, String userName, String password, String email) {
		super();
		this.sellerId = sellerId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public int getSellerDetails() { return sellerDetails; }
	 * 
	 * public void setSellerDetails(int sellerDetails) { this.sellerDetails =
	 * sellerDetails; }
	 */
	@Override
	public String toString() {
		return "seller [sellerId=" + sellerId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+  "]";
	}

}
