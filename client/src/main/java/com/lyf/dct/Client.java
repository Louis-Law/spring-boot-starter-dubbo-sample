package com.lyf.dct;

import com.lyf.dc.HelloServiceReq;
import com.oqiji.boot.dubbo.DubboScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by 永锋 on 2017/2/22.
 */
@SpringBootApplication
@DubboScan("com.lyf.dc")
public class Client {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Client.class, args);
		HelloServiceReq helloService = context.getBean(HelloServiceReq.class);
		helloService.hello();
	}
}
