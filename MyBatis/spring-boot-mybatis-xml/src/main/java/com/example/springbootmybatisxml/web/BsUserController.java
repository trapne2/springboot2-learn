package com.example.springbootmybatisxml.web;

import com.example.springbootmybatisxml.mapper.BsUserMapper;
import com.example.springbootmybatisxml.model.BsUser;
import com.example.springbootmybatisxml.param.BsUserParam;
import com.example.springbootmybatisxml.result.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BsUserController {

    @Resource
    private BsUserMapper bsUserMapper;

    @RequestMapping("/getUsers")
    public List<BsUser> getUsers() {
        List<BsUser> users = bsUserMapper.getAll();
        return users;
    }

    @RequestMapping("/getList")
    public Page<BsUser> getList(BsUserParam userParam) {
        List<BsUser> users = bsUserMapper.getList(userParam);
        long count = bsUserMapper.getCount(userParam);
        Page page = new Page(userParam,count,users);
        return page;
    }

}
