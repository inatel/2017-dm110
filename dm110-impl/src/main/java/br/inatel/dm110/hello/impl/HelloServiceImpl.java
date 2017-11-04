package br.inatel.dm110.hello.impl;

import br.inatel.dm110.hello.api.HelloService;
import br.inatel.dm110.hello.api.Result;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "<h1>Hello " + name + "!!!</h1>";
	}

	@Override
	public Result message(String first, String last) {
		Result result = new Result();
		result.setFirstName(first);
		result.setLastName(last);
		String message = String.format("Hello %s %s!!!", first, last);
		result.setMessage(message);
		return result;
	}

}
