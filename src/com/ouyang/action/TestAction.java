package com.ouyang.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private Map<String, Object> request_map;
	private Map<String, Object> session_map;
	private Map<String, Object> application_map;

	@SuppressWarnings("unchecked")
	public TestAction() {
		// 获取ActionContext对象
		ActionContext context = ActionContext.getContext();
		request_map = (Map<String, Object>) context.get("request");
		session_map = context.getSession();
		application_map = context.getApplication();
	}

	@Override
	public String execute() throws Exception {
		// 字符串信息
		String info = "欧阳的页面";
		// 向request_map添加信息
		request_map.put("info", info);
		// 向session_map添加信息
		session_map.put("info", info);
		// 向application_map添加信息
		application_map.put("info", info);
		return SUCCESS;
	}
}
