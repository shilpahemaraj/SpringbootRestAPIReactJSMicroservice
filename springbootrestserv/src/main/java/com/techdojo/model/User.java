package com.techdojo.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
	private int userId;
	private String firstName;
	private String lastName;
}
