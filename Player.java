package finaljavaprojectweek6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import finaljavaprojectweek6.Card;
import finaljavaprojectweek6.Deck;

public class Player {
	


	
		private List<Card> hand;
		private int score;
		private String name;
		
		public Player (String name) {
			this.hand = new ArrayList<>();
			this.setScore(0);
			this.name = name;
			
		}
		
		public void draw (Deck deck) {
			hand.add(deck.draw());
		}
		
		public Card flipCard() {
			return hand.remove(0);
		}
		
		public void incrementScore() {
			setScore(getScore() + 1);
		}
		
		public void describe() {
			System.out.println(name+ "'s hand: ");
			for (Card card: hand) {
				card.describe();
			}
		
		
		
		
		
		
		//Shows the cards that the players have in hand. 
		
		Map<String, List<Card>> board = new HashMap<>();
		int numberOfPlayers = 2;
		board = hand(numberOfPlayers);
		
		System.out.println("----------------------------------");
		for (int i = 1; i <= numberOfPlayers; i++) {
			String playerName = "Player "+ i;
			System.out.println(playerName + "\n-----------");
			List<Card>playerList = board.get(playerName);
			for (Card handCard: playerList) {
				handCard.describe();
			}
				
			System.out.println("----------------------------------");
			}
		
	
		
		
		
		
	} 
		

	
	
	// Setting up each players hand of cards
	
	public static Map<String, List<Card>> hand (int numbOfPlayers){
		Map<String, List<Card>> gameBoard = new HashMap<>();
		
		Deck deck = new Deck();
		deck.shuffle();
		
		for (int i = 1; i <= numbOfPlayers; i++) {
			List<Card> playerList = new ArrayList<>();
			String playerName = "Player "+i;
			gameBoard.put(playerName, playerList);
		}
		
		for (int i = 0; i < 52/numbOfPlayers; i++){
			for (int j = 1; j <= numbOfPlayers; j++) {
				String playerName = "Player "+j;
				List<Card> playerList = gameBoard.get(playerName);
				playerList.add(deck.draw());
				gameBoard.replace(playerName, playerList);
			
		}
		

	}
	
		return gameBoard;


    
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	
}
