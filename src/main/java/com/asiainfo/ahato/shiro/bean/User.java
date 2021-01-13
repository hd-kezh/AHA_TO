package com.asiainfo.ahato.shiro.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @Author kezh
 * @Function �û�ʵ����
 * @Date 15:21 2021/1/13
 **/
@Data
@AllArgsConstructor
public class User {

    //����ID
    private String staffId;
    //Ա������
    private String staffName;
    //����
    private String staffPwd;
    //����
    private String email;
    //�澯����ϵ�绰
    private String phoneNumber;
    //��ʼʱ��
    private Date startDate;
    //����ʱ��
    private Date endDate;
    //����״̬
    private int dimissionTag;
    //�Ա�
    private String sex;
    //��ɫ
    private Set<Role> roles;

}
