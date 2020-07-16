package gosec;

import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Graphics;

public class MainFrame extends JFrame {

	  public MainFrame(){
	    this.setTitle("Ma première fenêtre Java");
	    this.setSize(1000, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    PanelImage pan = new PanelImage();
	    pan.setBackground(Color.LIGHT_GRAY);
	    pan.setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    this.setContentPane(pan);
	    PanelButton photo = new PanelButton("s'identifier");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 0;       
	    c.weighty = 1.0;   
	    c.anchor = GridBagConstraints.FIRST_LINE_END; 
	    c.insets = new Insets(10,0,0,0);  
	    c.gridx = 3;       
	    c.gridwidth = 2;   
	    c.gridy = 2;
	    Graphics p = getGraphics();
	    
	    this.getContentPane().add(photo, c);
	    while (photo.nom == "Unknown user")
	    {
	    	this.setVisible(true);
	    }
	    
	    PanelInvent invent = new PanelInvent();
	    this.setContentPane(invent);
	    
	    while (invent.retour.nom == "Unknown user")
	    {
	    	this.setVisible(true);
	    }
	    dispose();
	    MainFrame frame = new MainFrame();
	    
	    
	  }
}

