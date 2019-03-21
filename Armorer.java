package hw05;

import java.util.ArrayList;
import java.util.List;

public class Armorer extends Person {
	private List<Weapon> weapons;


	public Armorer(String name,Team team) {
		super(name,team);
		weapons = new ArrayList<Weapon>();
	}
	
	public void newWeapon(Weapon w) { weapons.add(w); }
	
	public Weapon sellWeapon() {
		Weapon best=null;
		for (Weapon weapon : weapons)  {
			if (best==null) best=weapon;
			else if (best.power()<weapon.power()) best=weapon;
		}
		if (best != null) weapons.remove(best);
		return best;
	}

}
