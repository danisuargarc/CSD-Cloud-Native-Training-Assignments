/**
 * There is a parking slot available in R-Mall with 3 floors; each floor
 * has 4 sections and each section can maximum park 20 cars. You need to
 * design one application which will maintain all car details in such a
 * way when a car owner arrives to collect his car your application
 * should provide details including where it is located.
 * 
 * @author dgarci11
 *
 */
public class Question7 {

	public static void main(String[] args) {
		Parked_CarOwnerList list = new Parked_CarOwnerList();
		
		Parked_CarOwner_Details c1 = new Parked_CarOwner_Details("Daniel", "Expedition", 1, 2355123,
				"1 Shady Lane");
		Parked_CarOwner_Details c2 = new Parked_CarOwner_Details("Joel", "Frontier", 2, 9055123,
				"7 Dogs Street");
		Parked_CarOwner_Details c3 = new Parked_CarOwner_Details("Nataly", "Accord", 3, 7891232,
				"-1 Loser Avenue");
		
		list.add_new_car(c1);
		list.add_new_car(c2);
		list.add_new_car(c3);
		
		System.out.println(list.get_parked_car_location(c3));
	}

}
