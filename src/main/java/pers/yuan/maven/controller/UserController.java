
package pers.yuan.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

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
	
	//@RequestMapping(value="/getUserList",produces = "text/html;charset=UTF-8") //中文乱码
	@RequestMapping("/getUserList")
	@ResponseBody
	public String getUserList(Model model){
		JSONObject jo = new JSONObject();
		List<User> list = this.userService.getUserList();
		jo.put("code", 200);
		jo.put("users", list);
//		model.addAttribute("ulist",list);
//		return "user";
		return jo.toString();
	}
	
}
