package com.rhslearnings.app.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	/*
	 * public static void main(String[] args) { System.out.println(new
	 * Utils().generatedUserId(10));
	 * 
	 * }
	 */
	private static final String symbols = "ABCDEFGJKLMNPRSTUVWXYZ0123456789";

	private final Random random = new SecureRandom();

	public String generatedUserId(int length) {
		return nextString(length);
	}

	private String nextString(int length) {
		StringBuilder sb = new StringBuilder(length);
		for (int idx = 0; idx < length; ++idx)
			sb.append(symbols.charAt(random.nextInt(symbols.length())));

		return new String(sb);
	}

}
