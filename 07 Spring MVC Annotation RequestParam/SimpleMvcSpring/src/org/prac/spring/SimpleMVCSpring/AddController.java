package org.prac.spring.SimpleMVCSpring;
	

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.prac.spring.SimpleMVCSpring.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
	
	@Controller
	public class AddController {
	
		@RequestMapping("/add")
		public ModelAndView add(@RequestParam("t1") int t1,@RequestParam("t2") int t2, HttpServletRequest request, HttpServletResponse response){
			
			ModelAndView modelView=new ModelAndView();
			modelView.setViewName("display");
			modelView.addObject("result",
								new AddService().add(t1,t2));
			System.out.println(request.getServletContext().getMajorVersion());
			System.out.println(request.getServletContext().getMinorVersion());
			return modelView;
		}
	}
