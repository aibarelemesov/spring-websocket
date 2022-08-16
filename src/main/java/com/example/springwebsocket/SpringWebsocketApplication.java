package com.example.springwebsocket;

import com.example.springwebsocket.models.Message;
import com.example.springwebsocket.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebsocketApplication implements CommandLineRunner {

	@Autowired
	private MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringWebsocketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Message message = new Message("Wow");
		messageRepository.save(message);
	}
}
