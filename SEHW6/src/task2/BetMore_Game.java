package task2;

public class BetMore_Game {

	public int play() {
		return Game_Chair.s.pick_card();
	}
	
	public Player FindWinner(Player p1, Player p2) {
		if(p1.number>p2.number) {
			return p1;
		}else if(p2.number>p1.number) {
			return p2;
		}else {
			return new Player();
		}
	}
}
