package com.zak.dev;

import java.util.Random;

public class RandomizerTest {

	public static void main(String[] args) {
		String[] characters = {"fighter", "thief", "mage", "priest", "merchant", "mayor", "bandit", "goblin", "dragon"};
		
		String[] locations = {"in the center of town", "in an ambush", " partway along a trade road", "in a cave", "in a swamp", "at a mountain pass", " while setting up camp", "in a ruin", "at the bottom of dungeon"};
		
		String[] times = {"at noon", "at dusk", "just before sunrise", "at midnight", "just before lunchtime"};
		
		String[] complication = {"the water is rising.", "a fire!", "the rum is gone!", "Character 2 has mysteriously gone blind", "no one has eaten for 3 days"};
		
		Random rand = new Random();
		
		System.out.println("Character 1: " + characters[rand.nextInt(characters.length)]);
		System.out.println("Character 2: " + characters[rand.nextInt(characters.length)]);
		System.out.println("Character 3: " + characters[rand.nextInt(characters.length)]);
		
		System.out.println("Location: " + locations[rand.nextInt(locations.length)]);
		
		System.out.println("Time: " + times[rand.nextInt(times.length)]);
		
		System.out.println("Complication: " + complication[rand.nextInt(complication.length)]);

	}

}
