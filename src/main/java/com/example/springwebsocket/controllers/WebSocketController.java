package com.example.springwebsocket.controllers;

import com.example.springwebsocket.models.Message;
import com.example.springwebsocket.models.dtos.ResponseMessage;
import com.example.springwebsocket.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebSocketController {

	@Autowired
	private MessageRepository messageRepository;


	@SendTo("/topic/messages")
	@MessageMapping("/message")
	public ResponseMessage getMessage(final Message message) {
		messageRepository.save(message);
		return new ResponseMessage(HtmlUtils.htmlEscape(message.getContent()));
	}
}
