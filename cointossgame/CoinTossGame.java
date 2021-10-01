package cointossgame;

import java.util.Scanner;

public class CoinTossGame {

	public static String player1Choice;
	public static String player2Choice;

	public static void main(String[] args) {
		Coin coin = new Coin();
		CoinTossGame coinTossGame = new CoinTossGame();
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter first player name");
		Player player1 = new Player(scan.nextLine());
		System.out.println("please enter second player name");
		Player player2 = new Player(scan.nextLine());
		System.out.println("please enter choice");
		String playerChoice = scan.nextLine();
		scan.close();
		setPlayersChoice(playerChoice);
		String result = coin.flip();
		System.out.println("result is " + result);
		coinTossGame.declareResult(player1, player2, result);

	}

	public static void setPlayersChoice(String playerChoice) {
		if (playerChoice.equalsIgnoreCase(Coin.HEADS)) {
			player1Choice = Coin.HEADS;
			player2Choice = Coin.TAILS;
		} else if (playerChoice.equalsIgnoreCase(Coin.TAILS)) {
			player1Choice = Coin.TAILS;
			player2Choice = Coin.HEADS;
		} else {
			System.out.println("Invalid choice");
		}
	}

	public void declareResult(Player player1, Player player2, String result) {
		if (result.equalsIgnoreCase(player1Choice)) {
			System.out.println("Winner is " + player1.getName());
		} else if (result.equalsIgnoreCase(player2Choice)) {
			System.out.println("Winner is " + player2.getName());
		} else {
			System.out.println("Player hasn't made a valid choice");
		}
	}

}
