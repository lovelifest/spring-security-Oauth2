package com.funtl.spring.security.oauth2.resource.service.impl;

import com.funtl.spring.security.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.spring.security.oauth2.resource.mapper.TbContentMapper;
import com.funtl.spring.security.oauth2.resource.service.TbContentService;

import java.util.List;

/**
@author songtao
@create 2020-01-2020/1/5-21:25
*/
@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;


    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
