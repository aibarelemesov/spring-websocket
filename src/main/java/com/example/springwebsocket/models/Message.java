package com.example.springwebsocket.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String content;

	public Message() {

	}

	public String getContent() {
		return content;
	}

	public Message(String content) {
		this.content = content;
	}

	public void setContent(String messageContent) {
		this.content = messageContent;
	}
}
