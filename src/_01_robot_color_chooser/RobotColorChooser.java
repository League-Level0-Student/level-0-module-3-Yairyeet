//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	private static final Object Random = null;

	public static void main(String[] args) {
		//1. Create a new Robot
		Robot yes=new Robot();
		yes.setSpeed(100);
		yes.penDown();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 100; i++) {
			
		
		String color = JOptionPane.showInputDialog("what color would you like the robot to draw?");
		if(color.equals("red")) {
			yes.setPenColor(Color.red);	
		}
		if(color.equals("green")) {
			yes.setPenColor(Color.green);	
		}else {
			color.equals(Random);
			yes.setPenWidth(10);
	for (int j = 0; j < 4; j++) {
		
	  
	yes.move(100); yes.turn(90);
	}
		}
		}
	}


		}
		
		
	
		
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
	
	    //2. Make the robot draw a shape (this will take more than one line of code)
