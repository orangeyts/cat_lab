package io.spring2go;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
    public String sayHello(String name) {
        return "Hello dubbo from http://start.dubbo.io/, " + name + ", " + new Date();
    }

}