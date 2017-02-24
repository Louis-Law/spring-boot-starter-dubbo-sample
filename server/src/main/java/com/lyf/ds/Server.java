package com.lyf.ds;

import com.oqiji.boot.dubbo.DubboScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 永锋 on 2017/2/22.
 */
@SpringBootApplication
@DubboScan("com.lyf.ds")
public class Server {
	public static void main(String[] args) {
		SpringApplication.run(Server.class, args);
	}
}