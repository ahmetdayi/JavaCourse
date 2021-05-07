package Business.concretes;

import Business.abstracts.UsersService;
import Core.EmailVerifier;
import Core.VerifierService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UsersManager implements UsersService {

	private UserDao userDao;
	private VerifierService service;

	public UsersManager(UserDao userDao ,VerifierService service) {
		this.userDao = userDao;
		this.service = service;
	}

	@Override
	public void signUp(User user) {
		for (User users : userDao.getUsers()) {
			if (users.getEmail().equals(user.getEmail())) {
				System.out.println("This email is in use. Please choose another email.! ");
				return;
			}
		}
		if (!EmailVerifier.isEmailValid(user.getEmail())) {
			System.out.println("Email is not suitable for format!");
		} else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Name and surname must contain at least two characters!");
		} else if (Integer.toString(user.getPassword()).length() < 6) {
			System.out.println("Password must be at least 6 characters!");
		} else {
			userDao.signUp(user);
		}

	}

	@Override
	public void login(User user) {
		 if (user.isVer()) {
	            userDao.login(user);
	        } else {
	            System.out.println("login failed, " + user.getEmail() + " : email could not be verified!");
	        }
	    
	}

	@Override
	public void confirm(User user) {
		userDao.confirm(user);

	}

	@Override
	public void signUpWithGoogle(User user) {
		  user.setVer(true);
	        this.service.signUp(user);

	}

	@Override
	public void loginWithGoogle(User user) {
		if (user.isVer()) {
            this.service.login(user);

        } else {
            System.out.println("you cannot login without registration!");
        }

	}

}
