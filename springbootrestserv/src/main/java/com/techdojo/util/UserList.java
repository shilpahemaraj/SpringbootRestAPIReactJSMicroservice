package com.techdojo.util;

import java.util.ArrayList;
import java.util.List;

import com.techdojo.model.User;

public class UserList {

	public static List<User> getUserList() {
		List<User> userList = new ArrayList<User>();

		userList.add(User.builder().userId(1).firstName("firstFirst").lastName("firstLast").build());
		userList.add(User.builder().userId(2).firstName("secondFirst").lastName("secondLast").build());
		userList.add(User.builder().userId(3).firstName("thirdFirst").lastName("thirdLast").build());
		userList.add(User.builder().userId(4).firstName("fourthFirst").lastName("fourthLast").build());
		return userList;
	}
}