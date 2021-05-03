
public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {
				new IdentityLogger() , new FirstNameLogger() , new LastNameLogger() , new BirthYearLogger()
		};
		SignUpOrDelManager signUpOrDelManager = new SignUpOrDelManager(loggers);	
		SignUpOrDelet ahmet = new SignUpOrDelet("45612368", "Ahmet ", "Dayý ", 2021);
		
		signUpOrDelManager.add(ahmet);
		System.out.println("/--------------------------------------------------------------------");
		GameSell gameSell = new GameSell();
		Company company = new Company();
		System.out.println(company.getCompany());
		System.out.println();
		company.setSelectCompany(1, ahmet);
		
		gameSell.buyGame(ahmet, "Gta5");
		

	}

}
