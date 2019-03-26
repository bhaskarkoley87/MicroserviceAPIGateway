package com.hackfse.giveaway.Gateway;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println(
				"Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
		Enumeration<String> enumList = request.getHeaderNames();
		String strKey = "";
		System.out.println("=======================================");
		while(enumList.hasMoreElements()) {
			strKey = enumList.nextElement();
			System.out.print(strKey);
			if(strKey != null) {
				if(!strKey.toString().equalsIgnoreCase("null") & !strKey.toString().trim().equalsIgnoreCase("")) {
					System.out.print(" :::: "+request.getHeader(strKey));
				}
			}
			System.out.println("");
		}
		System.out.println("=======================================");
		return null;
	}
}
