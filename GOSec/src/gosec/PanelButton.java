package gosec;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComponent;

//import ramo.klevis.ml.recogntion.face.RunFaceRecognition;

public class PanelButton extends JButton implements MouseListener {
	private String name;
	public String nom = "Unknown user";
	
	  public PanelButton(String str){
	    super(str);
	    this.name = str;
	    this.setBackground(new Color(55,158,193));
	    this.setForeground(Color.BLACK);
	    this.setText(name);
	    this.addMouseListener(this);
	  }
	  
	  public void mouseClicked(MouseEvent event) {
		  //RunFaceRecognition facerec = new RunFaceRecognition();
		  //nom = facerec.faceRecogntionUi.whoIs;
		  nom="bob";
	  }
	  
	  public void mouseEntered(MouseEvent event) { }

	  public void mouseExited(MouseEvent event) { }

	  public void mousePressed(MouseEvent event) { }

	  public void mouseReleased(MouseEvent event) { } 
}
