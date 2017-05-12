package pers.yuan.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//例：http://blog.csdn.net/taotoxht/article/details/41800667
@Controller
public class IndexController {

	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
}
