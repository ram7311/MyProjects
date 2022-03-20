package com.junit5.testcases;

import java.util.stream.Stream;

public class Utils {
	
	public static boolean isBlank(String in) {
		return in==null || in.trim().isEmpty(); 
	}

	public static Stream<String> arguments() {
		return Stream.of("Mahesh","Prabhas","NTR"); 
	}

}
