package hw05;

import java.util.Random;

public class JackSmith extends Armorer {
	private Random rand;
	
	public JackSmith(String name,Team team) {
		super(name,team);
		rand=new Random();
	}

	/* (non-Javadoc)
	 * @see hw05.Person#age()
	 */
	@Override
	public void age() {
		super.age();
		if (power()>11) {
			if (getAge()>20 && getAge() <= 35) {
				newWeapon(new Radiance(power()/11.0));
			}
			else if (getAge()>35 && getAge() <=45 ) {
				newWeapon(new Sword(power()/11.0));
			}
			else if (getAge()>45 && getAge() <= 55) {
				newWeapon(new Bloodthorn(power()/11.0));
			}
		}
		if (0==rand.nextInt(2)) {
			Weapon w = sellWeapon();
			if (w!=null) getTeam().buyWeapon(w);
		}
	}

	
}
