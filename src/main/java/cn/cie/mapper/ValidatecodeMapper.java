package cn.cie.mapper;

import cn.cie.entity.Validatecode;

import java.util.List;

public interface ValidatecodeMapper {

    int insert(Validatecode record);

    List<String> selectByUid(Integer uid);

    int delete(Integer uid);

}