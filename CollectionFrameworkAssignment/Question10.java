/**
 * Create class Movie_Details with field's mov_Name, lead_actor, lead_actress,
 * and genre add setter and getter method in that class.
 * 
 * After creating this class create class Movie_DetailsList class who will
 * maintain all the objects.
 * 
 * Movie_DetailsList class should have method add_movie(), remove_movie(),
 * remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
 * 
 * Movie_DetailsList should have method which will take an argument that
 * will be use to determine on which to sort
 * 
 * @author dgarci11
 *
 */
public class Question10 {

	public static void main(String[] args) {
		Movie_DetailsList list = new Movie_DetailsList();
		list.add_movie(new Movie_Details("Interstellar", "Matthew", "Anne", "Science Fiction"));
		list.add_movie(new Movie_Details("Thor", "Chris", "Tessa", "Action"));
		list.add_movie(new Movie_Details("Jumanji", "Dwayne", "Karen", "Comedy"));
		list.add_movie(new Movie_Details("Easy A", "Penn", "Emma", "Romance"));
		list.add_movie(new Movie_Details("Shrek", "Mike", "Cameron", "Comedy"));
		
		Movie_Details m = new Movie_Details("Tangled", "Zachary", "Mandy", "Family");
		list.add_movie(m);
		
		list.sortBy("Genre");
		
		list.remove_movie(m);
		
		list.sortBy("Name");
		
		list.remove_AllMovies();
		
		list.sortBy("Name");
	}

}
