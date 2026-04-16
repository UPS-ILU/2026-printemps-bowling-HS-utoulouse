package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}

	@Test
	void ITER1() {
		game.roll(0);
		assertEquals(game.score(), 0);
	}
	
	@Test
	void ITER2() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(game.score(), 0);
	}
	
	@Test
	void ITER3() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(game.score(), 20);
	}

	@Test
	void ITER4() {
		for (int i = 0; i < 10; i++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);
		}
		assertEquals(game.score(), 30);
	}
}
