import java.util.ArrayList;
class GameMenu {
	private ArrayList<String> actionList; // = new ArrayList<>();
	
	GameMenu(ArrayList<String> actions) {
		this.actionList = actions;
	}
	
	public void displayMenu() {
		System.out.println("Game Menu");
		for (String action : actionList) {
			System.out.println(action);
		}
	}
	
	
	
	
	
}