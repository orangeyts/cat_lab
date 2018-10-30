package io.spring2go;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

import io.spring2go.dao.RatingsMapper;
import io.spring2go.model.Ratings;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Autowired
	RatingsMapper ratingsMapper;
	
	@Override
    public String sayHello(String name) {
        return "Hello dubbo from http://start.dubbo.io/, " + name + ", " + new Date();
    }

	@Override
	public String getRatings(Long id) {
		Ratings selectByPrimaryKey = ratingsMapper.selectByPrimaryKey(id);
		return JSON.toJSONString(selectByPrimaryKey);
	}

}