package xyz.klink.random.frontend;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "backend", url = "backend")
/* @FeignClient(name = "backend", url = "http://backend:8081") */
interface RandomService {

    @RequestMapping(method = RequestMethod.GET, value = "/int")
    int getInteger();


}
