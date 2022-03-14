package com.zak.core.util;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Randomizer {
	private static Random r = new Random();
	
	public static String getRandomString(String[] in) {
		
		return in[r.nextInt(in.length)];
		
	}
}
