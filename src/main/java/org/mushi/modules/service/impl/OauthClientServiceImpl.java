package org.mushi.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mushi.modules.entity.OauthClient;
import org.mushi.modules.mapper.OauthClientMapper;
import org.mushi.modules.service.IOauthClientService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OauthClientServiceImpl
 * @Description: 应用实现
 * @Author: mushishi
 * @Date: 2019/11/14 17:21
 * @Version: V1.0
 **/
@Service
public class OauthClientServiceImpl extends ServiceImpl<OauthClientMapper, OauthClient> implements IOauthClientService {
}
