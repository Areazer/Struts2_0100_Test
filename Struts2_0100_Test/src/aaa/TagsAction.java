package aaa;

import com.opensymphony.xwork2.ActionSupport;

public class TagsAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
	
		return super.execute();
	}
	
	private static final long serialVersionUID = 1L;
	private String password;
	private String username;
	
	public TagsAction(){
		
		
	}
	
	
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
}
