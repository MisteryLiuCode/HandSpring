package com.liu.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 创建bean的工厂
 * @author: 刘帅彪
 * @create: 2022-04-24 21:14
 **/


public class BeanFactory {

//    hashMap存储bean的信息，键存放的是对象的名称，值存放的是bean的定义信息
    private Map<String,BeanDefinition> beanDefinitionMap=new ConcurrentHashMap<>();

//    获取bean对象
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

//    注册bean
    public void registerBean(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
