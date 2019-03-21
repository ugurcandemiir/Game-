package hw05;

import java.util.Random;

public class Warden extends Warrior {
	Random rand;
	

	public Warden(String name,Team team) {
		super(name,team);
		rand=new Random();
	}

	/* (non-Javadoc)
	 * @see hw05.Person#age()
	 */
	@Override
	public void age() {
		super.age();
		if (0==rand.nextInt(2)) {
			Weapon w = getTeam().bestInArmory();
			if (w!=null) w=tradeUp(w);
			if (w!=null) getTeam().buyWeapon(w);
		}
	}
	
	public void eulogy() {
		System.out.println("  Here lies the departed body of " + this );
		System.out.println("    A merciless warrior who fought " + getBattles() + " battles, and won " + getBattlesWon() + " of them!");
		System.out.println("    Long may this warrior be remembered!");
	}
	
	
}
