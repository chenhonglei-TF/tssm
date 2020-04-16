package com.chenhl.tssm.lanuch;

import com.chenhl.tssm.domain.RouteConfAppDO;
import com.chenhl.tssm.service.RouteConfAppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/18
 * @描述:
 */
public class MyTest2 {

    public static void main(String[] args) {
        //创建一个spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-beans.xml");

        RouteConfAppService routeConfAppService = applicationContext.getBean(RouteConfAppService.class);

        RouteConfAppDO routeConfAppDO = new RouteConfAppDO();
        routeConfAppDO.setAppCode("testAppCode");
        routeConfAppDO.setAppName("testAppName");
        routeConfAppDO.setSystemCode("testSystemCode");
        routeConfAppDO.setSystemType("testSystemType");
        routeConfAppDO.setMemo("testMemo");
        routeConfAppDO.setCreateOperatorId(19387L);
        routeConfAppDO.setModifyOperatorId(19387L);
        routeConfAppService.save(routeConfAppDO);
    }


}
