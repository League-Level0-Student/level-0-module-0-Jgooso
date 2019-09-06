package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class Awesome {
	public static void main(String[] args) throws Exception {
		String name = JOptionPane.showInputDialog("What do you think is awesome?");
		JOptionPane.showMessageDialog(null,name + " is awesome");
	}
}
