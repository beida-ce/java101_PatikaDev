import java.util.Scanner;
import java.util.Random;
public class Minesweeper {
    private final Scanner scan = new Scanner(System.in);
    private final Random random = new Random();
    private int row;
    private int col;
    private String[][] mineField;
    private String[][] revealed;
    public void start() {
        System.out.println("========= WELCOME TO MINESWEEPER ========= ");
        System.out.print("Determine the Number of Rows: ");
        row = scan.nextInt();
        System.out.print("Determine the Number of Columns: ");
        col = scan.nextInt();

        int mineCount = (row * col) / 4;

        mineField = new String[row][col];
        revealed = new String[row][col];

        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField[i].length; j++) {
                mineField[i][j] = "-";
                revealed[i][j] = "-";
            }
        }

        while (mineCount > 0) {
            int i = random.nextInt(row);
            int j = random.nextInt(col);

            if (mineField[i][j].equals("-")) {
                mineField[i][j] = "*";
                mineCount--;
            }
        }
        printRevealed();
        play();
    }

    private void play() {
        boolean finish = false;
        while (!finish) {
            System.out.print("Enter a line: ");
            int seRow = scan.nextInt();
            System.out.print("Enter a column: ");
            int seCol = scan.nextInt();

            int number = 0;

            if (seRow < row && seCol < col) {
                if (mineField[seRow][seCol].equals("-") && revealed[seRow][seCol].equals("-")) {
                    for (int i = seRow - 1; i < seRow + 2; i++) {
                        for (int j = seCol - 1; j < seCol + 2; j++) {
                            if (i >= 0 && j >= 0 && i < row && j < col && mineField[i][j].equals("*")) {
                                number++;
                            }
                            revealed[seRow][seCol] = Integer.toString(number);
                        }
                    }
                    printRevealed();
                    if (checkWin()) {
                            System.out.println("YOU DIDN'T STEP ON ANY MINES!! CONGRATS!!");
                            printMine();
                            finish = true;
                    }
                    } else if (mineField[seRow][seCol].equals("*")) {
                        System.out.println("A MINE !!! Game over!!!");
                        printMine();
                        finish = true;
                    } else if (!revealed[seRow][seCol].equals("-")) {
                        System.out.println("Please select a different frame.This square was chosen earlier.");
                    }
            } else {
                System.out.println("Please do not select from outside the area.\nIncorrect selection.");
            }
        }
    }

    private void printRevealed() {
        System.out.println("---------------------------------");

        for (String[] strings : revealed) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    private void printMine() {
        System.out.println("---------------------------------");
        for (String[] strings : mineField) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    private boolean checkWin() {
        int count = 0;
        int mineNumber = 0;
        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {
                if (revealed[i][j].equals("-")) {
                    count++;
                }
                if (mineField[i][j].equals("*")) {
                    mineNumber++;
                }
            }
        }
        return mineNumber == count;
    }
}