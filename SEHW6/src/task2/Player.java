package task2;

public class Player {
	
	public int number;
	public boolean user_selected;

	public int start() {
		number=Game_Chair.Bet.play();
		if(!user_selected) {
			System.out.println("Ihre Zufallszahl lautet: "+number);
			System.out.println("Möchten Sie eine neue generieren?");
		}
		for (int i=0;i<4&&!user_selected;i++) {
			number=Game_Chair.Bet.play();
		}
		return number;
	}
	
}
