package com.rest.controller;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.rest.utils.SomeBean;
import com.rest.utils.SomeBean2;

@RestController
public class FilterController {
	// static filtering
	@GetMapping("/filtering")
	public SomeBean retriveSomeBean() {
		return new SomeBean("field1", "field2", "field3");
	}

	// dynamic filtering
	@GetMapping("/d-filtering")
	public MappingJacksonValue retriveSomeBeanD() {
		SomeBean2 someBean2 = new SomeBean2("field1", "field2", "field3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(someBean2);
		mapping.setFilters(filters);
		return mapping;
	}

}
