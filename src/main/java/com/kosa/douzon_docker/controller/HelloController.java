package com.kosa.douzon_docker.controller;

import com.kosa.douzon_docker.service.MemberService;
import com.kosa.douzon_docker.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private MemberService service;
    @GetMapping("/hello")
    public String hello(){
        return "Hello Douzon 6기!!!";
    }

    @GetMapping("/members")
    public List<MemberVO> findAllMembers(){
        return service.selectAllMembers();
    }
}
