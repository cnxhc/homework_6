package com.xhc.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.xhc.bean.User;

public class LoginAction extends ActionSupport {
	private User user;

	/**
	 * 获取请求的用户名和密码，判断如果用户名是admin，密码是：123 返回 success给 Struts2 反之返回
	 * error。将字符串交给Struts.xml文件处理
	 */
	@Override
	public String execute() throws Exception {
		if (user != null && user.getUsername().equals("admin") && user.getPassword().equals("123")) {
			ServletRequest request = ServletActionContext.getRequest();
			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			return "success";
		} else {
			return "error";
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
