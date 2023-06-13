package com.student.demo;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;

import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class Auto {
	public static void auto(){
		String projectPath = System.getProperty("user.dir");
		FastAutoGenerator.create("jdbc:mysql://localhost:3306/student?serverTimezone=GMT%2b8", "root", "123")
		.globalConfig(builder -> {
			builder.author("laoxue") // 设置作者
				.fileOverride() // 覆盖已生成文件
				.outputDir(projectPath+"/src/main/java"); // 指定输出目录
		})
		.packageConfig(builder -> {
			builder.parent("com.student") // 设置父包名
					.moduleName("demo");// 设置父包模块名
		})
		.strategyConfig(builder -> {
			builder.entityBuilder().enableLombok();
			builder.mapperBuilder().enableMapperAnnotation().build();
			builder.controllerBuilder().enableHyphenStyle()  // 开启驼峰转连字符
					.enableRestStyle();  // 开启生成@RestController 控制器
		})
		.templateConfig(builder -> {
			builder.service("templates/service");
			builder.serviceImpl("templates/serviceImpl");
			builder.entity("templates/entity");
			builder.controller("templates/controller");
			

		})
        .templateEngine(new FreemarkerTemplateEngine()
				
		) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
				
		.execute();
	}
}

