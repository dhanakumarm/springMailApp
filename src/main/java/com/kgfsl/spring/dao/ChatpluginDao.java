package com.kgfsl.spring.dao;

import java.util.List;

import com.kgfsl.spring.models.Chatplugin;

public interface ChatpluginDao {
	
	List<Chatplugin> GetChatDetails();
	Chatplugin SaveChatDetails(Chatplugin chatplugin);
	boolean DeleteChat(Chatplugin chatplugin);

}
