package Core;

import Entities.concretes.User;

public class GoogleVerfierAdapter implements VerifierService {

	GoogleVerifier googleVerifier;

	public GoogleVerfierAdapter(GoogleVerifier googleVerifier) {
		this.googleVerifier = googleVerifier;
	}
	
	


	@Override
	public void signUp(User user) {
		 googleVerifier.signUp(user);
		
	}

	@Override
	public void login(User user) {
		 googleVerifier.login(user);
		
	}}
