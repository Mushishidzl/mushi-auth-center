package org.mushi.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mushi.modules.entity.GrantInfo;
import org.mushi.modules.mapper.GrantInfoMapper;
import org.mushi.modules.service.IGrantInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: GrantInfoServiceImpl
 * @Description: 授权实现
 * @Author: mushishi
 * @Date: 2019/11/14 17:23
 * @Version: V1.0
 **/
@Service
public class GrantInfoServiceImpl extends ServiceImpl<GrantInfoMapper, GrantInfo> implements IGrantInfoService {
}
