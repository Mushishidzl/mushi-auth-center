package org.mushi.modules.entity;

import lombok.Data;

/**
 * @ClassName: OauthClient
 * @Description: 应用实体
 * @Author: mushishi
 * @Date: 2019/11/14 16:26
 * @Version: V1.0
 **/
@Data
public class OauthClient extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 业务id
     */
    private long id;

    /**
     * 应用编码
     */
    private String clientCode;

    /**
     * 应用名称
     */
    private String clientName;

    /**
     * 应用类型 
     */
    private String clientType;

    /**
     * 应用图片
     */
    private String clientLogo;

    /**
     * 应用回调地址
     */
    private String clientAddress;

    /**
     * 应用授权类型
     */
    private String grantType;

    /**
     * 应用状态
     */
    private String clientStatus;

    /**
     * 应用密码
     */
    private String clientSecret;

    /**
     * 应用的作用域
     */
    private String scop;

    /**
     * 生成access_token的有效时间
     */
    private Integer accessTokenValidity;

    /**
     * 生成refresh_token的有效时间
     */
    private Integer refreshTokenValidity;



}
