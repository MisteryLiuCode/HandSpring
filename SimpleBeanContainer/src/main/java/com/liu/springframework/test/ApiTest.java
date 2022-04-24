package com.liu.springframework.test;

import com.liu.springframework.BeanDefinition;
import com.liu.springframework.BeanFactory;
import org.junit.Test;

/**
 * @description: 测试获取对象
 * @author: 刘帅彪
 * @create: 2022-04-24 21:22
 **/


public class ApiTest {

    @Test
    public void test_getBeanFactory(){
        //    初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

//        注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        加到工厂里
        beanFactory.registerBean("userService",beanDefinition);

//        获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUser();

    }




}
