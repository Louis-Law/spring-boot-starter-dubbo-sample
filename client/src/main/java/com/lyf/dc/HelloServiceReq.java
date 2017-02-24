package com.lyf.dc;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lyf.samples.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by 永锋 on 2017/2/22.
 */
@Component
public class HelloServiceReq {
	private static Logger logger = LoggerFactory.getLogger(HelloServiceReq.class);

	@Reference(version = "1.0")
	public HelloService helloService;

	public void hello() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			String result = helloService.code("bbk_bbk72_t_jb3_jzusjfbi65wwqosk" + i);
			logger.info("{}. result is {}", i, result);
		}
		logger.info("total spent {} ms", System.currentTimeMillis() - start);
	}
}
