package task2;

public class Game_Chair {
	
	public Player Computer;
	public Player Player_2;
	public static BetMore_Game Bet;
	public static Shuffle s;
	
	public Game_Chair() {
		Computer=new Player();
		Player_2=new Player();
		Computer.user_selected=false;
		Computer.user_selected=true;
		Bet=new BetMore_Game();
		s=new Shuffle();
		Computer.start();
		Player_2.start();
	}
	

}
