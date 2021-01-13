package com.asiainfo.ahato.shiro.bean;

import java.util.Set;

/**
 * @Author kezh
 * @Function 角色实体类
 * @Date 15:21 2021/1/13
 **/
public class Role {

    private String roleId;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;

}
