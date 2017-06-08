package com.kyh.remote.fallback;

import com.kyh.remote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kongyunhui on 2017/6/8.
 *
 * 实现HelloRemote，编写接口默认实现。
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed from fallback";
    }
}
