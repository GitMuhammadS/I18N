package com.shahbaz;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpMvcProj8MiniprojInternationalizatioNApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpMvcProj8MiniprojInternationalizatioNApplication.class, args);
	}
	
	@Bean("messageSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com/shahbaz/commons/App");
		return source;
	}
	
	@Bean("localeResolver")
	public SessionLocaleResolver createSLResolver() {
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(new Locale("en","US"));
		return resolver;
	}
	
	@Bean("lci")
	public LocaleChangeInterceptor createCLInterceptor() {
		LocaleChangeInterceptor interceptor=new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

}
