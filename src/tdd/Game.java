package tdd;

public class Game {
	
	int total = 0;

	void roll(int nbQuilles) {
		total += nbQuilles;
	}
	
	int score() {
		return total;
	}
}
