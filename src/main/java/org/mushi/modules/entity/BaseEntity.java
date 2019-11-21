package org.mushi.modules.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @ClassName: BaseEntity
 * @Description: TODO
 * @Author: mushishi
 * @Date: 2019/11/14 16:58
 * @Version: V1.0
 **/
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建人
     */
    private long createBy;

    /**
     * 修改人
     */
    private long updateBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 0-正常，1-删除
     */
    private Integer delFlag;

}
