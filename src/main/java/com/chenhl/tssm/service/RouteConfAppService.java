package com.chenhl.tssm.service;

import com.chenhl.tssm.domain.RouteConfAppDO;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/25
 * @描述:
 */
public interface RouteConfAppService {

    RouteConfAppDO findById(Long id);

    int save(RouteConfAppDO routeConfAppDO);

}
