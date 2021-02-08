package com.web.assignment;

public class CardValidator {
	private static String card;
	
	public static String validate(String cardNum) {
		card = cardNum;
		
		if (Discover()) { return "Discover"; }
		else if (enRoute()) { return "enRoute"; }
		else if (JCB()) { return "JCB"; }
		else if (MasterCard()) { return "MasterCard"; }
		else if (Visa()) { return "Visa"; }
		else if (AMEX()) { return "American Express"; }
		else { return "Not a valid card"; }
	}
	
	private static boolean Discover() {
		int digits = Integer.parseInt(card.substring(0, 6));
		
		if (card.length() != 16) { return false; }
		if (digits > 659999 || digits < 601100) { return false; }
		if (digits >= 601100 && digits <= 601109) { return true; }
		if (digits >= 601120 && digits <= 601149) { return true; }
		if (digits == 601174) { return true; }
		if (digits >= 601177 && digits <= 601179) { return true; }
		if (digits >= 601186 && digits <= 601199) { return true; }
		if (digits >= 644000 && digits <= 659999) { return true; }
		
		return false;
	}
	
	private static boolean enRoute() {
		if (card.length() != 15) { return false; }
		if (card.startsWith("2014") || card.startsWith("2149")) { return true; }
		
		return false;
	}
	
	private static boolean AMEX() {
		if (card.length() != 15) { return false; }
		if (card.startsWith("34") || card.startsWith("37")) { return true; }
		
		return false;
	}
	
	private static boolean JCB() {
		int digits = Integer.parseInt(card.substring(0, 4));
		
		if (card.length() < 16 || card.length() > 19) { return false; }
		if (digits >= 3528 && digits <= 3589) { return true; }
		
		return false;
	}
	
	private static boolean MasterCard() {
		int second = Integer.parseInt(card.substring(0, 1));
		int digits = Integer.parseInt(card.substring(0, 6));
		
		if (card.length() != 16) { return false; }
		if (card.startsWith("5") && second >= 1 && second <= 5 && digits >= 510000 && digits <= 559999) { return true; }
		if (card.startsWith("2") && second >= 2 && second <= 7 && digits >= 222100 && digits <= 272099) { return true; }
		
		return false;
	}
	
	private static boolean Visa() {
		if (card.length() < 16 || card.length() > 19) { return false; }
		if (card.startsWith("4")) { return true; }
		
		return false;
	}
}
