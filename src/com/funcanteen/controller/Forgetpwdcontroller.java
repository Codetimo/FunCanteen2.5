package com.funcanteen.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.funcanteen.pojo.User;
import com.funcanteen.service.Canservice;
import com.funcanteen.util.SmsSDKUtils;

@Controller
public class Forgetpwdcontroller {
	@Autowired
	private Canservice cservice;

	// 去找回密码界面
	@RequestMapping(value = "logingoforpassword.action")
	public String gotoForPwd() {
		return "forpassword";
	}

	// 发送验证码
	@RequestMapping(value = "loginsendMessage.action")
	public void sendMessage(String userphone, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String code = getCode(request);
		request.getSession().setAttribute("userphone", userphone);
		// userphone="15755332385";
		System.out.println(userphone);
		SmsSDKUtils.sendMessageCode(userphone, code);
		response.getWriter().write("true");
		System.out.println(code);
		response.flushBuffer();
		
	}

	// 获取验证码
	public String getCode(HttpServletRequest request) {
		Random rand = new Random();
		String code = "";
		for (int i = 0; i < 6; i++) {
			code += rand.nextInt(10);
		}
		// code="123456";
		request.getSession().setAttribute("code", code);

		return code;
	}
	
	// 判断验证是否一样
	@RequestMapping(value = "loginischeckCode.action")
	public @ResponseBody
	String verification(String code,HttpSession session){
		String code1 = (String) session.getAttribute("code");
		boolean isExist = true;
		if (code != null && code1 != null) {
			if (session.getAttribute("code").equals(code)) {
				isExist = true;
			} else {
				isExist = false;
			}
		} else {
			isExist = false;
		}
		String json = "{\"isExist\":" + isExist + "}";
		//response.getWriter().write(json);
		return json;
	}
	
	@RequestMapping(value="gologinRePassword.action")
	public String gotoRePassword() {
		return "repassword";
	}
	
	@RequestMapping(value="loginRepassword.action")
	public String Repassword(HttpServletRequest req,String uppwd,String downpwd,Model model) {
		if(!uppwd.equals(downpwd)) {
			model.addAttribute("error", "请确保2次密码一致");
			return "repassword";
		}
		Object phone = req.getSession().getAttribute("userphone");
		String userphone=(String)phone;
		cservice.updatepwdByPhone(downpwd, userphone);
		return "login";
	}
	
}
