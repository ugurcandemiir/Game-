package hw05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
	Team redTeam;
	Team blackTeam;
	Scanner in;
	int year;
	int score;
	
	public Game(Scanner in) {
		this.in = in;
		redTeam=new Team("red",in);
		blackTeam=new Team("black",in);
		year=1042;
		int i;
		score=0;
		for(i=0;i<100;i++) { age(); }
		if (score>0) {
			System.out.println("Red team won by " + score);
		} else {
			System.out.println("Black team won by " + (-score));
		}
	}
	
	public void age() {
		redTeam.age();
		blackTeam.age();
		year++;
		// Next, battles between 3 random warriors
		System.out.println("Another year has passed, it is now " + year);
		int i;
		for(i=0;i<3;i++) {
			Warrior red = redTeam.randomWarrior();
			Warrior black = blackTeam.randomWarrior();
			score+=red.battle(black);
		}
		
	}

	public static void main(String[] args) {
		Scanner in=null;
		try {
			in = new Scanner(new File("src/hw05/GameNames.txt"));
			Game game=new Game(in);
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File GameNames.txt not found");
			e.printStackTrace();
		}
	}

}
