public class Mine {
// First Change


	private int xPosition;
	private int yPosition;
	private int checked = 0;
	private int mineOrClean = -1;

	public int getChecked() {
		return this.checked;

	}
// Second Change
	public void setChecked(int checkValue) {
		this.checked = checkValue;
	}

	public int getX() {
		return this.checked;

	}

	public void setX(int X) {
		this.xPosition = X;
	}

	public int getY() {
		return this.checked;

	}

	public void setY(int Y) {
		this.yPosition = Y;
	}

	public int getmineOrClean() {
		return this.mineOrClean;
	}

	public void setmineOrClean(int mineValue) {
		this.mineOrClean = mineValue;
	}

	public String toString() {
		return getmineOrClean() == 0 ? " G " : " R ";
	}

}
