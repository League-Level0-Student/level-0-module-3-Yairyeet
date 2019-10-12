package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class recipe {
	public static void main(String[] args) {

		Robot yes = new Robot();
		yes.setSpeed(100);
		yes.penDown();
		for (int i = 0; i < 100; i++) {

			String color = JOptionPane.showInputDialog("what color would you like the robot to draw?");
			if (color.equals("red")) {
				yes.setPenColor(Color.red);
			}
			if (color.equals("green")) {
				yes.setPenColor(Color.green);
			}
			String no = JOptionPane
					.showInputDialog("what do u want the robot to draw \na square, a triangle or a circle");

			if (no.equals("square")) {

				yes.move(100);
				yes.setAngle(90);
				yes.move(100);
				yes.setAngle(180);
				yes.move(100);
				yes.setAngle(270);
				yes.move(100);
				yes.penUp();
				yes.move(100);
			}
			if (no.equals("triangle")) {
				yes.setAngle(60);
				yes.move(100);
				yes.setAngle(120);
				yes.move(100);
				yes.setAngle(270);
				yes.move(150);
				yes.penUp();
				yes.move(100

				);
			}
			if (no.equals("circle")) {
drawCircle();
for (int ij = 0; ij < 360; ij++) {
	
	yes.turn(1);
yes.move(1);
}
yes.penUp();
yes.move(100);
			}

		}

	}

	private static void drawCircle() {
		// TODO Auto-generated method stub
		//for (int i = 0; i < 360; i++) {
			
			//yes.turn(1);
		//yes.move(1);
		
		
	}

}
