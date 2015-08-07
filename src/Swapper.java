public class Swapper {
	Mine[][] mineField = null;

	public Swapper(Mine[][] mineField) {
		// TODO Auto-generated constructor stub
		this.mineField = mineField;
	}

	public boolean checkField(int xPosition, int yPosition, int mineValue) {
		boolean status = false;
		Mine mine = mineField[xPosition][yPosition];
		if (mine.getmineOrClean() == mineValue) {
			status = true;
			mine.setChecked(1);
		}

		return status;
	}

	public int countSurroundingMines(int xPosition, int yPosition) {
		int count = 0;
		int xCourdinates[] = new int[]{xPosition-1,xPosition-1,xPosition-1,xPosition,xPosition,xPosition+1,xPosition+1,xPosition+1};
		int yCourdinates[] =  new int[]{yPosition-1,yPosition,yPosition+1,yPosition-1,yPosition+1,yPosition-1,yPosition,yPosition+1};
		for (int i = 0; i < xCourdinates.length; i++) {
			//if(mineFiel)
			
		}
		
		return count;

	}

}
