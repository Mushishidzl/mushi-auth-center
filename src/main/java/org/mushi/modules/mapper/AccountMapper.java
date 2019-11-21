package org.mushi.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mushi.modules.entity.Account;

/**
 * @ClassName: AccountMapper
 * @Description: 用户
 * @Author: mushishi
 * @Date: 2019/11/14 17:17
 * @Version: V1.0
 **/
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
