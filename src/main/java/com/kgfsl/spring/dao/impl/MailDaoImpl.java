package com.kgfsl.spring.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.kgfsl.spring.dao.MailDao;
import com.kgfsl.spring.models.Mail;

@Repository("maildao")
public class MailDaoImpl implements MailDao {

	public List<Mail> getMail(){
		
		List<Mail> mails = new ArrayList<Mail>();
		
		
		return mails;		
	}
	
	
	public Mail saveupdate(Mail mail){
		
		
		return mail;
	}
}
