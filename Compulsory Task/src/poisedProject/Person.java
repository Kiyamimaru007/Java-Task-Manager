package poisedProject;

public class Person {
	
	//Architect Attributes
	private String archName;
	private String archTelNum;
	private String archEmail;
	private String archPhyAddress;
	
	//Contractor Attributes
	private String conName;
	private String conTelNum;
	private String conEmail;
	private String conPhyAddress;
	
	//Customer Attributes
	private String custName;
	private String custTelNum;
	private String custEmail;
	private String custPhyAddress;
	
	//Constructor
	public Person(String archName, String archTelNum, String archEmail, String archPhyAddress, String conName, String conTelNum, String conEmail, 
					String conPhyAddress, String custName, String custTelNum, String custEmail, String custPhyAddress) {
		this.archName = archName;
		this.archTelNum = archTelNum;
		this.archEmail = archEmail;
		this.archPhyAddress = archPhyAddress;
		this.conName = conName;
		this.conTelNum = conTelNum;
		this.conEmail = conEmail;
		this.conPhyAddress = conPhyAddress;
		this.custName = custName;
		this.custTelNum = custTelNum;
		this.custEmail = custEmail;
		this.custPhyAddress = custPhyAddress;
	}
	
	//Getters
	public String getArchName() {
		return archName;
	}
	
	public String getArchTelNum() {
		return archTelNum;
	}
	
	public String getArchEmail() {
		return archEmail;
	}
	
	public String getArchPhyAddress() {
		return archPhyAddress;
	}
	
	public String getConName() {
		return conName;
	}
	
	public String getConTelNum() {
		return conTelNum;
	}
	
	public String getConEmail() {
		return conEmail;
	}
	
	public String getConPhyAddress() {
		return conPhyAddress;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public String getCustTelNum() {
		return custTelNum;
	}
	
	public String getCustEmail() {
		return custEmail;
	}
	
	public String getCustPhyAddress() {
		return custPhyAddress;
	}

	//Setters
	public void setArch(String newArchName) {
		this.archName = newArchName;
	}

	public void setArchTelNum(String newArchTelNum) {
		this.archTelNum = newArchTelNum;
	}
	
	public void setArchEmail(String newArchEmail) {
		this.archEmail = newArchEmail;
	}
	
	public void setArchPhyAddress(String newArchPhyAddress) {
		this.archPhyAddress = newArchPhyAddress;
	}
	
	public void setConName(String newConName) {
		this.conName = newConName;
	}
	
	public void setConTelNum(String newConTelNum) {
		this.conTelNum = newConTelNum;
	}
	
	public void setConEmail(String newConEmail) {
		this.conEmail = newConEmail;
	}
	
	public void setConPhyAddress(String newConPhyAddress) {
		this.conPhyAddress = newConPhyAddress;
	}
	
	public void setCustName(String newCustName) {
		this.custName = newCustName;
	}
	
	public void setCustTelNum(String newCustTelNum) {
		this.custTelNum = newCustTelNum;
	}
	
	public void setCustEmail(String newCustEmail) {
		this.custEmail = newCustEmail;
	}
	
	public void setCustPhyAddress(String newCustPhyAddress) {
		this.custPhyAddress = newCustPhyAddress;
	}
	
	//Methods
	public String toString() {
		String personString = "\nArchitect Name: " + archName + "\nArchitect Telephone Number: " + archTelNum + "\nArchitect Email: " +
								archEmail + "\nArchitect Address: " + archPhyAddress 
								+ "\nContractor Name: " + conName + "\nContractor Telephone Number: " + conTelNum + 
								"\nContractor Email: " + conEmail + "\nContractor Address: " + conPhyAddress 
								+ "\nCustomer Name: " + custName + "\nCustomer Telephone Number: " + custTelNum + "\nCustomer Email: " 
								+ custEmail + "\nCustomer Address: " + custPhyAddress;
		return personString;
	}
}
