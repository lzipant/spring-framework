package net.lzip.ant.controller.practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Harrison Lee
 * @description TODO
 * @date 2022/6/27 23:10
 */
@RequestMapping("/jackson")
@RestController
public class JacksonController {

	@Getter
	@Setter
	@ToString
	static class LdtPair {
		String title;
		int num;
		LocalDateTime start;
		LocalDateTime end;
	}

	@PostMapping("/calculateSeconds")
	public long calculateSeconds(@RequestBody LdtPair ldtPair) {
		/*return ldtPair.getTitle().length() * (long) ldtPair.getNum();*/
		return Math.abs(Duration.between(ldtPair.start, ldtPair.end).getSeconds());
	}
}
