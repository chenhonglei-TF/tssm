package com.chenhl.tssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @创建人: chenhl
 * @创建时间: 2020/4/16
 * @描述:
 */
@Configuration
public class ConfigurationDemo {

    @Bean
    public Date currentDate() {
        return new Date();
    }
}
