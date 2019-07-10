package com.ITC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ITC.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest req, HttpServletResponse res)
	{
//		int i = Integer.parseInt(req.getParameter("t1"));
//		int j= Integer.parseInt(req.getParameter("t2"));
	
		AddService as = new AddService();
		int k = as.add(i,j);
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("display"); // here we are not using the extension , for extension we create a method viewResolver using InternalViewResolver and there i define the extension so that later on if we want to change the extension/framework later we can easily do it. i changed it, as well as the path of the file ,i put the file(display.jsp) in the WEB-INF for security purpose so that it will not directly visible
		mv.addObject("result",k);
		
		
		return mv;
	}
	
}
