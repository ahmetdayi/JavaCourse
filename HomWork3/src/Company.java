
public class Company {
	
	private int companyNumber = 2 ;
	private int deleteCompany;
	private int increaseCompany;
	private String company;
	private int selectCompany;
	
	
	
	public int getDeleteCompany() {
		return companyNumber - deleteCompany;
	}
	public void setDeleteCompany(int deleteCompany) {
		this.deleteCompany = deleteCompany;
	}
	public int getIncreaseCompany() {
		return  companyNumber + increaseCompany;
	}
	public void setIncreaseCompany(int increaseCompany) {
		this.increaseCompany = increaseCompany;
	}
	public int getCompanyNumber() {
		return companyNumber;
	}
	public String getCompany() {
		return "1) %30 indirim" + " 2) Alacaðý diðer oyunda 3 DLC ve %10 indirim" + " 3) Ýndirim çeki";
	}
	public void setSelectCompany(int selectCompany,SignUpOrDelet signUpOrDelet) {
		
		if(selectCompany == 1) {
			System.out.println(signUpOrDelet.getFirstName() + " " + signUpOrDelet.getLastName() + 
					" 1. kampanyayý sectiði icin % 30 indirim kazandý");
			
			}
		else if(selectCompany == 2) {
			System.out.println(signUpOrDelet.getFirstName() + " " + signUpOrDelet.getLastName() + 
					" 2. kampanyayý sectiði icin alacaðý diðer oyunda 3 DLC ve %10 indirim kazandý");
		}
		else if(selectCompany == 3 )
			System.out.println(signUpOrDelet.getFirstName() + " " + signUpOrDelet.getLastName() + 
					" 3. kampanyayý sectiði icin indirim çeki kazandý");
		else
			System.out.println("Mevcut 3 kampanya bulunmaktadýr");
			
		this.selectCompany = selectCompany;
	}

}
