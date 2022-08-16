package com.example.springwebsocket.repositories;

import com.example.springwebsocket.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

	@Query(value = "select content from message", nativeQuery = true)
	List<String> getAllMessageContent();
}
