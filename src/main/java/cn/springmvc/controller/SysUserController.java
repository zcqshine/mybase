package cn.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.model.SysUser;
import cn.springmvc.service.SysUserService;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {
	
	@Autowired
	private SysUserService SysUserService;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView registerSysUser(SysUser sysUser){
		sysUser.setSex(false);
		int flag = SysUserService.addSysUser(sysUser);
		if(flag == 1){
			System.out.println("注册成功");
		}else{
			System.out.println("注册失败");
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sysUser/success");
		mav.addObject("user",sysUser);
		return mav;
	}
}
