package com.kgfsl.spring.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kgfsl.spring.dao.MailDao;
import com.kgfsl.spring.models.Mail;
import com.kgfsl.spring.services.MailService;


public class MailServiceImpl implements MailService {
	
	@Autowired
	MailDao maildao;

	@Override
	public List<Mail> getMail() {
		
		return maildao.getMail();
	}

	@Override
	public Mail saveupdate(Mail mail) {
		
		return maildao.saveupdate(mail);
	}

}
