package clueGame;

import java.util.Set;

public class BoardCell {
	public enum DoorDirection {
		UP, DOWN, LEFT, RIGHT, NONE;
	}
	private int row;
	private int column;
	private char initial;
	public BoardCell(int row, int column) {
		this.row = row;
		this.column = column;
	}
	public boolean isWalkway() {return true;}
	public boolean isRoom() {return true;}
	public boolean isDoorway() {return true;}
	
	public int GetRow() {return row;}
	public int GetColumn() {return column;}
}
