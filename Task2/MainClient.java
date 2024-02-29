import java.util.Scanner;
class MainClient {
	public static void main(String[] args) {
		System.out.println("Please type your name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello, " + name + ". Please type your age:");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println( age + " is a fine age.");
		int yearsTillRetirement = 67-age;
		System.out.println("You may retire in " + yearsTillRetirement + " years.");
		
		
	}
}