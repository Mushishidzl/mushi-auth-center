package org.mushi.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mushi.modules.entity.Account;
import org.mushi.modules.mapper.AccountMapper;
import org.mushi.modules.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AccountServiceImpl
 * @Description: 账户实现
 * @Author: mushishi
 * @Date: 2019/11/14 17:26
 * @Version: V1.0
 **/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
}
