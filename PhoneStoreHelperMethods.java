import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PhoneStoreHelperMethods {
	
	//variables
	Icon icon = new ImageIcon("Images/StoreIcon.png");
	private String customerName;
	private String firstName;
	protected boolean needContract;
	private Object modelSelection;
	
	public PhoneStoreHelperMethods() {
	
	}
	
	//Welcome Page
		public void welcome() {
			Object Welcome = JOptionPane.showOptionDialog(null, 
					"Welcome to Marvelous Phones Inc."
					, "Marvelous Phones Inc."
					,JOptionPane.OK_CANCEL_OPTION
					,JOptionPane.PLAIN_MESSAGE
					, icon, null, 0);
		}
		
		//Asks Customer's Name
		public String nameAsker() {
			customerName = JOptionPane.showInputDialog(null
					, "What is your name"
					, "Marvelous Phones Inc."
					, JOptionPane.INFORMATION_MESSAGE);
		
			int index = customerName.indexOf(" ");
			firstName = customerName.substring(0, index);
		
			return customerName;
			}
		
		//Determines if contract is needed
		public boolean contractChoice() {
			int contractChoice = JOptionPane.showOptionDialog(null, 
					"Hello " + firstName + ".\n" + "Do you need a contract?"
					, "Marvelous Phones Inc."
					,JOptionPane.YES_NO_OPTION
					,JOptionPane.QUESTION_MESSAGE
					, null, null, 0);

			boolean needContract = false;

			if(contractChoice == 0) {
				needContract = true;
			}
			else needContract = false;
			
			return needContract;
		}
		
		public Object modelChoice() throws FileNotFoundException {
			
			Scanner input = new Scanner(new File("data/phonemodels.txt"));
			String[] modelInfo = new String[4];
			String[] modelInfo2 = new String[4];
			
			for(int i = 0; i < 4; i++) {
				modelInfo[i] = input.nextLine();
			}
			
			ArrayList<PhoneModelEntry> phones = new ArrayList<PhoneModelEntry>();
			String[] parts = new String[3];
			
			for(String m : modelInfo) {
				parts = m.split("[$]");
				phones.add(new PhoneModelEntry(parts[0]
						, Double.parseDouble(parts[1])
						,Double.parseDouble(parts[2]), null));
			}
			
			for(int i = 0; i < 4; i++) {
				modelInfo2[i] = phones.get(i).displayEntryPerContract(needContract);
				
			}
			
			modelSelection = JOptionPane.showInputDialog(null, "Select a model..."
						, "Marvelous Phones Inc."
						, JOptionPane.INFORMATION_MESSAGE
						, icon , modelInfo2, modelInfo2[0]);
			
			return modelSelection;
		}
		

}
