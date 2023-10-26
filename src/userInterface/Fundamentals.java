package userInterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fundamentals {
	
	public static void main(String[] args) {
		JFrame wind = new JFrame("Champions League 2023/24");
		wind.setVisible(true);
		wind.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Color co = new Color(246, 10, 240).darker();
		wind.setBackground(co);
		wind.setIconImage(new ImageIcon("1692701972934.jpg").getImage());
		wind.setSize(600, 400);
		int option = JOptionPane.showConfirmDialog(null,
				 "Est-ce que tu aimes le Real Madrid?",
				 "Question de sécurité",
				 JOptionPane.YES_NO_OPTION,
				 JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(wind, "Real Madrid va gagner cette competition", "Facts", JOptionPane.INFORMATION_MESSAGE);
		//myWindow.setShape(new RoundRectangle2D.Double(10, 10, 100, 100, 50, 50));
		
	}
}
