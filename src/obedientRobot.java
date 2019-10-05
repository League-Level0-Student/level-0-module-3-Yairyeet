import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	public static void main(String[] args) {
		
		Robot yes=new Robot();
		yes.setSpeed(100);
		yes.penDown();
		String color = JOptionPane.showInputDialog("what color would you like the robot to draw?");
		if(color.equals("red")) {
			yes.setPenColor(Color.red);	
		}
		if(color.equals("green")) {
			yes.setPenColor(Color.green);	
		}
			
	
	
		
	String y = JOptionPane.showInputDialog("what sape would you like the robot to draw?\n Square, Triangle, Circle");
		
	
	if(y.equals("Square")) {
			
		
		yes.move(100);
		yes.setAngle(90);
		yes.move(100);
		yes.setAngle(180);
		yes.move(100);
		yes.setAngle(270);
		yes.move(100);
	}
		
		
		
}}


