package org.mushi.modules.entity;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @ClassName: OauthMushiUser
 * @Description: 安全用户
 * @Author: mushishi
 * @Date: 2019/11/14 16:14
 * @Version: V1.0
 **/
public class OauthMushiUser extends User {


    /**
     * 用户id
     */
    @Getter
    private String id;

    /**
     * 用户部门id
     */
    @Getter
    private String deptId;

    /**
     * 用户昵称
     */
    @Getter
    private String nickName;


    /**
     * 构建安全用户
     * @param id
     * @param deptId
     * @param nickName
     * @param username
     * @param password
     * @param enabled
     * @param accountNonExpired
     * @param credentialsNonExpired
     * @param accountNonLocked
     * @param authorities
     */
    public OauthMushiUser(String id,String deptId,String nickName,String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
        this.deptId = deptId;
        this.nickName = nickName;
    }
}
