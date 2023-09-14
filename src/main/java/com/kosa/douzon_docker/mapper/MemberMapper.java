package com.kosa.douzon_docker.mapper;

import com.kosa.douzon_docker.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectAllMembers();
}
