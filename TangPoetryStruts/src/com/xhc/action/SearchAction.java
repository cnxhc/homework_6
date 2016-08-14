package com.xhc.action;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.xhc.bean.Poetries;
import com.xhc.service.PoetriesService;

public class SearchAction extends ActionSupport {
	// 声明业务对象ps
	PoetriesService ps = new PoetriesService();
	// 通过request对象获取客户端请求的搜索内容
	ServletRequest request = ServletActionContext.getRequest();
	String serach_name = request.getParameter("search_name");
	/**
	 * 通过诗人名称查询诗词的名称
	 * 
	 * @return 返回一个成功或失败的字符串
	 */
	public String queryByName() {
		List poetries = ps.queryTitleByName(serach_name);
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		session.setAttribute("poetries", poetries);
		session.setAttribute("serach_name", serach_name);
		if (!poetries.isEmpty()) {
			return "queryByNameSuccess";
		} else {
			return "queryByName_fail";
		}
	}

	/**
	 * 通过诗词名称查询诗词全文内容
	 * 
	 * @return 返回一个成功或失败的字符串
	 */
	public String queryByTitle() {
		List poetries = ps.queryContentByTitle(serach_name);
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		session.setAttribute("poetries", poetries);
		session.setAttribute("serach_name", serach_name);
		if (!poetries.isEmpty()) {
			return "queryByTitleSuccess";
		} else {
			return "queryByTitle_fail";
		}
	}

	/**
	 * 通过诗词名句查询诗词名称和诗人名
	 * 
	 * @return 返回一个成功或失败的字符串
	 */
	public String queryByContent() {
		List poetries = ps.queryNameTitleByContent(serach_name);
		ServletRequest request = ServletActionContext.getRequest();
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		session.setAttribute("poetries", poetries);
		session.setAttribute("serach_name", serach_name);
		if (!poetries.isEmpty()) {
			return "queryByContentSuccess";
		} else {
			return "queryByContent_fail";
		}

	}

	/*
	 * public String getSerach_name() { return serach_name; }
	 * 
	 * public void setSerach_name(String serach_name) { this.serach_name =
	 * serach_name; }
	 */
}
