package org.mushi.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mushi.modules.entity.GrantInfo;

/**
 * @ClassName: GrantInfoMapper
 * @Description: 应用授权
 * @Author: mushishi
 * @Date: 2019/11/14 17:16
 * @Version: V1.0
 **/
@Mapper
public interface GrantInfoMapper extends BaseMapper<GrantInfo> {
}
