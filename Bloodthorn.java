package hw05;

public class Bloodthorn extends Weapon {

	public Bloodthorn(double strength) {
		super(strength);
	}

	public double power() {
		return getStrength() * 1.5; 
	}
}
