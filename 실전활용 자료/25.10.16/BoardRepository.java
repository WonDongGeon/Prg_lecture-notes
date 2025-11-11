package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{
    
}
