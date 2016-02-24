package com.kgfsl.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgfsl.spring.dao.BaseAbstractDao;
import com.kgfsl.spring.dao.ChatpluginDao;
import com.kgfsl.spring.models.Chatplugin;

@Repository("chatdao")
public class ChatpluginDaoImpl extends BaseAbstractDao<Chatplugin> implements ChatpluginDao {

	
	@Autowired
	public ChatpluginDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Chatplugin> GetChatDetails() {		
		
		return super.currentSession().createCriteria(Chatplugin.class).list();
	}

	@Override
	public Chatplugin SaveChatDetails(Chatplugin chatplugin) {
		
		 super.currentSession().merge(chatplugin);
		 return chatplugin;
	}

	@Override
	public boolean DeleteChat(Chatplugin chatplugin) {
		try{
		super.currentSession().delete(chatplugin);
		}
		catch(Exception ex){
			return false;
		}
		return true;
	}

}
