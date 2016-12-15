package com.hou.server.impl;

import javax.servlet.http.HttpServlet;

import com.hou.server.IHelloService;

public class IHelloServiceImpl extends HttpServlet implements IHelloService {

	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello(String name) {
		return "hello:" + name;
	}

}
