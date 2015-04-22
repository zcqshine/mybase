package cn.springmvc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.SysUser;
import cn.springmvc.model.User;
import cn.springmvc.service.SysUserService;
import cn.springmvc.service.UserService;

public class UserTest {
	private SysUserService userService;
	
	@Before
	public void before(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		userService = (SysUserService)context.getBean("sysUserServiceImpl");
	}
	
	@Test
	public void addUser(){
		
		SysUser user = new SysUser();
		user.setAccount("张三");
		user.setPassword("pass");
		user.setNickname("nickname");
		user.setSex(true);
		System.out.println(userService.addSysUser(user));
	}
	
	public static void main(String[] args){
		System.out.println(System.getProperty("user.dir"));
	}
}
