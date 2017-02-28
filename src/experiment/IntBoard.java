package experiment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntBoard {
	public IntBoard(BoardCell[][] grid) { 
		this.grid = grid;
		calcAdjacencies();
		targets = new HashMap<TargetKey, Set<BoardCell>>();
	}
	private void calcAdjacencies() {
		adjMtx = new HashMap<BoardCell, Set<BoardCell>>();
		for(int i=0; i<grid.length; i++){
			for (int j=0; j<grid[i].length; j++){
				Set<BoardCell> adjacencies = new HashSet<BoardCell>();
				if (i + 1 < grid.length) adjacencies.add(grid[i + 1][j]);
				if (!((i-1) < 0)) adjacencies.add(grid[i - 1][j]);
				if (j+1 <grid[i].length) adjacencies.add(grid[i][j+1]);
				if (!((j-1)<0)) adjacencies.add(grid[i][j-1]);
				adjMtx.put(grid[i][j], adjacencies);
			}
		}
	}
	private void calcTargets(TargetKey key) {
		Set<BoardCell> tgtCells = new HashSet<BoardCell>();
		Set<BoardCell> visited = new HashSet<BoardCell>();
		calcTargetsHelper(key, tgtCells, visited);
		targets.put(key, tgtCells);
	}
	private void calcTargetsHelper(TargetKey key, Set<BoardCell> tgtCells, Set<BoardCell> visited) {
		if (key.distance == 0) {
			tgtCells.add(key.cell);
			return;
		}
		visited.add(key.cell);
		for (BoardCell neighbor : getAdjList(key.cell)) {
			if (!visited.contains(neighbor)) {
				Set<BoardCell> nextVisited = new HashSet<BoardCell>(visited);
				TargetKey nextLevel = new TargetKey(neighbor, (key.distance - 1));
				calcTargetsHelper(nextLevel, tgtCells, nextVisited);
			}
		}
	}
	public Set<BoardCell> getAdjList(BoardCell start) {return adjMtx.get(start);}
	public Set<BoardCell> getTargets(BoardCell cell, int distance) {
		TargetKey key = new TargetKey(cell, distance);
		if (!targets.containsKey(key)) calcTargets(key);
		return targets.get(key);
	}
	public BoardCell getCell(int row, int col) {return grid[row][col];}
	private Map<BoardCell, Set<BoardCell>> adjMtx;
	private Map<TargetKey, Set<BoardCell>> targets;
	private BoardCell[][] grid;
}
