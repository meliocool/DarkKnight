import java.util.Scanner;
public class Menu {
	Scanner scan = new Scanner(System.in);
	private int Choice;
	private String playerName;
	public void menu() {
		Boolean loop = true;
		while(loop) {
			System.out.println("Dark Knight");
			System.out.println("1. Play");
			System.out.println("2. Exit");
			System.out.print(">> ");
			Choice = scan.nextInt();
			scan.nextLine();
			if(Choice == 1) {
				while(true) {
					System.out.print("Input Name [>=5]: ");
					playerName = scan.nextLine();
					if(playerName.length() >= 5) {
						break;
					}
				}
				System.out.println("Welcome to Dark Knight, " + playerName);
				System.out.println("Press enter to continue...");
				String input = scan.nextLine();
				while(!input.equals("")) {
					System.out.println("Press enter to continue...");
					input = scan.nextLine();
				}
				loop = false;
			} else if (Choice == 2) {
				System.out.println("Goodbye!");
				System.exit(0);
			} else {
				System.out.println("Please only 1 or 2!");
			}
		}
	}
}
