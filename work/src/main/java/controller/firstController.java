package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {
	
	@RequestMapping("index")
	public String index(ModelMap m) {
		m.put("first", "FIRST");
		return "index";
	}

}
