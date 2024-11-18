package com.office.springde.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	
	@Value("${server.resource.profile-img}")
	private String serverResourceProfileImg;
		
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		log.info("addResourceHandlers");
		
		// windows
//		registry.addResourceHandler("/profileImg/**")
//		.addResourceLocations("file:///c://member/profile/");
		
		// ubuntu
//		registry.addResourceHandler("/profileImg/**")
//		.addResourceLocations("file:///member/profile/");
		
		registry.addResourceHandler("/profileImg/**")
			.addResourceLocations(serverResourceProfileImg);
	}
	
}
