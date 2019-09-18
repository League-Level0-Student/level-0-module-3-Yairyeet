
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 18th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 2th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String y =JOptionPane.showInputDialog("what birthday do you \nwont moms, dads or my");
			
			// 3. Print out what the user typed
		if(y.equals("moms")) {
			JOptionPane.showMessageDialog(null, "Msrch 18th");
		}
		if(y.equals("dads")) {
			JOptionPane.showMessageDialog(null, "June 9th");
		}
		if(y.equals("yours")) {
			JOptionPane.showMessageDialog(null, "April 2th");
		}else {
			JOptionPane.showMessageDialog(null," Sorry, i don't remember that person's\n birthday!");
		}
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
