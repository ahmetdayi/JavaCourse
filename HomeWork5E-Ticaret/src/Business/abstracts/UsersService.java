package Business.abstracts;

import Entities.concretes.User;

public interface UsersService {
	void signUp(User user);
	void login(User user);
	void confirm(User user);
	void signUpWithGoogle(User user);
	void loginWithGoogle(User user);

}
