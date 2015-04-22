package cn.springmvc.test;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.service.SysUserService;

public class SysUserTest {
	private SysUserService userService;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		userService = (SysUserService)context.getBean("sysUserServiceImpl");
	}
}
