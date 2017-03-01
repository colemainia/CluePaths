package clueGame;

import java.util.Map;
import java.util.Set;

public class Board {
	private int numRows;
	private int numColumns;
	public static final MAX_BOARD_SIZE;
	private BoardCell [][] board;
	private Map<Character,String> legend;
	private Map<BoardCell, Set<BoardCell>> adjMatrix;
	private Set<BoardCell> targets;
	private String boardConfigFile;
	private String roomComfigFile;
	
	public Board getInstance(){
		
	}
	
	public Board initialize(){
		
	}
	
	public Board loadRoomConfig(){
		return new Board();
	}
	
	public Board loadBoardConfig(){
		
	}
	
	public Board calcAdjacencies(){
		
		
	}
	
	public Board calcTargets(BoardCell cell, int pathLength){
		
	}
	
}
