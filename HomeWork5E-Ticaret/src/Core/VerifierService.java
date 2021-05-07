package Core;

import Entities.concretes.User;

public interface VerifierService {
	void signUp(User user);
    void login(User user);

}
