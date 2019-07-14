package com.stackroute.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing a bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying a bean");
    }
}