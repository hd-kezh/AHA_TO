package com.asiainfo.ahato.shiro.config;

import com.asiainfo.ahato.shiro.realm.UserRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kezh
 * @Function :��Ȩ����֤��ϢRealm��SecurityManager ע�뵽spring������
 * @Date 2021/1/13 16:15
 */
@Configuration //����ע��
public class ShiroConfig {

//    @ConditionalOnMissingBean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator defaultAAPC = new DefaultAdvisorAutoProxyCreator();
        defaultAAPC.setProxyTargetClass(true);
        return defaultAAPC;
    }

    /**
     * @Description ����Լ�����֤��ʽ��spring����
     * @Date  19:49 2021/1/13
     * @Param 
     * @return UserRealm
     **/
    @Bean
    public UserRealm myShiroRealm(){
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }

    /**
     * @Description Ȩ�޹���������Ҫ��Realm�Ĺ�����֤
     * @Date  19:52 2021/1/13
     * @Param 
     * @return SecurityManager
     **/
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    /**
     * @Description filter���������ö�Ӧ�Ĺ�����������ת����
     * @Date  20:01 2021/1/13
     * @Param SecurityManager securityManager
     * @return ShiroFilterFactoryBean
     **/
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String, String>map = new HashMap();
        //�ǳ�
        map.put("/logout", "logout");
        //�������û���֤
        map.put("/**", "authc");
        //��¼
        shiroFilterFactoryBean.setLoginUrl("/login");
        //��ҳ
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //����ҳ�棬��֤��ͨ����ת
        shiroFilterFactoryBean.setUnauthorizedUrl("/error");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

}
