package com.zak.util;

import java.util.Random;

public class Randomizer {
	private static Random r = new Random();
	
	public static String getRandomString(String[] in) {
		
		return in[r.nextInt(in.length)];
		
	}
}
