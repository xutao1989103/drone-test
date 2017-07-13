package com.aone.mq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xutao
 * @email xt111024@alibaba-inc.com
 * @create 2017-07-13 上午9:47
 */

@RestController
@RequestMapping("/drone")
public class DroneTestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
        return "ok";
    }
}
