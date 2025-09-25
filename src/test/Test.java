package test;

import model.User;

public class Test {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User ();
		System.out.println(1);
		System.out.println(user1);
		System.out.println(user2.name);
		System.out.println(user2);
		user1.setName("marcos");
		System.out.println(user2.getName());
		User User3 = new User("marcos", 234, null, null, null, 5, null);
		System.out.println(user3.getEmail());
		
		
	}
} 
