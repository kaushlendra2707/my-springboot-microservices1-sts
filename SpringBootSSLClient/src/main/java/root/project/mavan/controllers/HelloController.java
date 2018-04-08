package root.project.mavan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "client")
public class HelloController {
	@RequestMapping(value= "hello")
	public String sayHello() {
		return "Hello world from client";
	}
}
