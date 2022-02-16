package com.clito.ClitoFarm.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {

	@Id
	@Column(name="Order_Id", unique = true, nullable = false, length = 5)
	private int orderId;
	
	@Column(name="Items", nullable = false, length = 20)
	private String items;
	
	@Column(name="Item_Number", unique = true, nullable = false, length = 10)
	private int itemNumber;
	
	@Column(name="Quantity", nullable = false, length = 5)
	private int quantity;
	
	@Column(name="Buyer",  nullable = false, length = 30)
	private String buyer;
	
	@Column(name="Buyer_Address",  nullable = false, length = 50)
	private String buyerAddress;
	
	@Column(name="Order_Date",  nullable = false)
	private Date orderDate;
	
	public Orders() {
		
	}

	public Orders(int orderId, String items, int itemNumber, int quantity, String buyer, String buyerAddress,
			Date orderDate) {
		super();
		this.orderId = orderId;
		this.items = items;
		this.itemNumber = itemNumber;
		this.quantity = quantity;
		this.buyer = buyer;
		this.buyerAddress = buyerAddress;
		this.orderDate = orderDate;
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "orders [orderId=" + orderId + ", items=" + items + ", itemNumber=" + itemNumber + ", quantity="
				+ quantity + ", buyer=" + buyer + ", buyerAddress=" + buyerAddress + ", orderDate=" + orderDate + "]";
	}
	
}
