
public class PhoneModelEntry {
	private String modelName;
	private double basePrice;
	private double priceWithoutContract;
	private String imagePath;
	
	public PhoneModelEntry(String modelName,
			double basePrice,
			double priceWithoutContract,
			String imagePath) {
		
		this.modelName = modelName;
		this.basePrice = basePrice;
		this.priceWithoutContract = priceWithoutContract;
		this.imagePath = imagePath;
		
		
	}
	
	public String toString() {
		String retVal = modelName;
		
		retVal += " - $ "+ basePrice;
		retVal += " ($" + this.priceWithoutContract;
		retVal += " no-contract)";
		return retVal;
		
	}
	
	public boolean equals(Object o) {
		boolean retVal = false;
		
		if(o instanceof PhoneModelEntry) {
			PhoneModelEntry ph = (PhoneModelEntry)o;
		retVal = modelName.equals(ph.modelName);	
		}
		
		return retVal;
		
	}
	
	public String displayEntryPerContract(boolean c) {
		String retVal = modelName;
		retVal += " - $" ;
		retVal += c ? this.basePrice : this.priceWithoutContract;
		return retVal;
	}

}
