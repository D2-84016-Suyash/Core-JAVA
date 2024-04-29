import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		int size=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size o team");
		size=sc.nextInt();
		Player[] arr = new Player[size];
		int c = 0;
		int counter = 0;

		do {
			System.out.println("0.exit");
			System.out.println("1.add bowler details");
			System.out.println("2.add batter details");
			System.out.println("3.display all the cricketers with their name and no of matches played individually");
			c = sc.nextInt();
			switch (c) {
			case 1:
				int s2;
				if (counter < size)
					arr[counter] = new Cricketer();
				arr[counter].accept(sc);
				System.out.println("enter wickets");
				s2 = sc.nextInt();
				Cricketer c1 = (Cricketer) arr[counter];
				c1.setWickets(s2);
				counter++;

				break;

			case 2:
				int s3;
				if (counter < size)

					arr[counter] = new Cricketer();

				arr[counter].accept(sc);
				System.out.println("enter runs");
				s3 = sc.nextInt();
				Cricketer c2 = (Cricketer) arr[counter];
				c2.setRuns(s3);
				counter++;

				break;

			case 3:

				double totalruns = 0;
				double totalwrickets = 0;
				double totalMactches = 0;

				for (int i=0; i < counter; i++) {

					Cricketer c6 = (Cricketer) arr[i];
					totalruns = c6.getRuns() + totalruns;
					totalwrickets = c6.getWickets() + totalwrickets;
					totalMactches = c6.getMatchesPlayed() + totalwrickets;

				}

				System.out.println("totalruns=" + totalruns);
				System.out.println("totalwrickets=" + totalwrickets);
				System.out.println("totalMacthesplayed=" + totalMactches);

				break;

			case 4:
				for (Player pl : arr) {
					System.out.println("Name=" + pl.getName());
					System.out.println("Matchesplayed=" + pl.getMatchesPlayed());

				}
				break;

			default:
				break;
			}
		} while (c != 0);

	}

}
