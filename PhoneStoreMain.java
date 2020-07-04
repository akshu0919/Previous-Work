import java.io.FileNotFoundException;

public class PhoneStoreMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		PhoneStoreHelperMethods object = new PhoneStoreHelperMethods();
		
		//Welcome Page
		object.welcome();

		//Name asking page
		object.nameAsker();
		
		//Determines if contract is needed
		object.contractChoice();
		
		//Determines which model the buyer wants
		object.modelChoice();
	}

}
