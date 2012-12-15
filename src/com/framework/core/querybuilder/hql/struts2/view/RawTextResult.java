package com.framework.core.querybuilder.hql.struts2.view;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;


/**
 * 功能:
 * @author yuyang
 * @version 1.0
 * @since Jun 6, 20093:38:25 PM
 */
public class RawTextResult extends StrutsResultSupport {

	protected void doExecute(String finalLocation, ActionInvocation actionInvocation) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
        response.getWriter().write(actionInvocation.getResultCode());
        response.flushBuffer();
	}

}