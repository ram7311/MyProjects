package com.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pojo{

	@JsonProperty("date")
	private String date;
	@JsonProperty("milliseconds_since_epoch")
	private String sec;
	@JsonProperty("time")
	private String time;
	
	
}
