package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestfulApplication.class, args);
	}
	
	/*
	 * @Bean public LocaleResolver localeResolver() {
	 * 
	 * AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
	 * localResolver.setDefaultLocale(Locale.US); return localResolver; }
	 */
	/*
	 * public MessageSource MessageSource() {
	 * 
	 * ResourceBundleMessageSource messageSource = new
	 * ResourceBundleMessageSource(); messageSource.setBasename("messages"); return
	 * messageSource; }
	 */
	
}
