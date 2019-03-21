package hw05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Warrior extends Person {
	private List<Weapon> weapons;
	private int battles;
	private int battlesWon;
	private Map<String,Double> proficiency;

	public Warrior(String name,Team team) {
		super(name,team);
		weapons = new ArrayList<Weapon>();
		proficiency = new HashMap<String,Double>();
	}
	
	/**
	 * @return the battles
	 */
	public int getBattles() {
		return battles;
	}



	/**
	 * @return the battlesWon
	 */
	public int getBattlesWon() {
		return battlesWon;
	}



	public Weapon tradeUp(Weapon weapon) {
		if (weapons.size()<2) {
			weapons.add(weapon);
			return null;
		}
		Weapon best=bestWeapon();
		if (best.power() < weapon.power()) {
			weapons.add(weapon);
			Weapon ret=weapons.get(0); 
			weapons.remove(0);
			return ret;
		}
		return weapon;
	}
	
	public void addWeapon(Weapon weapon) {
		weapons.add(weapon);
	}
	
	public boolean hasWeapon() {
		return !weapons.isEmpty();
	}
	
	public Weapon bestWeapon() {
		Weapon best=null;
		for(Weapon weapon : weapons) {
			if (best==null) best=weapon;
			else if (best.power() < weapon.power()) best=weapon;
		}
		return best;
	}
	
	public int battle(Warrior foe) {
		if (getAge()<10) {
			// System.out.println("I, " + this + " would challenge " + foe + " to a battle, but I am too young to fight.");
			return 0;
		}
		if (foe.getAge()<10) {
			// System.out.println("I, " + this + " would challenge " + foe + " to a battle, but he is too young to fight.");
			return 0;
		}
		if (!hasWeapon()) {
			// System.out.println("I, " + this + " would challenge " + foe + " to a battle, but I have no weapons.");
			return 0;
		}
		if (!foe.hasWeapon()) {
			// System.out.println("I, " + this + " would challenge " + foe + " to a battle, but he has no weapons.");
			return 0;
		}
		Weapon rw=bestWeapon();
		Weapon bw=foe.bestWeapon();
		System.out.println("  I, " + this + " challenge " + foe + " to a duel!");
		System.out.println("    My choice of weapon is a " + rw);
		System.out.println("    You have chosen a " + bw);
		battles++; foe.battles++;
		double rwScore=getProficiency(rw) * rw.power();
		double bwScore=foe.getProficiency(bw) * bw.power();
		if (rwScore >= bwScore) {
			// Red wins!
			System.out.println("    I, " + getName() + " won the battle!");
			battlesWon++;
			changeProficiency(rw,0.1);
			foe.changeProficiency(bw, -0.1);
			return 1;
		} else {
			System.out.println("    Drat, you, " + foe.getName() + " defeated me!");
			foe.battlesWon++;
			changeProficiency(rw,-0.1);
			foe.changeProficiency(bw, 0.1);
		}
		return -1;
		
	}
	
	public double getProficiency(Weapon w) {
		String wType=w.getClass().getSimpleName();
		if (proficiency.containsKey(wType)) {
			return proficiency.get(wType);
		}
		return 1.;
	}
	
	public void changeProficiency(Weapon w,double delta) {
		String wType=w.getClass().getSimpleName();
		double prof=getProficiency(w);
		prof+=delta;
		if (prof<0.1) prof=0.1;
		if (prof>5.0) prof=5.0;
		proficiency.put(wType,prof);
	}
	
	public abstract void eulogy();
}
