package com.example.demo02.profielconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class  DevDBConnector implements DBConnector{

    @Override
    public String config(){
        return "这是一个开发环境";
    }
}
