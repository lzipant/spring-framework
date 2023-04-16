package net.lzip.ant.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @author Harrison Lee
 * @description TODO
 * @date 2022/6/27 0:03
 */
@Configuration
public class JacksonConfiguration implements WebMvcConfigurer {

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		ObjectMapper objectMapper = new ObjectMapper();
		extendObjectMapper(objectMapper);
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter(objectMapper);
		converters.set(0, mappingJackson2HttpMessageConverter);
	}

//	@Bean
//	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//		return new MappingJackson2HttpMessageConverter(objectMapper());
//	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		extendObjectMapper(objectMapper);
		return objectMapper;
	}

	private static final DateTimeFormatter ymdhms = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	private static final DateTimeFormatter ymd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private static final DateTimeFormatter hms = DateTimeFormatter.ofPattern("HH:mm:ss");


	public void extendObjectMapper(ObjectMapper objectMapper) {
		// objectMapper.disableSerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		//new JsonMapper.Builder(objectMapper).configure(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS, false);

		JavaTimeModule javaTimeModule = new JavaTimeModule();
		//序列化设置时间格式
		javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(ymdhms));
		javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(ymd));
		javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(hms));
		//反序列化设置时间格式
		javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(ymdhms));
		javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(ymd));
		javaTimeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer(hms));

		objectMapper.registerModule(javaTimeModule);
//		objectMapper.configure(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS, false);
//		objectMapper.registerModule(javaTimeModule);
//		objectMapper.configure(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS, true);
		/*objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")); // 针对Date类型
		objectMapper.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));*/
	}

}