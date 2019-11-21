package org.mushi.modules.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @ClassName: Account
 * @Description: 账户
 * @Author: mushishi
 * @Date: 2019/11/14 16:21
 * @Version: V1.0
 **/
@Data
public class Account extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 账户id
     */
    private long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 密码
     */
    private String password;

    /**
     * 随机盐
     */
    @JsonIgnore
    private String salt;

    /**
     * 锁定标记
     */
    private String lockFlag;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 微信openid
     */
    private String wxOpenid;

    /**
     * QQ openid
     */
    private String qqOpenid;


}
