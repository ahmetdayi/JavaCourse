
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
		return "1) %30 indirim" + " 2) Alaca�� di�er oyunda 3 DLC ve %10 indirim" + " 3) �ndirim �eki";
	}
	public void setSelectCompany(int selectCompany,SignUpOrDelet signUpOrDelet) {
		
		if(selectCompany == 1) {
			System.out.println(signUpOrDelet.getFirstName() + " " + signUpOrDelet.getLastName() + 
					" 1. kampanyay� secti�i icin % 30 indirim kazand�");
			
			}
		else if(selectCompany == 2) {
			System.out.println(signUpOrDelet.getFirstName() + " " + signUpOrDelet.getLastName() + 
					" 2. kampanyay� secti�i icin alaca�� di�er oyunda 3 DLC ve %10 indirim kazand�");
		}
		else if(selectCompany == 3 )
			System.out.println(signUpOrDelet.getFirstName() + " " + signUpOrDelet.getLastName() + 
					" 3. kampanyay� secti�i icin indirim �eki kazand�");
		else
			System.out.println("Mevcut 3 kampanya bulunmaktad�r");
			
		this.selectCompany = selectCompany;
	}

}
