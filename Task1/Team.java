import java.util.ArrayList;

class Team {
	private String teamName;
	private int rank;
	private ArrayList<String> players= new ArrayList<>();
	
	Team(String name) {
		this.setName(name);
	}
	
	Team(String name, int rank) {
		this.setName(name);
		this.rank = rank;
	}
	
	public void setName(String name) {
		this.teamName = name;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Hold: " + this.teamName + "\t Rang: "+ this.rank;
	}
	
}