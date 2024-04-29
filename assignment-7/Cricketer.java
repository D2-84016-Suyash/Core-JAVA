import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {

	private int runs;
	private int wickets;
	
	public Cricketer(int runs, int wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}

	public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets) {
		super(id, name, age, matchesPlayed);
		this.runs = runs;
		this.wickets = wickets;
	}

	public Cricketer() {
		super();
	}

	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}

	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return wickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public void accept(Scanner sc) {
		
		System.out.println("Enter details for Cricketer:");
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("id: ");
		id = sc.nextInt();
		System.out.print("Age: ");
		age = sc.nextInt();
		System.out.print("Matches Played: ");
		matchesPlayed = sc.nextInt();
//		System.out.print("Runs: ");
//		runs = sc.nextInt();
//		System.out.print("Wickets: ");
//		wickets = sc.nextInt();
		
	}

	
	
}

	

	
