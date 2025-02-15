package finaljavaprojectweek6;



public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.shuffle();
		
		Player player1 = new Player ("Player 1");
		Player player2 = new Player ("Player 2");
		
		for (int i = 0; i<52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
	for (int i=0; i < 26; i++) {
		Card card = player1.flipCard();
		System.out.print("Player 1's card is "); 
		card.describe();
		Card card2 = player2.flipCard();
		System.out.print("Player 2's card is ");
		card2.describe();
		
		if (card.getValue()> card2.getValue()) {
			player1.incrementScore();
			System.out.println("Player 1 wins this round!");
			System.out.println("----------------------------");
		} else if (card.getValue()< card2.getValue()) {
			player2.incrementScore();
			System.out.println("Player 2 wins this round!");
			System.out.println("----------------------------");
		} else {
			System.out.println("This round is a draw!");
			System.out.println("----------------------------");
		}
	}

    System.out.println("Final Score: " + "Player 1" + " - " + player1.getScore() + ", " + "Player 2" +
    									" - " + player2.getScore());
    if (player1.getScore()>player2.getScore()){
    	System.out.println("Player 1 wins the game of War!");
    } else if (player1.getScore() < player2.getScore()) {
    	System.out.println("Player 2 wins the game of War!");
    } else {
    	System.out.println("This game of War is a draw!");
    }
	
	}
	


}
