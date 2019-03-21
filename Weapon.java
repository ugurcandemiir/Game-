package hw05;

public abstract class Weapon {
	private double strength;
	
	/**
	 * @param name
	 * @param strength
	 */
	public Weapon(double strength) {
		this.strength = strength;
	}
	
	/**
	 * @return the strength
	 */
	public double getStrength() {
		return strength;
	}

	public abstract double power();	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +" with " + Person.textAttr((int) strength) + " strength";
	}
	
	
	
}
