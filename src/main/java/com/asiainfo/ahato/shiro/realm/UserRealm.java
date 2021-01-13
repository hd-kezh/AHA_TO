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
 * @Function :定义Realm,查询用户的角色和权限信息，然后保存到权限管理器中
 * @Date 2021/1/13 16:16
 */
public class UserRealm extends AuthorizingRealm {
    
    /**
     * @Description 权限配置类
     * @Date  16:20 2021/1/13
     * @Param [principalCollection]
     * @return AuthorizationInfo
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        String name = (String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //获取用户对应的角色信息，并添加
        simpleAuthorizationInfo.addRole("");
        //获取角色对应的权限信息，并添加
        simpleAuthorizationInfo.addStringPermission("");
        return simpleAuthorizationInfo;
    }

    /**
     * @Description 认证配置类
     * @Date  16:20 2021/1/13
     * @Param [authenticationToken]
     * @return AuthenticationInfo
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if(StringUtils.isEmpty(authenticationToken.getPrincipal())){
            return null;
        }
        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();
        //这里验证authenticationToken和simpleAuthenticationInfo的信息
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo();

        return simpleAuthenticationInfo;
    }
}
