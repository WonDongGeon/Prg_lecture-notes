package com.example.demo3;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.entity.BoardEntity;
import com.example.demo3.entity.MemberEntity;
import com.example.demo3.repository.BoardRepository;
import com.example.demo3.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequiredArgsConstructor
public class TestController {

    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    // 회원가입
    @PostMapping("/join")
    public MemberEntity join(@RequestBody MemberEntity e) {
        return memberRepository.save(e);
    }

    // login
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody MemberEntity e) {
        return Map.of("status", "success", "token", "token123");
    }

    @PostMapping("/write")
    public BoardEntity write(@RequestBody BoardEntity e) {
        return boardRepository.save(e);
    }

    @GetMapping("/list")
    public List<BoardEntity> list() {
        return boardRepository.findAll();
    }

    @GetMapping("/detail/{bid}")
    public BoardEntity getDetail(@PathVariable Long bid) {
        return boardRepository
            .findById(bid)
            .orElseThrow();
    }
    
    
    
    
    

}
