package hw05;

import java.util.Random;

public class BlackSmith extends Armorer {
	private Random rand;
	
	public BlackSmith(String name,Team team) {
		super(name,team);
		rand=new Random();
	}

	/* (non-Javadoc)
	 * @see hw05.Person#age()
	 */
	@Override
	public void age() {
		super.age();
		if (power()>10) {
			if (getAge()>5 && getAge() <= 15) {
				newWeapon(new Knife(power()/10.0));
			}
			else if (getAge()>15 && getAge() <= 25) {
				newWeapon(new Butterfly(power()/10.0));
			}
		}
		if (0==rand.nextInt(2)) {
			Weapon w = sellWeapon();
			if (w!=null) getTeam().buyWeapon(w);
		}
	}

	
}
