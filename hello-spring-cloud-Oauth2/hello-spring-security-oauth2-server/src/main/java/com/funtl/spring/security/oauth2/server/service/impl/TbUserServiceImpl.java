package com.funtl.spring.security.oauth2.server.service.impl;

import com.funtl.spring.security.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.spring.security.oauth2.server.mapper.TbUserMapper;
import com.funtl.spring.security.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

/**
@author songtao
@create 2020-01-2020/1/5-20:35
*/
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {

        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        TbUser tbUser = tbUserMapper.selectOneByExample(example);
        return tbUser;
    }
}
