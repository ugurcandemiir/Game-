package hw05;

public class Sword extends Weapon {

	public Sword(double strength) {
		super(strength);
	}

	public double power() {
		return getStrength() * 1.3; // Swords are much more powerful
	}
}
