import javax.swing.JOptionPane;

public class areUhappy {
public static void main(String[] args) {
	
	String no=JOptionPane.showInputDialog("are u happy");
	
if(no.equals("yes")) {
	JOptionPane.showMessageDialog(null,"keep doing whatever u're doing");
}
	if(no.equals("no")) {
		String yes=JOptionPane.showInputDialog("do u want to be happy");
if(yes.equals("no")) {
	JOptionPane.showMessageDialog(null,"keep doing whatever u're doing");
}
if(yes.equals("yes")) {
	JOptionPane.showMessageDialog(null,"change something");
}
	}
	
	
	
	
	
	
	
	
	
}
}
