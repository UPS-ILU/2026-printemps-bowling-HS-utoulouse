package tdd;

public class Game {

	int total = 0;
	int resPremierTir = 0;
	Boolean spare = false;
	Boolean strike = false;
	Boolean premierTir = true;

	void roll(int nbQuilles) {
		if (premierTir) {
			if (spare) {
				total += nbQuilles;
				spare = false;
			}
			resPremierTir = nbQuilles;
		} else {
			if (nbQuilles + resPremierTir == 10) {
				spare = true;
			}total += nbQuilles + resPremierTir;
		}
		premierTir = !premierTir;
	}

	int score() {
		return total;
	}
}
