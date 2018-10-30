package io.spring2go.acmefinancialdubboservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="io.spring2go.dao")
public class AcmeFinancialDubboServiceApplication {


	public static void main(String[] args) {
		
		// start embedded zookeeper server
		new EmbeddedZooKeeper(2181, false).start();

		
		SpringApplication.run(AcmeFinancialDubboServiceApplication.class, args);
	}
	
}
