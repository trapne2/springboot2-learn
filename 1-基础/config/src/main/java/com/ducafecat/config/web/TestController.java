package com.ducafecat.config.web;

import com.ducafecat.config.comm.DBCofnig;
import com.ducafecat.config.comm.OtherProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private DBCofnig cofnig;

    @Resource
    private OtherProperties other;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test() {
        return "test - " + cofnig.getServer() + other.getTitle();
    }

}
