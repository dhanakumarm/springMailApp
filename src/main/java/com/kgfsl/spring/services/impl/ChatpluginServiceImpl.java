package com.kgfsl.spring.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgfsl.spring.dao.ChatpluginDao;
import com.kgfsl.spring.models.Chatplugin;
import com.kgfsl.spring.services.ChatpluginService;

@Service("chatpluginservice")
@Transactional
public class ChatpluginServiceImpl implements ChatpluginService {

	@Autowired
	ChatpluginDao chatdao;
	
	@Override
	public List<Chatplugin> GetChatDetails() {
		
		return chatdao.GetChatDetails();
	}

	@Override
	public Chatplugin SaveChatDetails(Chatplugin chatplugin) {
		// TODO Auto-generated method stub
		return chatdao.SaveChatDetails(chatplugin);
	}

	@Override
	public boolean DeleteChat(Chatplugin chatplugin) {
		// TODO Auto-generated method stub
		return chatdao.DeleteChat(chatplugin);
	}

}
