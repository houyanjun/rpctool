package com.hou.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.hou.server.IHelloService;

public class TestClient {
	public static void main(String[] args) {
		testHelloService2();
	}

	private static void testHelloService1() {
		String url = "http://localhost:8080//tool-rpc//hessian/HelloService";
		HessianProxyFactory factory = new HessianProxyFactory();
		try {
			IHelloService helloService = (IHelloService) factory.create(IHelloService.class, url);
			System.out.println(helloService.sayHello("Hesssian"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	private static void testHelloService2() {
		String url = "http://localhost:8080/tool-rpc/hessian/HelloService";
		HessianProxyFactory factory = new HessianProxyFactory();
		try {
			IHelloService helloService = (IHelloService) factory.create(url);
			System.out.println(helloService.sayHello("Hesssian"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
