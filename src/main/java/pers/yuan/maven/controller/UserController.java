
package pers.yuan.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.yuan.maven.pojo.User;
import pers.yuan.maven.service.IUserService;

/**
 * 
 * @ClassName UserController
 * @author Administrator
 * @date 2017年5月12日
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/getUserList")
	public String getUserList(Model model){
		List<User> list = this.userService.getUserList();
		model.addAttribute("ulist",list);
		return "user";
	}
	
}
