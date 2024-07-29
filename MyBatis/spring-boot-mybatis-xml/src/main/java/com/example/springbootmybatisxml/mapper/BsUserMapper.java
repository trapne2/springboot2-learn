package com.example.springbootmybatisxml.mapper;


import com.example.springbootmybatisxml.model.BsUser;
import com.example.springbootmybatisxml.param.BsUserParam;

import java.util.List;

public interface BsUserMapper {

    List<BsUser> getAll();

    List<BsUser> getList(BsUserParam userParam);

    int getCount(BsUserParam userParam);

}
