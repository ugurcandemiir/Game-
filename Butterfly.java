package hw05;

public class Butterfly extends Weapon {

	public Butterfly(double strength) {
		super(strength);
	}

	public double power() {
		return getStrength() * 0.9; 
	}
}
