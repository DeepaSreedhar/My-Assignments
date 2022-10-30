package w1.day1;

public class Bike1 {
	public void applybikebrake() {
		System.out.println("Applied Bike brake");

	}
	public void soundBikeHorn() {
		System.out.println("sound Bike Horn");

	}	
public static void main(String[] args) {
	Car1 obj = new Car1();
	obj.applyBrake();
	obj.soundHorn();
	Bike1 obj1 = new Bike1();
	obj1.applybikebrake();
	obj1.soundBikeHorn();
	
}
	}


