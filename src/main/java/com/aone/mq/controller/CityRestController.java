package com.aone.mq.controller;

import com.aone.mq.domain.City;
import com.aone.mq.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xutao
 * @email xt111024@alibaba-inc.com
 * @create 2017-07-15 上午11:05
 */

@RestController
@RequestMapping("/city")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(String key) {
        return "oks";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        System.out.println("city get " + cityName);
        return cityService.findCityByName(cityName);
    }

}

