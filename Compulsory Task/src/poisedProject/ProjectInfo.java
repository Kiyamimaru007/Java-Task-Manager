package poisedProject;

public class ProjectInfo {

	//Attributes
	private String projectNum;
	private String projectName;
	private String type;
	private String phyAddress;
	private String erfNum;
	private String totalFee;
	private String totalPaid;
	private String projDeadline;
	
	//Constructor
	public ProjectInfo(String projectNum, String projectName, String type, String phyAddress, String erfNum, 
			String totalFee, String totalPaid, String projDeadline) {
		this.projectNum = projectNum;
		this.projectName = projectName;
		this.type = type;
		this.phyAddress = phyAddress;
		this.erfNum = erfNum;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.projDeadline = projDeadline;
	}
	
	//Getters
	public String getProjectNum() {
		return projectNum;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public String getType() {
		return type;
	}
	
	public String getPhyAddress() {
		return phyAddress;
	}
	
	public String getErfNum() {
		return erfNum;
	}
	
	public String getTotalFee() {
		return totalFee;
	}
	
	public String getTotalPaid() {
		return totalPaid;
	}
	
	public String getProjDeadline() {
		return projDeadline;
	}
	
	//Setters
	public void setProjectNum(String newProjectNum) {
		this.projectNum = newProjectNum;
	}
	
	public void setProjectName(String newProjectName) {
		this.projectName = newProjectName;
	}
	
	public void setType(String newType) {
		this.type = newType;
	}
	
	public void setPhyAddress(String newPhyAddress) {
		this.phyAddress = newPhyAddress;
	}
	
	public void setErfNum(String newErfNum) {
		this.erfNum = newErfNum;
	}
	
	public void setTotalFree(String newTotalFree) {
		this.totalFee = newTotalFree;
	}
	
	public void setTotalPaid(String newTotalPaid) {
		this.totalPaid = newTotalPaid;
	}
	
	public void setProjDeadline(String newProjDeadline) {
		this.projDeadline = newProjDeadline;
	}
	
	//Methods
	public String toString() {
		String detailsString = "\nProject Number: " + projectNum + "\nProject Name: " + projectName +
								"\nProject Type: " + type + "\nProject Physical Address: " + phyAddress +
								"\nProject ERF Number: " + erfNum + "\nTotal Fee: " + totalFee +
								"\nTotal Paid: " + totalPaid + "\nProject Deadline: " + projDeadline;
		return detailsString;
	}
	
}
