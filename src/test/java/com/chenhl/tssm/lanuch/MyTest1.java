package com.chenhl.tssm.lanuch;

import com.alibaba.fastjson.JSON;
import com.chenhl.tssm.domain.RouteConfAppDO;
import com.chenhl.tssm.service.RouteConfAppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/18
 * @描述:
 */
public class MyTest1 {

    public static void main(String[] args) {
        //创建一个spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-beans.xml");

        RouteConfAppService routeConfAppService = applicationContext.getBean(RouteConfAppService.class);

        RouteConfAppDO routeConfAppDO = routeConfAppService.findById(1L);

        System.out.println(JSON.toJSONString(routeConfAppDO));
    }


}
