package com.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("userservice")
public class UserService {
	/**
	 * 初始化用户数据
	 */
	static Map<Integer, Object> map = new HashMap<Integer, Object>();

	static {
		User user1 = new User("test1", "test1", 1);
		map.put(1, user1);
		User user2 = new User("test2", "test2", 2);
		map.put(2, user2);
		User user3 = new User("test3", "test3", 3);
		map.put(3, user3);
	}

	/**
	 * 获取指定Id的用户信息
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("user/{id}")
	@Produces("application/json")
	public User getById(@PathParam("id") Integer id) {
		return (User) map.get(id);
	}

	/**
	 * 获取所有用户列表的JSON数据
	 * 
	 * @return
	 */
	@GET
	@Path("users")
	@Produces("application/json")
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		for (Integer index : map.keySet()) {
			User user = (User) map.get(index);
			users.add(user);
		}
		return users;
	}

	/**
	 * 获取的用户传入的信息
	 * 
	 * @param msg
	 * @return
	 */
	@GET
	@Path("user/trans/{msg}")
	public String getMessage(@PathParam("msg") String msg) {
		return "[Hello dear! ]" + ",MSG:{" + msg + "}";
	}

	@GET
	@Path("user/test/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Restful example : " + msg;
		return Response.status(200).entity(result).build();

	}

}