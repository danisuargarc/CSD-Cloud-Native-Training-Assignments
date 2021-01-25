import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Implement the console based chatting using collections.
 * Here are the options to be placed for to the user:
 * 
 * >java ChatApplication
 * 
 * Options:
 * A) Create a chatroom
 * B) Add the user
 * C) User login
 * D) Send a message
 * E) Display the messages from a specific chatroom
 * F) List down all users belonging to the specified chat room.
 * G) Logout
 * H) Delete an user
 * I) Delete the chat room
 * 
 * Please enter your option:
 * 
 * @author dgarci11
 *
 */
public class Question6 {

	private static Map<Integer, ArrayList<String>> messages = new HashMap<>();
	private static Map<Integer, ArrayList<String>> users = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean online = true;
		boolean loggedIn = false;
		int chatroomCounter = 0;

		System.out.println("Welcome to Chat Application!\nWhat would you like to do?");

		while (online) {
			System.out.println("\nOptions:");
			System.out.println("A) Create a chatroom");
			System.out.println("B) Add a user");
			System.out.println("C) User login");
			System.out.println("D) Send a message");
			System.out.println("E) Display the messages from a specific chatroom");
			System.out.println("F) List down all users belonging to the specified chat room");
			System.out.println("G) Logout");
			System.out.println("H) Delete a user");
			System.out.println("I) Delete the chat room\n");

			switch ((scanner.nextLine()).toUpperCase().charAt(0)) {
			case 'A':
				chatroomCounter++;
				messages.put(chatroomCounter, new ArrayList<String>());
				users.put(chatroomCounter, new ArrayList<String>());
				System.out.println("Chatroom " + chatroomCounter + " is now active!");
				break;
			case 'B':
				System.out.println("What username would you like to add?");
				String username = scanner.nextLine();
				System.out.println("What chatroom do you want this user in?");
				int chatroom = Integer.parseInt(scanner.nextLine());
				users.get(chatroom).add(username);
				System.out.println(username + " is now in chatroom " + chatroom + "!");
				break;
			case 'C':
				System.out.println("What's your username?");
				String user = scanner.nextLine();
				loggedIn = true;
				System.out.println("You're now logged in!");
				break;
			case 'D':
				if (loggedIn) {
					System.out.println("What's your message?");
					String message = scanner.nextLine();
					System.out.println("What chatroom do you want this message in?");
					int chatRoom = Integer.parseInt(scanner.nextLine());
					messages.get(chatRoom).add(message);
					System.out.println("Sucessfully sent!");
				}
				else {
					System.out.println("You must be logged in to send messages!");
				}
				break;
			case 'E':
				System.out.println("Which chatroom's messages do you want displayed?");
				int chatrm = Integer.parseInt(scanner.nextLine());
				messages.get(chatrm).forEach(msg -> System.out.print("- " + msg));
				System.out.println();
				break;
			case 'F':
				System.out.println("Which chatroom's users do you want displayed?");
				int chtrm = Integer.parseInt(scanner.nextLine());
				users.get(chtrm).forEach(usr -> System.out.print("- " + usr));
				System.out.println();
				break;
			case 'G':
				online = false;
				System.out.println("Goodbye!");
				break;
			case 'H':
				System.out.println("What username would you like to remove?");
				String usernm = scanner.nextLine();
				for (Integer key : users.keySet()) {
					if (users.get(key).contains(usernm)) {
						users.get(key).remove(usernm);
					}
				}
				System.out.println(usernm + " successfully deleted!");
				break;
			case 'I':
				System.out.println("Which chatroom would you like to delete?");
				int room = Integer.parseInt(scanner.nextLine());
				messages.remove(room);
				users.remove(room);
				System.out.println("Chatroom " + room + " successfully deleted!");
				break;
			}
			
		}


	}

}