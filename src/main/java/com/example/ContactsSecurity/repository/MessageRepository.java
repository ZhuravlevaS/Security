package com.example.ContactsSecurity.repository;

import com.example.ContactsSecurity.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
