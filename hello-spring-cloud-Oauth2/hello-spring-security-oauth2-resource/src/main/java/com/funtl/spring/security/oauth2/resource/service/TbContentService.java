package com.funtl.spring.security.oauth2.resource.service;

import com.funtl.spring.security.oauth2.resource.domain.TbContent;

import java.util.List;

/**
@author songtao
@create 2020-01-2020/1/5-21:25
*/
public interface TbContentService{

    List<TbContent> selectAll();
}
