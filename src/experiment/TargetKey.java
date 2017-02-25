package experiment;

public class TargetKey {
	public BoardCell cell;
	public int distance;
	public TargetKey(BoardCell cell, int distance) {
		this.cell = cell;
		this.distance = distance;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (!(o instanceof TargetKey)) return false;
        TargetKey key = (TargetKey) o;
        return cell == key.cell && distance == key.distance;
	}
	@Override
	public int hashCode() {
		int result = cell.GetRow();
		result = 31 * result + cell.GetColumn();
		result = 31 * result + distance;
		return result;
	}
}
