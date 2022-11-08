package net.lzip.ant.controller.practice;

import net.lzip.ant.model.SimStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author Harrison Lee
 * @description TODO
 * @date 2022/6/25 19:44
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/test")
	public SimStatus test() {
		/*Sim sim = new Sim();
		SimStatus ss = new SimStatus();
		ss.setSim(sim);
		BeanWrapper ssWrapper = new BeanWrapperImpl(ss);
		ssWrapper.setPropertyValue("lifecycle", 6);
		ssWrapper.setPropertyValue("sim.msisdn", "1234567890");
		System.out.println(ssWrapper.getPropertyValue("sim.iccid"));

		return ss;*/
		return null;
	}

	@GetMapping("/greet")
	public String hello(String name) {
		return "[spring-framework] hello1 : " + name.toUpperCase();
	}

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam CommonsMultipartFile file, String name, @RequestParam(defaultValue = "24") int age) {
		System.out.println("name : " + name);
		System.out.println("age: " + age);
		return file.getOriginalFilename();
	}

}
