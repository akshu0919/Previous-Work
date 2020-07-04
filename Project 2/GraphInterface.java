
public class GraphInterface {
	
	private String ID;
	private String occupation;
	private String marriageStatus;
	private String children;

	public GraphInterface(String ID, String occupation,
			String marriageStatus, String children) {
		
		this.ID = ID;
		this.occupation = occupation;
		this.marriageStatus = marriageStatus;
		this.children = children;
		
	}
	
	public String toString() {
		String retVal = "";
		
		retVal += "ID: "+ ID + "\n";
		retVal += "Occupation: "+ occupation + "\n";
		retVal += "Marriage Status: "+ marriageStatus + "\n";
		retVal += "Children: "+ children + "\n";
		return retVal;
		
	}

}
