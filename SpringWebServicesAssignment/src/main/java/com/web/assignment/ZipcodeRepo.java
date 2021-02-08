package com.web.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ZipcodeRepo {
	private static ArrayList<Zipcode> zipcodes = new ArrayList<Zipcode>(
			Arrays.asList(
					new Zipcode("15255","Pennsylvania","Pittsburgh","US"),
					new Zipcode("45505","Ohio","Springfield","US"),
					new Zipcode("53285","Wisconsin","Milwaukee","US"),
					new Zipcode("33499","Florida","Boca Raton","US"),
					new Zipcode("17140","Pennsylvania","Harrisburg","US"),
					new Zipcode("66160","Kansas","Kansas City","US"),
					new Zipcode("88553","Texas","El Paso","US"),
					new Zipcode("14614","New York","Rochester","US"),
					new Zipcode("84605","Utah","Provo","US"),
					new Zipcode("33758","Florida","Clearwater","US"),
					new Zipcode("33411","Florida","West Palm Beach","US"),
					new Zipcode("59112","Montana","Billings","US"),
					new Zipcode("33680","Florida","Tampa","US"),
					new Zipcode("62205","Illinois","East Saint Louis","US"),
					new Zipcode("32225","Florida","Jacksonville","US"),
					new Zipcode("06912","Connecticut","Stamford","US"),
					new Zipcode("55108","Minnesota","Saint Paul","US"),
					new Zipcode("29615","South Carolina","Greenville","US"),
					new Zipcode("55557","Minnesota","Young America","US"),
					new Zipcode("57105","South Dakota","Sioux Falls","US"),
					new Zipcode("20430","District of Columbia","Washington","US"),
					new Zipcode("20231","District of Columbia","Washington","US"),
					new Zipcode("12242","New York","Albany","US"),
					new Zipcode("36689","Alabama","Mobile","US"),
					new Zipcode("20310","District of Columbia","Washington","US"),
					new Zipcode("32259","Florida","Jacksonville","US"),
					new Zipcode("07104","New Jersey","Newark","US"),
					new Zipcode("75323","Texas","Dallas","US"),
					new Zipcode("90087","California","Los Angeles","US"),
					new Zipcode("34238","Florida","Sarasota","US"),
					new Zipcode("44705","Ohio","Canton","US"),
					new Zipcode("80995","Colorado","Colorado Springs","US"),
					new Zipcode("15225","Pennsylvania","Pittsburgh","US"),
					new Zipcode("61635","Illinois","Peoria","US"),
					new Zipcode("94302","California","Palo Alto","US"),
					new Zipcode("70165","Louisiana","New Orleans","US"),
					new Zipcode("84130","Utah","Salt Lake City","US"),
					new Zipcode("32209","Florida","Jacksonville","US"),
					new Zipcode("80015","Colorado","Aurora","US"),
					new Zipcode("22212","Virginia","Arlington","US"),
					new Zipcode("95160","California","San Jose","US"),
					new Zipcode("92056","California","Oceanside","US"),
					new Zipcode("95298","California","Stockton","US"),
					new Zipcode("99220","Washington","Spokane","US"),
					new Zipcode("85215","Arizona","Mesa","US"),
					new Zipcode("07195","New Jersey","Newark","US"),
					new Zipcode("97216","Oregon","Portland","US"),
					new Zipcode("46231","Indiana","Indianapolis","US"),
					new Zipcode("23663","Virginia","Hampton","US"),
					new Zipcode("00214","New Hampshire","Portsmouth","US"),
					new Zipcode("98464","Washington","Tacoma","US"),
					new Zipcode("94705","California","Berkeley","US"),
					new Zipcode("22205","Virginia","Arlington","US"),
					new Zipcode("10131","New York","New York City","US"),
					new Zipcode("18706","Pennsylvania","Wilkes Barre","US"),
					new Zipcode("34665","Florida","Pinellas Park","US"),
					new Zipcode("78285","Texas","San Antonio","US"),
					new Zipcode("72231","Arkansas","Little Rock","US"),
					new Zipcode("20816","Maryland","Bethesda","US"),
					new Zipcode("45264","Ohio","Cincinnati","US"),
					new Zipcode("49510","Michigan","Grand Rapids","US"),
					new Zipcode("72209","Arkansas","Little Rock","US"),
					new Zipcode("60078","Illinois","Palatine","US"),
					new Zipcode("23612","Virginia","Newport News","US"),
					new Zipcode("10029","New York","New York City","US"),
					new Zipcode("61635","Illinois","Peoria","US"),
					new Zipcode("39216","Mississippi","Jackson","US"),
					new Zipcode("68144","Nebraska","Omaha","US"),
					new Zipcode("92186","California","San Diego","US"),
					new Zipcode("78682","Texas","Round Rock","US"),
					new Zipcode("80161","Colorado","Littleton","US"),
					new Zipcode("77293","Texas","Houston","US"),
					new Zipcode("62776","Illinois","Springfield","US"),
					new Zipcode("90020","California","Los Angeles","US"),
					new Zipcode("20540","District of Columbia","Washington","US"),
					new Zipcode("98405","Washington","Tacoma","US"),
					new Zipcode("63180","Missouri","Saint Louis","US"),
					new Zipcode("79116","Texas","Amarillo","US"),
					new Zipcode("63143","Missouri","Saint Louis","US"),
					new Zipcode("77271","Texas","Houston","US"),
					new Zipcode("76305","Texas","Wichita Falls","US"),
					new Zipcode("33963","Florida","Naples","US"),
					new Zipcode("98424","Washington","Tacoma","US"),
					new Zipcode("45243","Ohio","Cincinnati","US"),
					new Zipcode("37416","Tennessee","Chattanooga","US"),
					new Zipcode("55441","Minnesota","Minneapolis","US"),
					new Zipcode("16505","Pennsylvania","Erie","US"),
					new Zipcode("75277","Texas","Dallas","US"),
					new Zipcode("91841","California","Alhambra","US"),
					new Zipcode("89595","Nevada","Reno","US"),
					new Zipcode("72118","Arkansas","North Little Rock","US"),
					new Zipcode("02216","Massachusetts","Boston","US"),
					new Zipcode("84110","Utah","Salt Lake City","US"),
					new Zipcode("40266","Kentucky","Louisville","US"),
					new Zipcode("85705","Arizona","Tucson","US"),
					new Zipcode("20436","District of Columbia","Washington","US"),
					new Zipcode("06859","Connecticut","Norwalk","US"),
					new Zipcode("33190","Florida","Miami","US"),
					new Zipcode("53710","Wisconsin","Madison","US"),
					new Zipcode("90020","California","Los Angeles","US")
					));

	public static Zipcode getZipcode(String zipcode) {
		for (Zipcode z : zipcodes) {
			if (z.getZipcode().equals(zipcode)) {
				return z;
			}
		}

		return null;
	}

	public static boolean contains(String zipcode) {
		for (Zipcode z : zipcodes) {
			if (z.getZipcode().equals(zipcode)) {
				return true;
			}
		}

		return false;
	}
}
