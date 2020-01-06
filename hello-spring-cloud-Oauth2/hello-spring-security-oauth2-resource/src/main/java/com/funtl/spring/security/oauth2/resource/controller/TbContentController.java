package com.funtl.spring.security.oauth2.resource.controller;

import com.funtl.spring.security.oauth2.resource.domain.TbContent;
import com.funtl.spring.security.oauth2.resource.dto.ResponseResult;
import com.funtl.spring.security.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author songtao
 * @create 2020-01-2020/1/5-21:27
 */
@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;


    @GetMapping(value = "/")
    public ResponseResult<List<TbContent>> list() {
        List<TbContent> tbContents = tbContentService.selectAll();
        return new ResponseResult<List<TbContent>>(HttpStatus.OK.value(), HttpStatus.OK.toString(), tbContents);
    }


}
