import javax.swing.*;
import java.awt.*;

public class Panell{
	public static void main(String[] args){
		Panell gui = new Panell();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		JButton button = new JButton("shock me");
		JButton button2 = new JButton("bliss");
		panel.add(button);
		panel.add(button2);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}