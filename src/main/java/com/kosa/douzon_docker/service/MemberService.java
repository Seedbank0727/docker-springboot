package com.kosa.douzon_docker.service;

import com.kosa.douzon_docker.mapper.MemberMapper;
import com.kosa.douzon_docker.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberMapper mapper;

    public List<MemberVO> selectAllMembers(){
        return mapper.selectAllMembers();
    }
}
