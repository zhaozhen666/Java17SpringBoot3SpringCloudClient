package com.zhao.sbsc17.client.service.dubbo.client;


import com.zhao.sbsc17.client.service.ScDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class ScDubboClient {

    @DubboReference(group = "scDubboService",version = "1.0.0")
    ScDubboService dubboService;

    public String getServiceName(){
        return dubboService.getServiceName();
    }

}
