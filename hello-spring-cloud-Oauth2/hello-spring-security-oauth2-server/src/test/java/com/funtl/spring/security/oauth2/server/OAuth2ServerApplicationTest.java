package com.funtl.spring.security.oauth2.server;

import com.funtl.spring.security.oauth2.server.domain.TbPermission;
import com.funtl.spring.security.oauth2.server.service.TbPermissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author songtao
 * @create 2020-01-2020/1/5-14:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OAuth2ServerApplicationTest {


    @Autowired
    private TbPermissionService tbPermissionService;

    @Test
    public void  TestBCryptPasswordEncoder(){

        String encode = new BCryptPasswordEncoder().encode("secret");
        System.out.println(encode);


    }


    @Test
    public void  testPermisson(){

        List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(1L);
        System.out.println(tbPermissions.size());

    }



}
