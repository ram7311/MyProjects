package com.contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contact {
	
	private int userId;
	private int phoneNo;	
	private String email;

}
