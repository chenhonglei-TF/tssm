package com.chenhl.tssm.mapper;

import com.chenhl.tssm.domain.RouteConfAppDO;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/18
 * @描述:
 */
public interface RouteConfAppMapper {

    RouteConfAppDO selectById(Long id);

    int insert(RouteConfAppDO routeConfAppDO);
}
