package com.funtl.spring.security.oauth2.server.service;

import com.funtl.spring.security.oauth2.server.domain.TbUser;

/**
@author songtao
@create 2020-01-2020/1/5-20:35
*/
public interface TbUserService{

    TbUser getByUsername(String username);
}
