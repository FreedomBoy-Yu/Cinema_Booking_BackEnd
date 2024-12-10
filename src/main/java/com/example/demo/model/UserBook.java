package com.example.demo.model;

import java.time.LocalDate;

public class UserBook {
	private Integer id;
	private Integer user_id;
	private String bookroom;
	private String booksit;
	private LocalDate bookdate;
	private boolean pay;
	public UserBook(Integer user_id, String bookroom, String booksit, LocalDate bookdate, boolean pay) {
		super();
		this.user_id = user_id;
		this.bookroom = bookroom;
		this.booksit = booksit;
		this.bookdate = bookdate;
		this.pay = pay;
	}
	public UserBook() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getBookroom() {
		return bookroom;
	}
	public void setBookroom(String bookroom) {
		this.bookroom = bookroom;
	}
	public String getBooksit() {
		return booksit;
	}
	public void setBooksit(String booksit) {
		this.booksit = booksit;
	}
	public LocalDate getBookdate() {
		return bookdate;
	}
	public void setBookdate(LocalDate bookdate) {
		this.bookdate = bookdate;
	}
	public boolean isPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "userbook {"+
				"id=" + id + 
				", user_id=" + user_id + 
				", bookroom=" + bookroom + 
				", booksit=" + booksit
				+ ", bookdate=" + bookdate + 
				", pay=" + pay + "}";
	}
	
}
