package root.project.maven.controllers;


import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

	private static final String SERVICE_URL ="http://localhost:8282/client/hello";
	private static final String PASSWORD ="client";
	private static final String CERT_PATH = "E:\\Spring\\STS projects\\SpringBootSSLClient\\src\\main\\resources\\client.jks";
	
	@RequestMapping
	public String sayHello() {
		System.out.println("Hello World from server");
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(SERVICE_URL,HttpMethod.GET,null,String.class);
		System.out.println(response);
		return response.getBody();
	}
	
	@RequestMapping("data")
	public String getDataFromClient() {
		return null;
	}
	
}
