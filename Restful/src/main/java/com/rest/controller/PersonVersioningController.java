package com.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.utils.Name;
import com.rest.utils.PersonV1;
import com.rest.utils.PersonV2;

@RestController
public class PersonVersioningController {

	// using uri
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Ram Kumar");

	}

	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Ram", "Kumar"));

	}

	// using params
	@GetMapping(value = "/person/params", params = "version=1")
	public PersonV1 personParamV1() {
		return new PersonV1("Ram Kumar");

	}

	@GetMapping(value = "/person/params", params = "version=2")
	public PersonV2 personParamV2() {
		return new PersonV2(new Name("Ram", "Kumar"));

	}

	// using Headers
	@GetMapping(value = "/person/header", headers = "API-VERSION=1")
	public PersonV1 personHeaderV1() {
		return new PersonV1("Ram Kumar");

	}

	@GetMapping(value = "/person/header", headers = "API-VERSION=2")
	public PersonV2 personHeaderV2() {
		return new PersonV2(new Name("Ram", "Kumar"));

	}

	// using Produces
	@GetMapping(value = "/person/produces", produces = "application/persion-api-version-1+json")
	public PersonV1 personProducesV1() {
		return new PersonV1("Ram Kumar");

	}

	@GetMapping(value = "/person/produces", produces = "application/persion-api-version-2+json")
	public PersonV2 personProducesV2() {
		return new PersonV2(new Name("Ram", "Kumar"));

	}

}
