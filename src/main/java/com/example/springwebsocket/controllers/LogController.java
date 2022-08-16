package com.example.springwebsocket.controllers;

import com.example.springwebsocket.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogController {

	@Autowired
	private MessageRepository messageRepository;

	@GetMapping("/logs")
	public String getMessages(Model model) {
		model.addAttribute("content", messageRepository.getAllMessageContent());
		return "logs";
	}

	@GetMapping ("/addLog")
	public String sendMessages() {
		return "addLog";
	}
}
