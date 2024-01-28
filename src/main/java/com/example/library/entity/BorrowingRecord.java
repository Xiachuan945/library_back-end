package com.example.library.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "borrowing_record")
public class BorrowingRecord {

	@Id
	@Column( name = "user_id")
	private int userId ;
	
	@Column( name = "inventory_id")
	private int inventoryId ;
	
	@Column ( name = "borrowing_time")
	private LocalDateTime borrowingTime ;
	
	@Column ( name = "return_time")
	private LocalDateTime returnTime ;

	public BorrowingRecord() {
		super();
	}

	public BorrowingRecord(int userId, int inventoryId, LocalDateTime borrowingTime, LocalDateTime returnTime) {
		super();
		this.userId = userId;
		this.inventoryId = inventoryId;
		this.borrowingTime = borrowingTime;
		this.returnTime = returnTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public LocalDateTime getBorrowingTime() {
		return borrowingTime;
	}

	public void setBorrowingTime(LocalDateTime borrowingTime) {
		this.borrowingTime = borrowingTime;
	}

	public LocalDateTime getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(LocalDateTime returnTime) {
		this.returnTime = returnTime;
	}
	
}
