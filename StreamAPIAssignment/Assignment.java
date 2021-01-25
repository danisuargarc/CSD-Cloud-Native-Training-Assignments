import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Assignment {

	/**
	 * What question would you like to see the result to?
	 * 
	 * Simply change the number in the method call question1();
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		question1();
	}

	public static List<Fruit> fruits = Arrays.asList(
			new Fruit("Banana", 133, 1, "Yellow"),
			new Fruit("Grape", 114, 2, "Red"),
			new Fruit("Mango", 107, 3, "Yellow"),
			new Fruit("Strawberry", 46, 3, "Red"),
			new Fruit("Apple", 95, 1, "Green"),
			new Fruit("Blueberry", 81, 3, "Blue"),
			new Fruit("Orange", 45, 1, "Orange")
			);

	public static List<News> newsList = Arrays.asList(
			new News(202, "Joel", "Liz", "The budget is too big!"),
			new News(303, "Daniel", "Liz", "The budget is too small."),
			new News(303, "Daniel", "Maya", "You're wrong."),
			new News(202, "Joel", "Maya", "This budget is so, so, so gigantic!"),
			new News(303, "Daniel", "Brandon", "Yeah, this is garbage."),
			new News(101, "Nataly", "Liz", "I don't like this budget.")
			);

	public static List<Trader> traders = Arrays.asList(
			new Trader("Voldemort", "Prune"),
			new Trader("Hermione", "Prune"),
			new Trader("Ron", "Delhi"),
			new Trader("Neville", "Delhi"),
			new Trader("Harry", "Indore")
			);

	public static List<Transaction> transactions = Arrays.asList(
			new Transaction(traders.get(0), 2011, 700),
			new Transaction(traders.get(1), 2011, 900),
			new Transaction(traders.get(3), 2001, 100),
			new Transaction(traders.get(2), 2008, 1000)
			);

	/**
	 * Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
	 */
	private static void question1() {
		System.out.println("Fruits with calories < 100 sorted in descending order of calories");

		fruits.stream()
		.filter(fruit -> fruit.getCalories() < 100)
		.sorted((fruit1, fruit2) -> Integer.valueOf(fruit2.getCalories()).compareTo(Integer.valueOf(fruit1.getCalories())))
		.forEach(fruit -> System.out.println("- " + fruit.getName() + " " + fruit.getCalories() + " Calories"));
	}

	/**
	 * Display color wise list of fruit names.
	 */
	private static void question2() {
		System.out.println("Color wise list of fruit names");

		fruits.stream()
		.sorted((fruit1, fruit2) -> fruit1.getColor().compareTo(fruit2.getColor()))
		.forEach(fruit -> System.out.println("- " + fruit.getColor() + " " + fruit.getName()));
	}

	/**
	 * Display only RED color fruits sorted as per their price in ascending order.
	 */
	private static void question3() {
		System.out.println("Red color fruits sorted as per their price in ascending order");

		fruits.stream()
		.filter(fruit -> fruit.getColor().equalsIgnoreCase("RED"))
		.sorted((fruit1, fruit2) -> Integer.valueOf(fruit1.getPrice()).compareTo(Integer.valueOf(fruit2.getPrice())))
		.forEach(fruit -> System.out.println("- " + fruit.getName() + " " + fruit.getPrice() + " Dollar(s)"));
	}

	/**
	 * Find out the newsId which has received maximum comments.
	 */
	private static void question4() {
		System.out.println("newsId which has received maximum comments");

		//new list of news ids
		List<Integer> newsIdList = newsList.stream()
				.map(news -> news.getNewsId())
				.collect(Collectors.toList());

		//new list of distinct ids
		List<Integer> distinctIds = newsIdList.stream()
				.distinct()
				.collect(Collectors.toList());

		long[] maxNewsId = { 0 };
		long[] maxCount = { 0 };

		//for each distinct id, iterate through newsIdList and count all values of that distinct id
		distinctIds.stream()
		.forEach(distinct -> {
			long count = newsIdList.stream()
					.filter(id -> Integer.valueOf(id).equals(Integer.valueOf(distinct)))
					.count();

			if (count > maxCount[0]) {
				maxNewsId[0] = distinct;
				maxCount[0] = count;
			}
		});

		System.out.println("- " + maxNewsId[0] + " " + maxCount[0] + " Comment(s)");
	}

	/**
	 * Find out how many times the word 'budget' arrived in user comments all news.
	 */
	private static void question5() {
		System.out.println("Times the word 'budget' arrived in user comments all news");

		int[] budgetCount = { 0 };

		newsList.stream()
		.forEach(news -> {
			if (news.getComment().contains("budget")) {
				budgetCount[0]++;
			}
		});

		System.out.println("- " + budgetCount[0] + " Time(s)");
	}

	/**
	 * Find out which user has posted maximum comments.
	 */
	private static void question6() {
		System.out.println("Which user has posted maximum comments.");

		//new list of commentByUser
		List<String> userList = newsList.stream()
				.map(news -> news.getCommentByUser())
				.collect(Collectors.toList());

		//new list of distinct commentByUser
		List<String> distinctUsers = userList.stream()
				.distinct()
				.collect(Collectors.toList());

		String[] maxName = { "" };
		long[] maxCount = { 0 };

		//for each distinct user, iterate through userList and count all values of that distinct user
		distinctUsers.stream()
		.forEach(distinct -> {
			long count = userList.stream()
					.filter(user -> user.equals(distinct))
					.count();

			if (count > maxCount[0]) {
				maxName[0] = distinct;
				maxCount[0] = count;
			}
		});

		System.out.println("- " + maxName[0] + " " + maxCount[0] + " Comment(s)");
	}

	/**
	 * Display commentByUser wise number of comments.
	 */
	private static void question7() {
		System.out.println("Which user has posted maximum comments.");

		//new list of commentByUser
		List<String> userList = newsList.stream()
				.map(news -> news.getCommentByUser())
				.collect(Collectors.toList());

		//new list of distinct commentByUser
		List<String> distinctUsers = userList.stream()
				.distinct()
				.collect(Collectors.toList());

		//for each distinct user, iterate through userList and count all values of that distinct user
		distinctUsers.stream()
		.forEach(distinct -> {
			long count = userList.stream()
					.filter(user -> user.equals(distinct))
					.count();

			System.out.println("- " + distinct + " " + count + " Comment(s)");
		});
	}

	/**
	 * Find all transactions in the year 2011 and sort them by value (small to high).
	 */
	private static void question8() {
		System.out.println("All transactions in the year 2011 sorted by value (small to high)");

		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted((t1, t2) -> Integer.valueOf(t1.getYear()).compareTo(Integer.valueOf(t2.getYear())))
		.forEach(t -> System.out.println("- " + t.getValue() + " Dollar(s)"));
	}

	/**
	 * What are all the unique cities where the traders work?
	 */
	private static void question9() {
		System.out.println("All the unique cities where the traders work");

		//new list of cities
		List<String> cities = traders.stream()
				.map(trader -> trader.getCity())
				.collect(Collectors.toList());
		
		cities.stream()
		.distinct()
		.forEach(city -> System.out.println("- " + city));
	}

	/**
	 * Find all traders from Prune and sort them by name.
	 */
	private static void question10() {
		System.out.println("All traders from Prune sorted by name.");
		
		traders.stream()
		.filter(trader -> trader.getCity().equalsIgnoreCase("Prune"))
		.sorted((trader1, trader2) -> trader1.getName().compareTo(trader2.getName()))
		.forEach(trader -> System.out.println("- " + trader.getName()));
	}

	/**
	 * Return a string of all traders' names sorted alphabetically.
	 */
	private static void question11() {
		System.out.println("String of all traders' names sorted alphabetically");
		
		String s = traders.stream()
				.sorted((trader1, trader2) -> trader1.getName().compareTo(trader2.getName()))
				.map(trader -> trader.getName())
				.collect(Collectors.joining(", "));
		
		System.out.println("- " + s);
	}

	/**
	 * Are any traders based in Indore?
	 */
	private static void question12() {
		System.out.println("Traders based in Indore");
		
		traders.stream()
		.filter(trader -> trader.getCity().equalsIgnoreCase("Indore"))
		.forEach(trader -> System.out.println("- " + trader.getName()));
	}

	/**
	 * Print all transactions’ values from the traders living in Delhi.
	 */
	private static void question13() {
		System.out.println("All transactions' values from the traders living in Delhi");
		
		transactions.stream()
		.filter(t -> t.getTrader().getCity().equalsIgnoreCase("Delhi"))
		.forEach(t -> System.out.println("- " + t.getValue() + " Dollar(s) " + t.getTrader().getName()));
	}

	/**
	 * What’s the highest value of all the transactions?
	 */
	private static void question14() {
		System.out.println("Highest value of all the transactions");
		
		Transaction max = transactions.stream()
		.max((t1, t2) -> Integer.valueOf(t1.getValue()).compareTo(Integer.valueOf(t2.getValue())))
		.get();
		
		System.out.println("- " + max.getValue() + " Dollar(s) " + max.getTrader().getName());
	}

	/**
	 * Find the transaction with the smallest value.
	 */
	private static void question15() {
		System.out.println("Transaction with the smallest value");
		
		Transaction min = transactions.stream()
		.min((t1, t2) -> Integer.valueOf(t1.getValue()).compareTo(Integer.valueOf(t2.getValue())))
		.get();
		
		System.out.println("- " + min.getValue() + " Dollar(s) " + min.getTrader().getName());
	}

}
