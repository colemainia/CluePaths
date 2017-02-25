package experiment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntBoard {
	public IntBoard(BoardCell[][] grid) {
		this.grid = grid;
		calcAdjacencies();
		visited = new HashSet<BoardCell>();
		targets = new HashMap<TargetKey, Set<BoardCell>>();
	}
	private void calcAdjacencies() {
		adjMtx = new HashMap<BoardCell, Set<BoardCell>>();
		for (BoardCell[] cellrow : grid) {
			for (BoardCell cell : cellrow) {
				adjMtx.put(cell, new HashSet<BoardCell>());
			}
		}
	}
	private void calcTargets(TargetKey key) {targets.put(key, new HashSet<BoardCell>());}
	public Set<BoardCell> getAdjList(BoardCell start) {return adjMtx.get(start);}
	public Set<BoardCell> getTargets(TargetKey key) {
		if (!targets.containsKey(key)) {
			calcTargets(key);
		}
		return targets.get(key);
	}
	public BoardCell getCell(int row, int col) {
		return grid[row][col];
	}
	private Map<BoardCell, Set<BoardCell>> adjMtx;
	private Set<BoardCell> visited;
	private Map<TargetKey, Set<BoardCell>> targets;
	private BoardCell[][] grid;
}
