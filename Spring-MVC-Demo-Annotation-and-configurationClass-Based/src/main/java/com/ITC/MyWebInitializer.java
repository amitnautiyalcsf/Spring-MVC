package com.ITC;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Below class is a replacement of web.xml file 
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {ItcConfig.class}; // mentioning our configuration class
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};  //mapping the resource urls
	}

}
