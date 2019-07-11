package com.ITC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"com.ITC"})
public class ItcConfig // this class is a replacement of dispatcher servlet (replacement of file-servlet.xml)
{
	
	
	
	// we are creating a bean class here using InternalViewResolver in order to specify the path where our file exist and the extension of the file.
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		
		return vr;
	}

}
