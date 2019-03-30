package com.techdojo.resource.impl;

import java.util.List;

import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;
import com.techdojo.model.User;
import com.techdojo.resource.UserResource;
import com.techdojo.util.UserList;

@Component
public class UserResourceImpl implements UserResource {
	private User user;

	@Override
	public Response getUserWithId(int userId) {

		UserList.getUserList().stream().forEach(obj -> {
			if (obj.getUserId() == userId)
				user = obj;
		});
		return Response.ok().header("Access-Control-Allow-Origin", "*").entity(user).build();
	}

	@Override
	public Response getUserList() {
		List<User> userList = UserList.getUserList();
		return Response.ok().header("Access-Control-Allow-Origin", "*").entity(userList).build();
	}

}
