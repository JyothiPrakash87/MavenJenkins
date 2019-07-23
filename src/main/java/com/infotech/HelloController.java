package com.infotech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome() {
		
		return new ModelAndView("welcomePage","welcomemessage","welcome to spring world!!!!!!");
	}


}
