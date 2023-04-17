package net.lzip.ant.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.support.JstlUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * @author harrisonlee
 * @date 3/15/23 04:34
 * @tag
 * @description TODO
 */
@RestController
@RequestMapping("/parameter")
public class ParameterTestController {

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam MultipartFile file) {
		return file == null ? "file is null" : file.getOriginalFilename();
	}

	@GetMapping("/test2")
	public String test2(@RequestParam int pageNo, @RequestParam int pageSize, @RequestBody(required = false) Map<String, Object>params) {
		return (pageNo + pageSize) + "";
	}

	@PostMapping("/test3")
	public String test3(@RequestParam int pageNo, @RequestParam int pageSize, @RequestParam List<Integer> operatorId) {
		return (pageNo + pageSize) + "";
	}

	static class Sim {
		String msisdn;
		String iccid;

		// @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
		LocalDateTime openTime;

		public String getMsisdn() {
			return msisdn;
		}

		public void setMsisdn(String msisdn) {
			this.msisdn = msisdn;
		}

		public String getIccid() {
			return iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}

		public LocalDateTime getOpenTime() {
			return openTime;
		}

		public void setOpenTime(LocalDateTime openTime) {
			this.openTime = openTime;
		}
	}

	@PostMapping("/test4")
	public LocalDateTime test4(@RequestBody List<Sim> simList) {
//		if (simList != null && simList.size() > 0) {
//			String msisdn = simList.get(0).getMsisdn();
//			System.out.println(msisdn);
//		}

		return LocalDateTime.now();
	}
}
