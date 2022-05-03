package OOP;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(120);
		MotorBike honda = new MotorBike();

		ducati.setSpeed(100);
		honda.setSpeed(80);
		
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);

	}
}
