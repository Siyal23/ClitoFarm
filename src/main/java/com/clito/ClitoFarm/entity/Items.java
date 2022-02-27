package com.clito.ClitoFarm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Items {

	@Id
	@Column(name = "Item_Id", unique = true, nullable = false)
	private int itemid;

	@Column(name = "Item_Name", nullable = false, length = 30)
	private String itemName;

	@Column(name = "Item_Type", nullable = false, length = 20)
	private String itemType;

	public Items() {

	}

	public Items(int itemid, String itemName, String itemType) {
		super();
		this.itemid = itemid;
		this.itemName = itemName;
		this.itemType = itemType;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	@Override
	public String toString() {
		return "items [itemid=" + itemid + ", itemName=" + itemName + ", itemType=" + itemType + "]";
	}

}
