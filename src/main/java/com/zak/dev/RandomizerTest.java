package com.zak.dev;

import java.util.Random;

public class RandomizerTest {

	public static void main(String[] args) {
		String[] characters = {"fighter", "thief", "mage", "priest", "merchant", "mayor", "bandit", "goblin", "dragon"};
		
		String[] locations = {"in the center of town", "in an ambush", " partway along a trade road", "in a cave", "in a swamp", "at a mountain pass", " while setting up camp", "in a ruin", "at the bottom of dungeon"};
		
		String[] times = {"at noon", "at dusk", "just before sunrise", "at midnight", "just before lunchtime"};
		
		String[] complication = {"the water is rising.", "a fire!", "the rum is gone!", "Character 2 has mysteriously gone blind", "no one has eaten for 3 days"};
		
		Random rand = new Random();
		

		for(int i=0; i<3; i++) {
		randomRolePlay(rand.nextInt(5), characters, locations, times, complication, rand, rand.nextBoolean());
		System.out.println("---------------------------------------------------------------------");
		System.out.println();

		}
	}
	
	private static void randomRolePlay(int count, String[] chars, String[] locations, String[] times, String[] complication, Random r, boolean comp) {
		if(count<1) {
			return;
		}
		for(int i=0; i<count; i++) {
			int num = i+1;
			System.out.print("Character " + num + ": ");
			System.out.println(chars[r.nextInt(chars.length)]);

		}
		
		System.out.println("Location: " + locations[r.nextInt(locations.length)]);
		
		System.out.println("Time: " + times[r.nextInt(times.length)]);
		if(comp) {
			System.out.println("Complication: " + complication[r.nextInt(complication.length)]);	
		}
	
	}

}
