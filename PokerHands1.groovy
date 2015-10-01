// get first card
System.out.println("Please input card 1 rank 1-10,J, Q or K");
String r1 = System.console().readLine();
System.out.println("Please input card 1 suit Hearts, Diamonds, Clubs or Spades")
String s1 = System.console().readLine().toUpperCase();
int rank1 = 0;
//Convert ranks to integers for ordering
if (!r1.isInteger()) {
    if (r1.toUpperCase().equals("J")) {
        rank1 = 11;
    }
    else if (r1.toUpperCase().equals("Q")) {
        rank1 = 12;
    }
    else if (r1.toUpperCase().equals("K")) {
        rank1 = 13;
    }
    else {
        System.out.println("not a valid rank input");
    }
}
else {
    rank1 = Integer.parseInt(r1);
}

// get second card
System.out.println("Please input card 2 rank 1-10,J, Q or K");
String r2 = System.console().readLine();
System.out.println("Please input card 2 suit Hearts, Diamonds, Clubs or Spades")
String s2 = System.console().readLine().toUpperCase();
int rank2 = 0;
//Convert ranks to integers for ordering
if (!r2.isInteger()) {
    if (r2.toUpperCase().equals("J")) {
        rank2 = 11;
    }
    else if (r2.toUpperCase().equals("Q")) {
        rank2 = 12;
    }
    else if (r2.toUpperCase().equals("K")) {
        rank2 = 13;
    }
    else {
        System.out.println("not a valid rank input");
    }
}
else {
    rank2 = Integer.parseInt(r2);
}

// get third card
System.out.println("Please input card 3 rank 1-10,J, Q or K");
String r3 = System.console().readLine();
System.out.println("Please input card 3 suit Hearts, Diamonds, Clubs or Spades")
String s3 = System.console().readLine().toUpperCase();
int rank3 = 0;
//Convert ranks to integers for ordering
if (!r3.isInteger()) {
    if (r3.toUpperCase().equals("J")) {
        rank3 = 11;
    }
    else if (r3.toUpperCase().equals("Q")) {
        rank3 = 12;
    }
    else if (r3.toUpperCase().equals("K")) {
        rank3 = 13;
    }
    else {
        System.out.println("not a valid rank input");
    }
}
else {
    rank3 = Integer.parseInt(r3);
}

// get fourth card
System.out.println("Please input card 4 rank 1-10,J, Q or K");
String r4 = System.console().readLine();
System.out.println("Please input card 4 suit Hearts, Diamonds, Clubs or Spades")
String s4 = System.console().readLine().toUpperCase();
int rank4 = 0;
//Convert ranks to integers for ordering
if (!r4.isInteger()) {
    if (r4.toUpperCase().equals("J")) {
        rank4 = 11;
    }
    else if (r4.toUpperCase().equals("Q")) {
        rank4 = 12;
    }
    else if (r4.toUpperCase().equals("K")) {
        rank4 = 13;
    }
    else {
        System.out.println("not a valid rank input");
    }
}
else {
    rank4 = Integer.parseInt(r4);
}

// get fifth card
System.out.println("Please input card 5 rank 1-10,J, Q or K");
String r5 = System.console().readLine();
System.out.println("Please input card 5 suit Hearts, Diamonds, Clubs or Spades")
String s5 = System.console().readLine().toUpperCase();
int rank5 = 0;
//Convert ranks to integers for ordering
if (!r5.isInteger()) {
    if (r5.toUpperCase().equals("J")) {
        rank5 = 11;
    }
    else if (r5.toUpperCase().equals("Q")) {
        rank5 = 12;
    }
    else if (r5.toUpperCase().equals("K")) {
        rank5 = 13;
    }
    else {
        System.out.println("not a valid rank input");
    }
}
else {
    rank5 = Integer.parseInt(r5);
}
// Print cards

System.out.println("Card 1: " + r1 + " of " + s1);
System.out.println("Card 2: " + r2 + " of " + s2);
System.out.println("Card 3: " + r3 + " of " + s3);
System.out.println("Card 4: " + r4 + " of " + s4);
System.out.println("Card 5: " + r5 + " of " + s5);

//check for flush

if ((s1.equals(s2)) && (s1.equals(s3)) && (s1.equals(s4)) && (s1.equals(s5))) {
    // straight flush check here.
    
    Boolean ascendingStraight = (((rank2-rank1 == 1) && ((rank3-rank2) == 1) && ((rank4-
    rank3) == 1) && ((rank5-rank4) == 1));
    Boolean descendingStraight = (((rank2-rank1 == -1) && ((rank3-rank2) == -1) && ((rank4-
    rank3) == -1) && ((rank5-rank4) == -1));   
    
    if (ascendingStraight || descendingStraight) {
    	System.out.println("Straight Flush");
    }
    else {
    
    System.out.println("Flush")
    
    }
}
else {
    //straight check
    Boolean ascendingStraight = (((rank2-rank1 == 1) && ((rank3-rank2) == 1) && ((rank4-
    rank3) == 1) && ((rank5-rank4) == 1));
    Boolean descendingStraight = (((rank2-rank1 == -1) && ((rank3-rank2) == -1) && ((rank4-
    rank3) == -1) && ((rank5-rank4) == -1));   
    
    if (ascendingStraight || descendingStraight) {
    	System.out.println("Straight");
    }
    
    else {
    	// Two of a kind check
    	
    }    
}

