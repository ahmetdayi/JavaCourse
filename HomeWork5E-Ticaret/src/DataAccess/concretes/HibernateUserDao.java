package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users = new ArrayList<User>();

	@Override
	public void signUp(User user) {
		System.out.println("Welcome" + user.getFirstName() + " " + user.getLastName()+
				user.getEmail() + " click on the verification code in this email.");
		users.add(user);
		
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " User is login succesfully");
		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail() +
				" : Email has been verified successfully.");
        user.setVer(true);
		
	}

	@Override
	public List<User> getUsers() {
		
		return this.users;
	}
	
	

}
