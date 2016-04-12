package ognl;

import com.opensymphony.xwork2.ActionSupport;

public class ognlAction extends ActionSupport{
	private Cat cat;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	private static final long serialVersionUID = 1L;
	
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private String password;
	private String username;
	
	
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String m(){
		return "hello";
	}



	
	
	
	
}
