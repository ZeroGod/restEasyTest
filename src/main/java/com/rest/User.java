package com.rest;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author zhouxiong
 * @date 2017年1月12日
 */
@AllArgsConstructor
@Data
public class User {

	private String name;

	private String nickname;

	private int age;

	// 使用了lombok后不需要get，set方法
	/*
	 * public User(String name, String nickname, int age) { this.name = name;
	 * this.nickname = nickname; this.age = age; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getNickname() { return nickname; }
	 * 
	 * public void setNickname(String nickname) { this.nickname = nickname; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */

}
