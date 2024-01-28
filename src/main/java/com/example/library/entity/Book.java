package com.example.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "book")
public class Book {

	@Id
	@Column( name = "ISBN")
	private int ISBN ;
	
	@Column( name = "name")
	private String name ;
	
	@Column( name = "author")
	private String author ;
	
	@Column( name = "introduction")
	private String introduction ;

	public Book() {
		super();
	}

	public Book(int iSBN, String name, String author, String introduction) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.author = author;
		this.introduction = introduction;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
}
