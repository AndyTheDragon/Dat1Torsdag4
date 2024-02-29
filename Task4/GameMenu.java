import java.util.ArrayList;
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
	
	
	
	
	
}