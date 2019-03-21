package hw05;

public class Radiance extends Weapon {

	public Radiance(double strength) {
		super(strength);
	}

	public double power() {
		return getStrength() * 0.7; 
	}
}
