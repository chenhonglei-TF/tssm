package com.chenhl.tssm.service.impl;

import com.chenhl.tssm.custom.annotation.LogAnnotation;
import com.chenhl.tssm.domain.RouteConfAppDO;
import com.chenhl.tssm.mapper.RouteConfAppMapper;
import com.chenhl.tssm.service.RouteConfAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/25
 * @描述:
 */
@Service
public class RouteConfAppServiceImpl implements RouteConfAppService {

    @Autowired
    RouteConfAppMapper routeConfAppMapper;

    @Override
    @LogAnnotation("系统来源配置")
    public RouteConfAppDO findById(Long id) {
        RouteConfAppDO routeConfAppDO = routeConfAppMapper.selectById(id);
        System.out.println("id="+id);
        return routeConfAppDO;
    }


    @Override
    @LogAnnotation("系统来源配置")
    @Transactional
    public int save(RouteConfAppDO routeConfAppDO) {
        int insert = routeConfAppMapper.insert(routeConfAppDO);
        System.out.println("insert="+insert);
        int i = 1 / 0;
        insert = routeConfAppMapper.insert(routeConfAppDO);
        return insert;
    }
}
