package org.lyflexi.debugaware.config;

import org.lyflexi.debugaware.entity.DogBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ly
 * @Date: 2024/2/12 11:40
 */
@Configuration
@ComponentScan({"org.lyflexi.debugaware","cn.hutool.extra.spring"})
public class AwareConfig {

    @Bean
    public DogBean dogBean(){
        return new DogBean();
    }

}
