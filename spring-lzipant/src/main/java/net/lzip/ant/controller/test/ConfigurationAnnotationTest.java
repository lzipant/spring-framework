package net.lzip.ant.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("config")
public class ConfigurationAnnotationTest {

	@Configuration()
	public class FullConfig {
		@Bean("title")
		public String getTitle() {
			return UUID.randomUUID().toString();
		}
	}

	@Component
	public class LiteConfig {
		@Bean("title")
		public String getTitle() {
			return UUID.randomUUID().toString();
		}
	}

	@Autowired
	private FullConfig fullConfig;

	@Autowired
	private LiteConfig liteConfig;

	@GetMapping("test")
	public void test() {
		String fullTitle1 = fullConfig.getTitle();
		String fullTitle2 = fullConfig.getTitle();
		System.out.println("fullTitle1 == fullTitle2 ? " + (fullTitle1 == fullTitle2));

		String liteTitle1 = liteConfig.getTitle();
		String liteTitle2 = liteConfig.getTitle();
		System.out.println("liteTitle1 == liteTitle2 ? " + (liteTitle1 == liteTitle2));

	}

}
