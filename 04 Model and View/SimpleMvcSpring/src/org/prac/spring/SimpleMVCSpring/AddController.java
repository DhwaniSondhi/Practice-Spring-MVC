package org.prac.spring.SimpleMVCSpring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		
		int t1=Integer.parseInt(request.getParameter("t1"));
		int t2=Integer.parseInt(request.getParameter("t2"));
		System.out.println(t1+t2);
		ModelAndView modelView=new ModelAndView();
		modelView.setViewName("display.jsp");
		modelView.addObject("result",(t1+t2));
		return modelView;
	}
}
