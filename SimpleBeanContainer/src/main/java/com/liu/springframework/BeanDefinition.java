package com.liu.springframework;

/**
 * @description:
 * @author: 刘帅彪
 * @create: 2022-04-24 21:12
 **/


public class BeanDefinition {

    private Object bean;

//    有参构造方法
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
//    获取bean
    public Object getBean() {
        return bean;
    }
}
