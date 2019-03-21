package hw05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Team {
	private List<Armorer> armorers;
	private List<Warrior> warriors;
	private List<Weapon> armory;
	String name;
	Scanner in;
	Random random;
	
	public Team(String name,Scanner in) {
		this.name=name;
		this.in = in;
		armorers = new ArrayList<Armorer>();
		warriors = new ArrayList<Warrior>();
		armory = new ArrayList<Weapon>();
		random = new Random();
	}
	
	public void age() {
		if (armorers.size()<15) armorers.add(new JackSmith(in.nextLine(),this));
		if (armorers.size()<15) armorers.add(new BlackSmith(in.nextLine(),this));
		if (warriors.size()<15) warriors.add(new Knight(in.nextLine(),this));
		if (warriors.size()<15) warriors.add(new Warden(in.nextLine(),this));
		if (warriors.size()<15) warriors.add(new Swashbuckler(in.nextLine(),this));
		if (warriors.size()<15) warriors.add(new Samurai(in.nextLine(),this));
		for(int i=armorers.size()-1;i>=0;i--) {
			Armorer p = armorers.get(i);
			p.age();
			if (p.getAge()>85) armorers.remove(p);
		}
		for(int i=warriors.size()-1;i>=0;i--) {
			Warrior p=warriors.get(i);
			p.age();
			if (p.getAge()>85) {
				p.eulogy();
				warriors.remove(p);
			}
		}
	}
	
	public Warrior randomWarrior() {
		return warriors.get(random.nextInt(warriors.size()));
	}
	
	public Weapon bestInArmory() {
		Weapon best=null;
		for(Weapon w : armory) {
			if (best==null) best=w;
			else if (w.power()>best.power()) best=w;
		}
		if (best!=null) armory.remove(best);
		return best;
	}
	
	public void buyWeapon(Weapon w) {
		armory.add(w);
	}
	
}
