import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Parked_CarOwnerList {
	
	private Map<Integer, ArrayList<Parked_CarOwner_Details>> deck = new HashMap<>(); 
	private int count = 0;
	private int currentSection = 1;
	
	public Parked_CarOwnerList() {
		for (int x = 1; x < 13; x++) {
			deck.put(x, new ArrayList<Parked_CarOwner_Details>());
		}
	}

	public void add_new_car(Parked_CarOwner_Details obj) {
		if (currentSection != 12 && count != 20) {
			deck.get(currentSection).add(obj);
			
			if (count == 20) {
				currentSection++;
				count = 1;
			}
			else {
				count++;
			}
		}
		else {
			System.out.println("Sorry, deck is full!");
		}
	}
	
	public void remove_car(Parked_CarOwner_Details obj) {
		for (int x = 1; x < 13; x++) {
			if (deck.get(x).contains(obj)) {
				deck.get(x).remove(obj);
			}
		}
	}
	
	public String get_parked_car_location(Parked_CarOwner_Details obj) {
		int carSection = 0;
		int carSpot = 0;
		int carLevel = 0;
		
		for (int x = 1; x < 13; x++) {
			if (deck.get(x).contains(obj)) {
				carSection = x;
				carSpot = deck.get(x).indexOf(obj) + 1;
			}
		}
		
		if (carSection > 0 && carSection < 5) {
			carLevel = 1;
		}
		else if (carSection > 4 && carSection < 9) {
			carLevel = 2;
			carSection -= 4;
		}
		else {
			carLevel = 3;
			carSection -= 8;
		}
		
		return obj.getOwnerName() + "'s car is in Level: " + carLevel + ", Section: " + carSection + ", Spot: " + carSpot;
	}
	
}
