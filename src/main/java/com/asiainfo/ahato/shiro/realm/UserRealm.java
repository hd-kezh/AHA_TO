package com.asiainfo.ahato.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.StringUtils;

/**
 * @Author kezh
 * @Function :����Realm,��ѯ�û��Ľ�ɫ��Ȩ����Ϣ��Ȼ�󱣴浽Ȩ�޹�������
 * @Date 2021/1/13 16:16
 */
public class UserRealm extends AuthorizingRealm {
    
    /**
     * @Description Ȩ��������
     * @Date  16:20 2021/1/13
     * @Param [principalCollection]
     * @return AuthorizationInfo
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //��ȡ�û���
        String name = (String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //��ȡ�û���Ӧ�Ľ�ɫ��Ϣ�������
        simpleAuthorizationInfo.addRole("");
        //��ȡ��ɫ��Ӧ��Ȩ����Ϣ�������
        simpleAuthorizationInfo.addStringPermission("");
        return simpleAuthorizationInfo;
    }

    /**
     * @Description ��֤������
     * @Date  16:20 2021/1/13
     * @Param [authenticationToken]
     * @return AuthenticationInfo
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if(StringUtils.isEmpty(authenticationToken.getPrincipal())){
            return null;
        }
        //��ȡ�û���Ϣ
        String name = authenticationToken.getPrincipal().toString();
        //������֤authenticationToken��simpleAuthenticationInfo����Ϣ
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo();

        return simpleAuthenticationInfo;
    }
}
