package br.inatel.dm110.hello.impl;

import br.inatel.dm110.hello.api.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "<h1>Hello " + name + "!!!</h1>";
	}

}
