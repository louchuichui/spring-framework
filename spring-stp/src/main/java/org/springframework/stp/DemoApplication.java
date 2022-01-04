package org.springframework.stp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stp.bean.User;
import org.springframework.stp.config.AppConfig;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author louchuichui
 * @date 2022-01-01 22:58
 * @since x.x.x
 */
public class DemoApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = context.getBean(User.class);
		System.out.println(user);
	}
}
