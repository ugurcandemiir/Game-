package hw05;

public class Person {
	private int age;
	private int strength;
	private int experience;
	private String name;
	private Team team;
	/**
	 * @param name
	 */
	public Person(String name,Team team) {
		this.name = name;
		this.team = team;
		strength=0;
		experience=0;
		age=0;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}



	public void age() {
		age++;
		if (0<age && age < 10) { strength=2; experience=1; }
		else if (10 <= age && age < 15) { strength=4; experience=2; }
		else if (15 <= age && age < 20) { strength=8; experience=3; }
		else if (20 <= age && age < 25) { strength=10; experience=4; }
		else if (25 <= age && age < 30) { strength=9; experience=6; }
		else if (30 <= age && age < 40) { strength=8; experience=7; }
		else if (40 <= age && age < 50) { strength=7; experience=8; }
		else if (50 <= age && age < 65) { strength=6; experience=9; }
		else if (65 <= age && age < 80) { strength=4; experience=10; }
		else { strength=0; }
	}
	
	public int power() {
		return strength*experience;
	}
	
	static String textAttr(int val) {
		if (val==0) return "no";
		if (val<=3) return "little";
		if (val<=5) return "some";
		if (val<=7) return "sufficient";
		if (val<=9) return "impressive";
		return "outstanding";
	}
	
	String description() {
		return "a " + getClass().getSimpleName() + "  with " + textAttr(strength) + " strength and " + textAttr(experience) + " experience";
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + ", " + description();
	}

}
