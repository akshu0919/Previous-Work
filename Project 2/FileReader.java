import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
	
	int married = 0;
	int notMarried = 0;
	int unknown = 0;
	int hasChild = 0;
	int noChild = 0;
	String data[] = new String[99];

	void checkStatus() throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("data/proj4DataTest2.csv"));
		scanner.nextLine();
		
		for(int i = 0; i < 99; i++) {
			data[i] = scanner.nextLine();
		}
		
		ArrayList<GraphInterface> status = new ArrayList<GraphInterface>();
		String[] parts = new String[4];
		
		for(String m : data) {
			parts = m.split("[,]");
			
			//If statements to check marriage status
			if(parts[2].equals(" yes")) {
				married++;
			}
			else if(parts[2].equals(" no")) {
				notMarried++;
			}
			else if(parts[2].equals(" unknown")) {
				unknown++;
			}
			
			//if statements to check children status
			if(parts[3].equals(" true")) {
				hasChild++;
			}
			else if(parts[3].equals(" false")) {
				noChild++;
			}
			
			status.add(new GraphInterface(parts[0]
					, parts[1]
					,parts[2], parts[3]));
		}
		
		for(int i = 0; i < 99; i++) {
			System.out.println(status.get(i));
		}
		
		
	}
	
	String isMarried() {
		
		String retVal = "";
		
		retVal += "Married: " + married + "\n";
		retVal += "Not Married: " + notMarried + "\n";
		retVal += "Unknown: " + unknown + "\n";
		
		return retVal;
	}
	
	String hasChildren() {
		
		String retVal = "";
		
		retVal+= "People with Children: " + hasChild + "\n";
		retVal+= "People without Children " + noChild + "\n";
		
		return retVal;
	}
	

}
