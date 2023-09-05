package com.example.demo02.customconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//注解标识当前类就是自定义配置类
public class Config {

    @Bean("Properties")//将返回值对象作为组件添加到spring
    public MyProperties getProerties(){

        return new MyProperties();
    }

}
