package com.kgfsl.spring.dao;

import java.util.List;

import com.kgfsl.spring.models.Mail;


public interface MailDao {
	
	List<Mail> getMail();
	Mail saveupdate(Mail mail);

}
