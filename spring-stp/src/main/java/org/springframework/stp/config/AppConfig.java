package org.springframework.stp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stp.bean.User;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author louchuichui
 * @date 2022-01-02 10:47
 * @since x.x.x
 */
@Configuration
public class AppConfig {

	@Bean
	public User user(){
		return new User("馒头",1,"男");
	}

}
