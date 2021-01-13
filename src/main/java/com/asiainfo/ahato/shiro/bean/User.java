package com.asiainfo.ahato.shiro.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @Author kezh
 * @Function 用户实体类
 * @Date 15:21 2021/1/13
 **/
@Data
@AllArgsConstructor
public class User {

    //工号ID
    private String staffId;
    //员工名称
    private String staffName;
    //密码
    private String staffPwd;
    //邮箱
    private String email;
    //告警，联系电话
    private String phoneNumber;
    //起始时间
    private Date startDate;
    //结束时间
    private Date endDate;
    //工号状态
    private int dimissionTag;
    //性别
    private String sex;
    //角色
    private Set<Role> roles;

}
