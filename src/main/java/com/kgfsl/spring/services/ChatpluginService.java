package com.kgfsl.spring.services;

import java.util.List;

import com.kgfsl.spring.models.Chatplugin;


public interface ChatpluginService {

	List<Chatplugin> GetChatDetails();
	Chatplugin SaveChatDetails(Chatplugin chatplugin);
	boolean DeleteChat(Chatplugin chatplugin);
}
