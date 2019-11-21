package org.mushi.modules.entity;

import lombok.Data;

import java.time.LocalTime;

/**
 * @ClassName: GrantInfo
 * @Description: 授权实体
 * @Author: mushishi
 * @Date: 2019/11/14 16:40
 * @Version: V1.0
 **/
@Data
public class GrantInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 业务id
     */
    private long id;

    /**
     * 应用id
     */
    private String clientId;

    /**
     * 授权对象id
     */
    private String grantObjId;

    /**
     * 授权类型
     */
    private Integer grantType;

    /**
     * 授权对象名称
     */
    private String grantObjName;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 授权过期时间
     */
    private LocalTime expireTime;


}
