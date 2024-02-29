import java.util.ArrayList;
class Main {
	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
		GameMenu menu = new GameMenu(actions);
		int choice = menu.getAction();
		System.out.println("You chose: " + choice);
		doAction(choice);
	}
	
	public static void doAction(int action) {
		switch(action) {
			case 1:
				System.out.println("Starting the game now");
				break;
			case 2:
				System.out.println("Fetching previously saved game data");
				break;
			case 3:
				System.out.println("Game paused");
				break;
			case 4:
				System.out.println("Ending game");
				break;
		}
	}
		
}