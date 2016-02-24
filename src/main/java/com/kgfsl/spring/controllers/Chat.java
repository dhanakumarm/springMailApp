package com.kgfsl.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kgfsl.spring.models.Chatplugin;
import com.kgfsl.spring.services.ChatpluginService;

@Controller
@RequestMapping(value= "/chat")
public class Chat {

	
	@Autowired
	ChatpluginService chatpluginservice;
	
	@RequestMapping(value={"/details"}, method= RequestMethod.GET)
	public String GetChatDetails(Model model){
		
		List<Chatplugin> lst = chatpluginservice.GetChatDetails();
		System.out.println(lst.get(0).getVersion());
		System.out.println(lst);
		model.addAttribute("chat", lst);
		
		return "chatdetails";
	}
	
	
	@RequestMapping(value={"/delete"}, method= RequestMethod.POST)
	public String DeleteChatDetails(Model model){
		
		List<Chatplugin> lst = chatpluginservice.GetChatDetails();
		chatpluginservice.DeleteChat(lst.get(0));
		return "redirect:details";
	}
	
	@RequestMapping(value={"/delete"}, method= RequestMethod.GET)
	public String DeleteChat(Model model){
		
		
		return "chatdelete";
	}
	
	
	
	
}
