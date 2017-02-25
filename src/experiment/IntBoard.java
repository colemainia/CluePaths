package experiment;

import java.util.Map;
import java.util.Set;

public class IntBoard {
	public IntBoard(BoardCell[][] grid) {
		this.grid = grid;
		
	}
	private Map<BoardCell, Set<BoardCell>> calcAdjacencies() {
		return adjMtx;
	}
	private Set<BoardCell> calcTargets(BoardCell startCell, int pathLength) {
		return targets;
	}
	private Map<BoardCell, Set<BoardCell>> adjMtx;
	private Set<BoardCell> visited;
	private Set<BoardCell> targets;
	private BoardCell[][] grid;
}
