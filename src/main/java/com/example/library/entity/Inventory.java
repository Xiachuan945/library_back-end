package com.example.library.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "inventory")
public class Inventory {

	@Id
	@Column( name = "inventory_id")
	private int inventoryId ;
	
	@Column( name = "ISBN")
	private int ISBN ;
	
	@Column ( name = "store_time")
	private LocalDateTime storeTime ;
	
	@Column( name = "status")
	private String status ;

	public Inventory() {
		super();
	}

	public Inventory(int inventoryId, int iSBN, LocalDateTime storeTime, String status) {
		super();
		this.inventoryId = inventoryId;
		ISBN = iSBN;
		this.storeTime = storeTime;
		this.status = status;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public LocalDateTime getStoreTime() {
		return storeTime;
	}

	public void setStoreTime(LocalDateTime storeTime) {
		this.storeTime = storeTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
