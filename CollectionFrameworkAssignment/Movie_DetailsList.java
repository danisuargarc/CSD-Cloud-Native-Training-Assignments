import java.util.ArrayList;
import java.util.Comparator;

public class Movie_DetailsList {

	private ArrayList<Movie_Details> movies = new ArrayList<>();
	
	public void add_movie(Movie_Details movie) {
		movies.add(movie);
	}
	
	public void remove_movie(Movie_Details movie) {
		movies.remove(movie);
	}
	
	public void remove_AllMovies() {
		movies.clear();
	}
	
	private void find_movie_By_movName() {
		movies.sort(new Comparator<Movie_Details>() {
			@Override
			public int compare(Movie_Details m1, Movie_Details m2) {
				int value = m1.getMov_Name().compareTo(m2.getMov_Name());
				return value;
			}
		});
		movies.forEach(movie -> System.out.println(movie.toString()));
		System.out.println();
	}
	
	private void find_movie_By_Genre() {
		movies.sort(new Comparator<Movie_Details>() {
			@Override
			public int compare(Movie_Details m1, Movie_Details m2) {
				int value = m1.getGenre().compareTo(m2.getGenre());
				return value;
			}
		});
		movies.forEach(movie -> System.out.println(movie.toString()));
		System.out.println();	
	}
	
	public void sortBy(String string) {
		if (string.equalsIgnoreCase("Genre")) {
			find_movie_By_Genre();
		}
		else {
			find_movie_By_movName();
		}
	}
	
}
