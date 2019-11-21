package org.mushi.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mushi.modules.entity.OauthClient;

/**
 * @ClassName: OauthClientMapper
 * @Description: 应用
 * @Author: mushishi
 * @Date: 2019/11/14 17:15
 * @Version: V1.0
 **/
@Mapper
public interface OauthClientMapper extends BaseMapper<OauthClient> {
}
