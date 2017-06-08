package com.kyh.remote;

import com.kyh.remote.fallback.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kongyunhui on 2017/6/7.
 *
 * 通过Web Service客户端Feign，编写远程调用接口
 *
 * 指定远程程序名 + 远程方法（方法名和参数需保持一致）
 */
@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}
