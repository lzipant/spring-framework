package net.lzip.ant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Harrison Lee
 * @description TODO
 * @date 2022/6/28 18:09
 */
// @Configuration
public class DateConverterConfig {
	@Bean
	public Converter<String, LocalDate> localDateConverter() {
		return source -> LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	@Bean
	public Converter<String, LocalTime> localTimeConverter() {
		return source -> LocalTime.parse(source, DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	@Bean
	public Converter<String, LocalDateTime> localDateTimeConverter() {
		return source -> LocalDateTime.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

}
