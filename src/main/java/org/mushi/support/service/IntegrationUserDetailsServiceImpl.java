package org.mushi.support.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.mushi.modules.entity.Account;
import org.mushi.modules.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @ClassName: IntegrationUserDetailsServiceImpl
 * @Description: 获取用户信息
 * @Author: mushishi
 * @Date: 2019/11/20 14:26
 * @Version: V1.0
 **/
@Slf4j
@Service
public class IntegrationUserDetailsServiceImpl implements IntegrationUserDetailsService {


    @Autowired
    IAccountService accountService;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 缓存中获取



        Account account = accountService.getOne(Wrappers.<Account>query().lambda().eq(Account::getUsername, username));
        if(account == null){
            return null;
        }

        return null;
    }
}
