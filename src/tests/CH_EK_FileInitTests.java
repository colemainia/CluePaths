package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clueGame.Board;

public class CH_EK_FileInitTests {
	public static final int LEGEND_SIZE = 11;
	public static final int NUM_ROWS = 22;
	public static final int NUM_COLUMNS = 23;
	// NOTE: I made Board static because I only want to set it up one 
	// time (using @BeforeClass), no need to do setup before each test.
	private static Board board;
	@Before
	public void before() {
		board = board.getInstance();
		board.setConfigFiles("CH_EK/ClueLayout.csv", "CH_EK/legend.txt");
		board.initialize();
	}
	@Test
	public void test() {
		assertTrue(1 == 1);
	}
	
}
