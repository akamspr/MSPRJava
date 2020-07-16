package gosec;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;

public class PanelInvent extends JPanel {

		public IdenButton retour = new IdenButton("Identification");
		
		public PanelInvent()
		{
			this.setLayout(new GridLayout(3,10));
			this.setBackground(Color.lightGray);
			this.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			JCheckBox checkbox1 = new JCheckBox("Mousqueton");
			JCheckBox checkbox2 = new JCheckBox("Gant d'intervantion");
			JCheckBox checkbox3 = new JCheckBox("Ceinture de sécurité tachtique");
			JCheckBox checkbox4 = new JCheckBox("Détecteur de métaux");
			JCheckBox checkbox5 = new JCheckBox("Brassard de sécurité");
			JCheckBox checkbox6 = new JCheckBox("Lampe torche");
			JCheckBox checkbox7 = new JCheckBox("Gilet pare balle");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.weighty = 50.0;
			c.weightx = 20.0;
			c.gridy = 0;
			this.add(this.retour, c);
			c.fill = GridBagConstraints.HORIZONTAL;
			c.weighty = 1.0;
			c.weightx = 1.0;
			c.insets = new Insets(10,650,0,0);
			c.gridx = 1;
			c.gridy = 1;
			this.add(checkbox1, c);
			c.weighty = 1.0;
			c.gridx = 1;
			c.gridy = 2;
			this.add(checkbox2, c);
			c.weighty = 1.0;
			c.gridx = 1;
			c.gridy = 3;
			this.add(checkbox3, c);
			c.weighty = 1.0;
			c.gridx = 1;
			c.gridy = 4;
			this.add(checkbox4, c);
			c.weighty = 1.0;
			c.gridx = 1;
			c.gridy = 5;
			this.add(checkbox5, c);
			c.weighty = 1.0;
			c.gridx = 1;
			c.gridy = 6;
			this.add(checkbox6, c);
			c.weighty = 1.0;
			c.gridx = 1;
			c.gridy = 7;
			this.add(checkbox7, c);
		}
}
