//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {
String Bryansuperpower =  "your superpwoer is patience for me forgetting too much code at a time and having to 'rarely' copying and pastying it";
String Andreewmobilferrari = "gluttttttonny";
		// 1. Save the superpower for each person in a variable.
String name = JOptionPane.showInputDialog("what is your name?");
		// 2. Ask the user to enter a name. Store their answer in a variable.
if(name.equals("Bryan")) {
JOptionPane.showMessageDialog(null, Bryansuperpower);	
	
}else if(name.equals("Andrew"))
JOptionPane.showMessageDialog(null, "since you have stated that the superpower you have is glutonny, and seven, then movie has a rating of 111111111111111/5, therefor you have a superpower and a favorite movie ---- (: ])-<--<");
else if(name.equals("Sanjay")) {
// 3. Show the superpower in a pop-up, depending on the name entered. 
JOptionPane.showMessageDialog(null, "Your superpower is, to be able to majically turn invisible");
	}
}

}