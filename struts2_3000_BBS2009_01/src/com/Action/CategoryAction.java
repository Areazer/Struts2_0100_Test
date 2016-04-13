package com.Action;

import java.util.List;

import com.model.Category;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private  List<Category> categories;
	
	public String list(){
		return "success";	
	}
	
	public String add(){
		return "add";	
	}
	
	public String update(){
		return "update";	
	}
	
	public String delete(){
		return "delete";	
	}
	
	public String input(){
		return "input";	
	}
	
}
