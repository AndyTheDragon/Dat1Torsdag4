import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
	private ArrayList<String> actions; // = new ArrayList<>();
	
	GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}
	
	public void displayMenu() {
		System.out.println("Game Menu");
		for (String action : actions) {
			System.out.println(action);
		}
	}
	
	public int getAction() {
		System.out.println("Type a number to choose an action");
		this.displayMenu();
		Scanner scan = new Scanner(System.in);
		if (!scan.hasNextInt()) {
			System.out.println("Wrong input. Please type a number.");
			//return getAction();
		} else {
			int choice = scan.nextInt();
			if (choice>0 && choice<=actions.size()) {
				//return actions.get(choice-1);
				return choice;
			}
			System.out.println("Please choose an action from the list.");
			//return getAction();
		}
		return getAction();
		//return -1; //"Something did fucked up. We shouldn't be able to end here.";
	}
			
	
	
	
}