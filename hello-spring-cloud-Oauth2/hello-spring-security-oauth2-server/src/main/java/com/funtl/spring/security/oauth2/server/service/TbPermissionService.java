package com.funtl.spring.security.oauth2.server.service;

import com.funtl.spring.security.oauth2.server.domain.TbPermission;

import java.util.List;

/**
@author songtao
@create 2020-01-2020/1/5-20:35
*/
public interface TbPermissionService{

    List<TbPermission> selectByUserId( Long id );

}
