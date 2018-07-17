package com.heyx.demo.config;

import com.heyx.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 指明当前类是一个配置类,替代beans.xml
 *
 */
@Configuration
public class MyAppConfig {

	//将方法的返回值添加到容器中：容器中这个组件默认id是方法名
	@Bean
	public HelloService helloService(){
		System.out.println("配置类@Bean给容器中添加组件");
		return new HelloService();
	}
}
