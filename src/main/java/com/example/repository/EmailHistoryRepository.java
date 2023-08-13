package com.example.repository;

import com.example.entity.EmailHistoryEntity;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface EmailHistoryRepository extends CrudRepository<EmailHistoryEntity, String> {
    PageImpl<EmailHistoryEntity> findAll(Pageable pageable);
    PageImpl<EmailHistoryEntity> findAllByEmail(String email, Pageable pageable);
}
