package com.kgfsl.spring.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "mailhbtest")	
public class Mail {
	
	@Id
	private long id;
	private String subject;
	private String message;
	private String from2;
	private String to2;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFrom() {
		return from2;
	}
	public void setFrom(String from2) {
		this.from2 = from2;
	}
	public String getTo() {
		return to2;
	}
	public void setTo(String to2) {
		this.to2 = to2;
	}

}
