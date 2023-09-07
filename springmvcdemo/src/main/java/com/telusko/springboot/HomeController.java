package com.telusko.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.springboot.model.Aliens;

@Controller
public class HomeController {

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Aliens");
	}
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("add")
	public String add(@RequestParam("num1") int a, @RequestParam("num2") int b,Model m) {
	//	ModelAndView mView = new ModelAndView("result");
	
		int ans = a + b;
	//	mView.addObject("ans", ans);
		//return mView;
		m.addAttribute("ans",ans);
		return "result	";
	}
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Aliens a1) {
		
		return "result2";
	}
}
