package hw05;

public class Knife extends Weapon {

	public Knife(double strength) {
		super(strength);
	}

	public double power() {
		return getStrength() * 0.2; // knives are not very powerful
	}
}
