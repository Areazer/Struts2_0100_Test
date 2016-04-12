package ognl;

public class User {
	private int age=8;
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public User(){

	}
	
	
	

	public User(int age) {
		super();
		this.age = age; 
	}
	
	public String toString(){
		return "user"+ age;
		
	}
	
	
	    
}
