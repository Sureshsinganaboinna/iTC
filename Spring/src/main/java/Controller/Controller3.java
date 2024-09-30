package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller3 {
	
	
	@RequestMapping("/home")
	public ModelAndView homepage()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}

}
