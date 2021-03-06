package com.framework.web.util;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;


/**
 * 功能:
 * @author yuyang
 * @version 1.0
 * @since Jun 6, 20093:37:57 PM
 */
public class WebUtils {
	
	/**
	 * Returns the value of a request parameter as a String,
	 * or null if the parameter does not exist.
	 * 
	 * @param requestParams the Map of the parameters of this http request
	 * @param paramKey a String specifying the name of the parameter 
	 * @return a String representing the single value of the parameter
	 * 		If the parameter has multi values, the first value will be returned
	 * @see javax.servlet.ServletRequest#getParameterMap
	 * @see javax.servlet.ServletRequest#getParameter
	 */
	public static String getRequestParameter(Map requestParams, String paramKey) {
		Object value = requestParams.get(paramKey);
		if (value == null) {
			return null;
		}
		String[] vals = (String[]) value;
		
		if (vals != null && vals.length > 0) {
			// return first value
			return vals[0];
		}
		return null;
	}
	/**
	 * 得到request的属性key的值
	 *  @param key
	 *  @return
	 *  @author cm
	 *  @created 2010-5-12 上午10:07:36
	 *  @lastModified       
	 *  @history
	 */
	public static String getParameter(String key)
	{
		if(ActionContext.getContext().getParameters().get(key)!=null)
		{
			return ((String[])ActionContext.getContext().getParameters().get(key))[0];
		}
		return null;
	}
	
}
