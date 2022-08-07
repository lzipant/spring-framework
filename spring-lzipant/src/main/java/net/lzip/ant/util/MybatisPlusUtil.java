package net.lzip.ant.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

/**
 * @author Harrison Lee
 * @description TODO
 * @date 2022/6/26 17:04
 */
public class MybatisPlusUtil {

	public static void generate() {
		String url = "jdbc:mysql://zlink.com:3306/zlink?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false";
		String username = "zlink_admin";
		String password = "zlink123456";
		FastAutoGenerator.create(url, username, password)
			.globalConfig(builder -> {
				builder.author("Harrison Lee")
						.outputDir("E:\\projects\\spring-framework\\spring-lzipant\\src\\main\\java")
						.commentDate("yyyy-MM-dd HH:mm:ss");
			})
			.packageConfig(builder -> {
				builder.parent("net.lzip.ant")
						/*.moduleName("spring-lzipant")*/
						.entity("model")
						.service("service")
						.serviceImpl("serviceImpl")
						.mapper("mapper")
						.xml("mapper.xml")
						.controller("controller");
			})
			.strategyConfig(builder -> {
				builder.addInclude("sim", "sim_status", "ec", "operator_ec");
				builder.entityBuilder()
						.enableLombok()
						.controllerBuilder()
						.enableRestStyle()
						.mapperBuilder()
						.enableMapperAnnotation();
			})
			.execute();
	}
}
