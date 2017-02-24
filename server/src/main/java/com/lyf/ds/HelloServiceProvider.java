package com.lyf.ds;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyf.samples.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by 永锋 on 2017/2/22.
 */
@Service(version = "1.0")
public class HelloServiceProvider implements HelloService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public String code(String device) {
		List<String> res =  jdbcTemplate.queryForList("SELECT code FROM activity WHERE device = ? ", String.class, device);
		if(CollectionUtils.isEmpty(res)){
			return null;
		}
		return res.get(0);
	}
}
