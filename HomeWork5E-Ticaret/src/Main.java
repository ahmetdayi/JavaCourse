import Business.abstracts.UsersService;
import Business.concretes.UsersManager;
import Core.GoogleVerfierAdapter;
import Core.GoogleVerifier;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersService userService = new UsersManager(new HibernateUserDao(),
				new GoogleVerfierAdapter(new GoogleVerifier()));

		User user1 = new User(12342, "user1", "user1", "user1@gmail.com", 2234234);

		User user2 = new User(223423, "user2", "user2", "user2@gmail.com", 43567);

		System.out.println("- user verifier - ");
		userService.signUp(user1);
		userService.confirm(user1);
		userService.login(user1);

		System.out.println("- Google verifier -");
		userService.signUpWithGoogle(user2);
		userService.loginWithGoogle(user2);

	}

}
