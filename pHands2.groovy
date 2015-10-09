class Card {
	int rank;
	String stringRank;
	String suit;

	// set rank method
	void setRank() {
		String r1 = "";
		boolean rankLoop = true;
		while (rankLoop) {
			System.out.println("Please input card 1 rank 1-10,J, Q or K");
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
				else {
					System.out.println("not a valid rank input");
				}
				
			}
			else {
				this.rank = Integer.parseInt(r1);
				if ((this.rank > 0) && (this.rank < 11)) {
					rankLoop = false;
					
					switch (this.rank) {
						case 1: this.stringRank = "One";
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
				this.suit = "Hearts";
				invalidSuit = false;
			}
			else if (s1.substring(0,1).equals("D")) {
				this.suit = "Diamonds";
				invalidSuit = false;
			}
			else if (s1.substring(0,1).equals("C")) {
				this.suit = "Clubs";
				invalidSuit = false;
			}
			else if (s1.substring(0,1).equals("S")) {
				this.suit = "Spades";
				invalidSuit = false;
			}
			else {
				System.out.println("Invalid suit!");
			}
		}
		
	}
}


Card card1 = new Card();
card1.setRank();
card1.setSuit();

System.out.println(card1.stringRank + " of " + card1.suit);