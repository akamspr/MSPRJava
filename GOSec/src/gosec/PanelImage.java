package gosec;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PanelImage  extends JPanel {
	
	public void affImage(Graphics g, Image img) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}

}
