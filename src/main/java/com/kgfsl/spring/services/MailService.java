package com.kgfsl.spring.services;

import java.util.List;

import com.kgfsl.spring.models.Mail;

public interface MailService {
	
	List<Mail> getMail();
	Mail saveupdate(Mail mail);

}
