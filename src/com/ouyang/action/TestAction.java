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
		// ��ȡActionContext����
		ActionContext context = ActionContext.getContext();
		request_map = (Map<String, Object>) context.get("request");
		session_map = context.getSession();
		application_map = context.getApplication();
	}

	@Override
	public String execute() throws Exception {
		// �ַ�����Ϣ
		String info = "ŷ����ҳ��";
		// ��request_map�����Ϣ
		request_map.put("info", info);
		// ��session_map�����Ϣ
		session_map.put("info", info);
		// ��application_map�����Ϣ
		application_map.put("info", info);
		return SUCCESS;
	}
}
