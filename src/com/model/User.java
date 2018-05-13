package com.model;

/**
 * Created by QQQ on 2018/5/13.
 */

/**
 * model类的属性getter setter等要规范
 */
public class User {
	private String name;
	private String password;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

}
