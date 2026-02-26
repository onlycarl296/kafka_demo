package com.demo.account.repo;

import com.demo.account.model.MessageDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepo extends JpaRepository<MessageDTO, Integer> {

    List<MessageDTO> findByStatus(boolean status);
}
