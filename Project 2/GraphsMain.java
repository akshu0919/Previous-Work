import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GraphsMain extends JFrame{
	
	public static void main(String[] args) throws FileNotFoundException{
		
		FileReader object = new FileReader();
		GraphsMain p = new GraphsMain();
		
		object.checkStatus();
		//System.out.println(object.isMarried());
		//System.out.println(object.hasChildren());	
	}
	
	public GraphsMain() {
		
		JTextField label1 = new JTextField();
		add(label1, BorderLayout.SOUTH);
		label1.setText("       Married                                "
				+ "Not Married                            "
				+ "Unknown                                "
				+ "Have Children                          "
				+ "No Children                            "
				+ "Maximum");
		
		
		setTitle("Marriage and Children Data based on 100 people");
        setSize(900, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
	
	public void paint (Graphics g) {
		FileReader object = new FileReader();
		try {
			object.checkStatus();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.red);	
		g.fillRect(0, (1000-(object.married * 10)) - 25, 
				100, (object.married * 10));
		g.setColor(Color.black);	
		g.fillRect(150, (1000-(object.notMarried * 10)) - 25, 
				100, (object.notMarried * 10));
		g.setColor(Color.orange);	
		g.fillRect(300, (1000-(object.unknown * 10)) - 25, 
				100, (object.unknown * 10));
		g.setColor(Color.blue);	
		g.fillRect(450, (1000-(object.hasChild * 10)) - 25, 
				100, (object.hasChild * 10));
		g.setColor(Color.green);	
		g.fillRect(600, (1000-(object.noChild * 10)) - 25, 
				100, (object.noChild * 10));
		g.setColor(Color.pink);	
		g.fillRect(750, 0, 100, 1000);
	}

}
