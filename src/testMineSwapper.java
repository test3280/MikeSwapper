import java.util.Scanner;

public class testMineSwapper {
	public static void main(String[] args) {
		testMineSwapper tMSW = new testMineSwapper();
		int[][] mineF = new int[][] { { 0, 1, 0 }, { 1, 0, 1 }, { 1, 1, 1 } };
		Mine[][] mineField = tMSW.createMineField(mineF);
		Swapper swapper = new Swapper(mineField);

		tMSW.playSwapper(mineField, swapper);

	}

	public Mine[][] createMineField(int[][] mineF) {
		int row = mineF.length;
		int col = mineF[0].length;
		Mine tMine = null;
		Mine[][] mineField = new Mine[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				tMine = new Mine();
				tMine.setmineOrClean(mineF[i][j]);
				mineField[i][j] = tMine;

			}
		}
		return mineField;

	}

	public void printMineField(Mine[][] mineField) {
		System.out.println("************************************************");
		for (int i = 0; i < mineField.length; i++) {
			for (int j = 0; j < mineField[0].length; j++) {
				if (mineField[i][j].getChecked() == 0) {
					System.out.print(" O ");
				} else {
					System.out.print(mineField[i][j]);
				}
			}
			System.out.println();

		}

		System.out.println("************************************************");
	}

	public void playSwapper(Mine[][] mineField, Swapper swapper) {
		Scanner scanInput = new Scanner(System.in);
		scanInput.useDelimiter("\\s");

		int xPosition = -1;
		int yPosition = -1;
		int mineValue = -1;
		System.out
				.println("Enter the position int the format : --> X Y mineValue");
		System.out.println("Exit : -1");
		String inputLine = scanInput.nextLine();
		do {

			String[] inputValue = inputLine.split("\\s");
			xPosition = Integer.parseInt(inputValue[0]);
			yPosition = Integer.parseInt(inputValue[1]);
			mineValue = Integer.parseInt(inputValue[2]);

			if (swapper.checkField(xPosition, yPosition, mineValue)) {
				printMineField(mineField);
			} else {
				System.out.println(" !!!Game Over !!!");
				printMineField(mineField);
				return;
			}
			System.out
					.println("Enter the position int the format : --> X Y mineValue");
			System.out.println("Exit : exit");

		} while (!((inputLine = scanInput.nextLine()).equals("exit")));

	}
}
