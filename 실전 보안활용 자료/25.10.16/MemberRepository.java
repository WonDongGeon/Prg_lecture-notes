package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long>{
    
}
