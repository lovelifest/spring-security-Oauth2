package com.funtl.spring.security.oauth2.server.config;

import com.funtl.spring.security.oauth2.server.domain.TbPermission;
import com.funtl.spring.security.oauth2.server.domain.TbUser;
import com.funtl.spring.security.oauth2.server.service.TbPermissionService;
import com.funtl.spring.security.oauth2.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author songtao
 * @create 2020-01-2020/1/5-20:32
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private TbPermissionService tbPermissionService;

    @Autowired
    private TbUserService tbUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        TbUser tbUser = tbUserService.getByUsername(s);

        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser != null) {
            List<TbPermission> tbPermissionList = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissionList.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
            return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
        }

        return  null;
    }
}
