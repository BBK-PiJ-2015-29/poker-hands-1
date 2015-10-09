class Hand {
	Card card1;
	Card card2;
	Card card3;
	Card card4;
	Card card5;
	
		
	//method to print hand
	void printHand() {
		System.out.println(this.card1.stringRank + " of " + this.card1.stringSuit);
		System.out.println(this.card2.stringRank + " of " + this.card2.stringSuit);
		System.out.println(this.card3.stringRank + " of " + this.card3.stringSuit);
		System.out.println(this.card4.stringRank + " of " + this.card4.stringSuit);
		System.out.println(this.card5.stringRank + " of " + this.card5.stringSuit);
	}
}
class Card {
	int rank;
	String stringRank;
	int suit;
	String stringSuit;
	

	// set rank method
	void setRank() {
		String r1 = "";
		boolean rankLoop = true;
		while (rankLoop) {
			System.out.println("Please input card rank 1-10,J, Q or K");
			System.out.print("> ");
			r1 = System.console().readLine();
			//Convert ranks to integers for ordering
			if (!r1.isInteger()) {
				if (r1.toUpperCase().equals("J")) {
					this.rank = 11;
					this.stringRank = "Jack";
					rankLoop = false;
				}
				else if (r1.toUpperCase().equals("Q")) {
					this.rank = 12;
					this.stringRank = "Queen";
					rankLoop = false;
				}
				else if (r1.toUpperCase().equals("K")) {
					this.rank = 13;
					this.stringRank = "King";
					rankLoop = false;
				}
				else if (r1.toUpperCase().equals("A")) {
					this.rank = 1;
					this.stringRank = "Ace";
					rankLoop = false;
				}
				else if (r1.toUpperCase().equals("EXIT")) {
					System.exit(0);
				}
				else {
					System.out.println("not a valid rank input");
				}
				
			}
			else {
				this.rank = Integer.parseInt(r1);
				if ((this.rank > 0) && (this.rank < 11)) {
					rankLoop = false;
					
					switch (this.rank) {
						case 1: this.stringRank = "Ace";
						break;
						case 2: this.stringRank = "Two";
						break;
						case 3: this.stringRank = "Three";
						break;
						case 4: this.stringRank = "Four";
						break;
						case 5: this.stringRank = "Five";
						break;
						case 6: this.stringRank = "Six";
						break;
						case 7: this.stringRank = "Seven";
						break;
						case 8: this.stringRank = "Eight";
						break;
						case 9: this.stringRank = "Nine";
						break;
						case 10: this.stringRank = "Ten";
						break;
						default: break;
					}
				}
				else {
					System.out.println("not a valid rank input");
				}
			}
		}
		
	}
	//get rank method
	int getRank() {
		return this.rank;
	}
	
	// set suit
	void setSuit() {
		boolean invalidSuit = true;
		String s1 = "";
		while (invalidSuit) {
			System.out.println("Please input card 1 suit Hearts, Diamonds, Clubs or Spades");
			System.out.print("> ");
			s1 = System.console().readLine().toUpperCase();
			if (s1.substring(0,1).equals("H")) {
				this.suit = 1;
				this.stringSuit = "Hearts";
				invalidSuit = false;
			}
			else if (s1.substring(0,1).equals("D")) {
				this.suit = 2;
				this.stringSuit = "Diamonds";
				invalidSuit = false;
			}
			else if (s1.substring(0,1).equals("C")) {
				this.suit = 3;
				this.stringSuit = "Clubs";
				invalidSuit = false;
			}
			else if (s1.substring(0,1).equals("S")) {
				this.suit = 4;
				this.stringSuit = "Spades";
				invalidSuit = false;
			}
			else if (s1.equals("EXIT")) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid suit!");
			}
		}
		
	}
}
//method to check if suits match
boolean checkMatchSuits (Card first, Card second) {
	if (first.suit == second.suit) {
		return true;
	}
	else {
		return false;
	}
}
// method to check if ranks match
boolean checkMatchRanks (Card first, Card second) {
	if (first.rank == second.rank) {
		return true;
	}
	else {
		return false;
	}
}

//method to check that cards match exactly
boolean checkValidCard (Card first, Card second) {
	if (checkMatchSuits(first, second) && checkMatchRanks(first, second)) {
		return false;
	}
	else {
		return true;
	}
}

// Create the hand of 5 cards
Hand myHand = new Hand();

Card card1 = new Card();
Card card2 = new Card();
Card card3 = new Card();
Card card4 = new Card();
Card card5 = new Card();

// Add cards to the hand
card1.setRank();
card1.setSuit();
myHand.card1 = card1;

boolean card2OK = false;
while (!card2OK) {
	card2.setRank();
	card2.setSuit();
	if (checkValidCard(card1, card2)) {
		myHand.card2 = card2;
		card2OK = true;
	}
	else {
		System.out.println("Can't be the same card, try again");
	}
}

boolean card3OK = false;
while (!card3OK) {
	card3.setRank();
	card3.setSuit();
	if (checkValidCard(card2, card3)) {
		myHand.card3 = card3;
		card3OK = true;
	}
	else {
		System.out.println("Can't be the same card, try again");
	}
}

boolean card4OK = false;
while (!card4OK) {
	card4.setRank();
	card4.setSuit();
	if (checkValidCard(card3, card4)) {
		myHand.card4 = card4;
		card4OK = true;
	}
	else {
		System.out.println("Can't be the same card, try again");
	}
}

boolean card5OK = false;
while (!card5OK) {
	card5.setRank();
	card5.setSuit();
	if (checkValidCard(card4, card5)) {
		myHand.card5 = card5;
		card5OK = true;
	}
	else {
		System.out.println("Can't be the same card, try again");
	}
}

myHand.printHand();
