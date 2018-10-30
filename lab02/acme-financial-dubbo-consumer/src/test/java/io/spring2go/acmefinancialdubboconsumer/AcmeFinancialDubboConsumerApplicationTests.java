package io.spring2go.acmefinancialdubboconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.annotation.Reference;

import io.spring2go.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcmeFinancialDubboConsumerApplicationTests {

	@Reference(version = "1.0.0")
  	private HelloService demoService;
	
	@Test
	public void contextLoads() {
		String sayHello = demoService.sayHello("unitTest");
    	System.err.println(sayHello);
	}
	@Test
	public void mybatisCat() {
		String sayHello = demoService.getRatings(5L);
		System.err.println(sayHello);
	}

}
