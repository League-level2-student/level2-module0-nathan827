package arrays;

import org.jointheleague.graphical.robot.Robot;

import java.util.*;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	//2. create an array of 5 robots.

Robot [] rob = new Robot [5];
	//3. use a for loop to initialize the robots.
for(int i = 0; i < rob.length; i++) {
	rob [i] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for(int i = 0; i < rob.length;i++) {
	rob [i].setY(550);
	rob [i].setX(i * 200 + 50);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
boolean isRacing = true;
while(isRacing == true) {
for(int i = 0; i < rob.length; i++) {
	Random ran = new Random();
	rob [i].setSpeed(50);
	rob [i].move(ran.nextInt(50));
	if(rob [i].getY() <= 0) {
		isRacing = false;
		System.out.println(rob [i] + " is the winner!");
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
