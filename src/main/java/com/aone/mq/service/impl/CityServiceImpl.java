package com.aone.mq.service.impl;

import com.aone.mq.dao.CityDao;
import com.aone.mq.domain.City;
import com.aone.mq.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 * @create 2017-07-15 上午10:57
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
