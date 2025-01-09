package ideas;

public class Program {

	public static void main(String[] args) {

		
		String[] cards = {"Ace Spades","2 Spades","3 Spades","4 Spades","5 Spades","6 Spades","7 Spades","8 Spades","9 Spades","10 Spades","Jack Spades","Queen Spades","King Spades","Ace Hearts","2 Hearts","3 Hearts","4 Hearts","5 Hearts","6 Hearts","7 Hearts","8 Hearts","9 Hearts","10 Hearts","Jack Hearts","Queen Hearts","King Hearts","Ace Clubs","2 Clubs","3 Clubs","4 Clubs","5 Clubs","6 Clubs","7 Clubs","8 Clubs","9 Clubs","10 Clubs","Jack Clubs","Queen Clubs","KingClubs","Ace Diamonds","2 Diamonds","3 Diamonds","4 Diamonds","5 Diamonds","6 Diamonds","7 Diamonds","8 Diamonds","9 Diamonds","10 Diamonds","Jack Diamonds","Queen Diamonds","King Diamonds"};
		int[] hand = {11, 6, 3, 8, 5};
		
		int value = 0;
		for(int no : hand) {
			System.out.println(cards[no]);
			char c = cards[no].charAt(0);
			if("AJQK".contains(""+c)) {
				value += 10;
			}
			else
				value += c - '0';
		}
		System.out.println(value);
	}

}
