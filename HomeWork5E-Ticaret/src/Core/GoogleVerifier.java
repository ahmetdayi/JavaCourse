package Core;

import Entities.concretes.User;

public class GoogleVerifier implements VerifierService {

	@Override
	public void signUp(User user) {
		System.out.println("Registered in with Google : " + user.getFirstName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("logined in with Google :" + user.getFirstName());
		
	}

}
