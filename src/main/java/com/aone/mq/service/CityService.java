package com.aone.mq.service;

import com.aone.mq.domain.City;

/**
 * 城市业务逻辑接口类
 *
 * @create 2017-07-15 上午10:57
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}

