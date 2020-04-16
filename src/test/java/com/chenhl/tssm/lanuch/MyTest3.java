package com.chenhl.tssm.lanuch;

import com.chenhl.tssm.config.ConfigurationDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/18
 * @描述:
 */
public class MyTest3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }


}
