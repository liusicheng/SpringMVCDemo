//演示push打折打的撒大叔大叔的
package com.hk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
	
	//处理用户请求的
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("接收到了请求");
		
		//创建模型与视图对象，用于存储数据，转发请求到JSP
		ModelAndView modelAndView = new ModelAndView();
		//存储数据，相当于request.setAttribute(name, o);
		modelAndView.addObject("name","张三");
		//跳转到show.jsp 相当于request.getRequestDispatcher(path)
		
		//隐藏所有的jsp，用户只能通过控制器访问jsp
//		modelAndView.setViewName("/WEB-INF/jsp/show.jsp");
		//如果大部分的jsp都在同一个目录，我们可以使用视图解析器配置
		//URL的前缀和后缀，简化地址的编写
		modelAndView.setViewName("show");
		//返回对象
		return modelAndView;
	}

}
