	package org.prac.spring.SimpleMVCSpring;
	
	import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	import org.prac.spring.SimpleMVCSpring.service.AddService;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;
	
	@Controller
	public class AddController {
	
		@RequestMapping("/add")
		public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
			
			ModelAndView modelView=new ModelAndView();
			modelView.setViewName("display");
			modelView.addObject("result",
								new AddService().add(Integer.parseInt(request.getParameter("t1")), 
													Integer.parseInt(request.getParameter("t2"))));
			System.out.println(request.getServletContext().getMajorVersion());
			System.out.println(request.getServletContext().getMinorVersion());
			return modelView;
		}
	}
