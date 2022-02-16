package com.clito.ClitoFarm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class Buyer {

	@Id
	@Column(name="Buyer_id", unique = true, nullable = false, length = 10)
	private int buyerId;
	
	@Column(name="Username", unique = true, nullable = false, length = 20)
	private String userName;
	
	@Column(name="Password", unique = true, nullable = false, length = 20)
	private String password;
	
	@Column(name = "EMAIL", unique = true, nullable = false, length = 30)
	private String email;
	
	/*
	 * @OneToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="buyer_details_Id", unique = true, nullable = false) private
	 * int buyerDetails;
	 */
	public Buyer() {
		
	}

	public Buyer(int buyerId, String userName, String password, String email) {
		super();
		this.buyerId = buyerId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
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
	 * public int getBuyerDetails() { return buyerDetails; }
	 * 
	 * public void setBuyerDetails(int buyerDetails) { this.buyerDetails =
	 * buyerDetails; }
	 */
	@Override
	public String toString() {
		return "buyer [buyerId=" + buyerId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ "]";
	}

}

