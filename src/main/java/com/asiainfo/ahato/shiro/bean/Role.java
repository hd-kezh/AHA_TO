package com.asiainfo.ahato.shiro.bean;

import java.util.Set;

/**
 * @Author kezh
 * @Function ��ɫʵ����
 * @Date 15:21 2021/1/13
 **/
public class Role {

    private String roleId;
    private String roleName;
    /**
     * ��ɫ��ӦȨ�޼���
     */
    private Set<Permissions> permissions;

}
