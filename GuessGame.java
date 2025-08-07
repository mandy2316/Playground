import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	private static final int MAX_GUESS = 100;
	private static final int MAX_COUNT = 1000;

	private static final Scanner console = new Scanner(System.in);

	public static int generateRandom() {
		Random r = new Random();
		int number = 1 + r.nextInt(MAX_GUESS);
		return number;
	}

	public static void instruction() {
		StringBuilder sb = new StringBuilder();
		sb.append("I will think of a number between 1 and 100\n");
		sb.append("Please make a guess of my number. ");
		sb.append("For each guess, I will tell you whether the\n");
		sb.append("right answer (my number) is higher or lower than your guess.\n");
		System.out.println(sb.toString());
	}

	public static int playOneGame() {
		System.out.println("\nI'm thinking of a number...\n");
		int number = generateRandom();
		boolean gaming = true;
		int guesses = 0;
		while (gaming) {
			System.out.print("Your guess? ");
			int guessNumber = console.nextInt();
			if (guessNumber < number) {
				System.out.println("Maybe try higher");
			} else if (guessNumber > number) {
				System.out.println("Maybe try lower");
			}
			guesses++;
			gaming = guessNumber != number;
		}
		System.out.printf("You got it right in %d guesses\n", guesses);
		return guesses;
	}

	private static int totalGuesses(int[] guesses, int games) {
		int total = 0;
		for (int i = 0; i < games; i++) {
			total += guesses[i];
		}
		return total;
	}

	private static double averageGuesses(int[] guesses, int games) {
		double total = totalGuesses(guesses, games);
		return total / games;
	}

	private static int maxGuesses(int[] guesses, int games) {
		int max = guesses[0];
		for (int i = 1; i < games; i++) {
			if (guesses[i] > max) {
				max = guesses[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		instruction();
		boolean gaming = true;
		int[] guesses = new int[MAX_COUNT];
		int games = 0;
		while (gaming) {
			guesses[games++] = playOneGame();
			System.out.print("\nWould you like to play again?(Press 'Yes' or 'No'): ");
			String choose = console.next().trim().toLowerCase();
			gaming = choose.startsWith("y");
		}
		System.out.println("\nOverall results:");
		System.out.printf("Total games = %d\n", games);
		System.out.printf("Total guesses = %d\n", totalGuesses(guesses, games));
		System.out.printf("Average guesses/game = %1.2f\n", averageGuesses(guesses, games));
		System.out.printf("Total games = %d\n", maxGuesses(guesses, games));
	}

}
