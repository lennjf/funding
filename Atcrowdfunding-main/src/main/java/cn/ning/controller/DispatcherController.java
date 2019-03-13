package cn.ning.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.ning.bean.User;
import cn.ning.manager.service.UserService;
import cn.ning.util.AjaxResult;
import cn.ning.util.Const;
import cn.ning.util.MD5Util;

@Controller
public class DispatcherController {
	@Autowired
	private UserService userService;
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String loginOut(HttpSession session) {
		session.setAttribute(Const.LOGIN_USER, null);
		return "redirect:/index.htm";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main"; //123
	}
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public Object doLogin(String loginAcct, String userpswd, String type,HttpSession session) {
		AjaxResult result = new AjaxResult();
		try {
			HashMap<String, String> map = new HashMap<>();
			map.put("loginAcct", loginAcct);
			map.put("userpswd", MD5Util.digest(userpswd));
			map.put("type", type);	
			User user = userService.login(map);
			session.setAttribute(Const.LOGIN_USER, user);
			result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}
}
