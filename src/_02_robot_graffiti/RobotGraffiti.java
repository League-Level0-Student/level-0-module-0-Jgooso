package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) throws Exception {
	Robot r2d2 = new Robot();
	r2d2.setSpeed(10);
	r2d2.penDown();
	r2d2.move(100);
	r2d2.move(-50);
	r2d2.turn(90);
	r2d2.move(50);
	for (int i = 0; i < 18; i++) {
		r2d2.move(1);
		r2d2.turn(10);
	}
	r2d2.hide();
	}
}
