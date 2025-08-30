import javax.print.event.PrintEvent;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintBoard pb = new PrintBoard();
        Evaluater ev = new Evaluater();
        String winner = null;
        String turn = "X";
        String[] board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }
        // shreyash
        System.out.println("Welcome to the 3X3 Tic Tac Toe Game.");
        pb.printBoard(board);
        System.out.println("'X' will start first. And the game continues alternatively :");

        while (winner == null) {
            int inputNum;
            try {
                inputNum = sc.nextInt();
                // checking the number is in a valid range
                if (!(inputNum > 0 && inputNum <= 9)) {
                    System.out.println("Enter a valid slot in the board:");
                    continue;
                }

                if (board[inputNum - 1].equals(String.valueOf(inputNum))) {
                    board[inputNum - 1] = turn;

                    turn = turn.equals("X") ? "O" : "X";
                    pb.printBoard(board);
                    winner = ev.checkWinner(board, turn);
                } else {
                    System.out.println("The slot is already taken. Please Re-enter the slotNumber");
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number to place your position.");
                e.printStackTrace();
                sc.nextLine();
            }

        }
        if (winner.equalsIgnoreCase("DRAW")) {
            System.out.println("It's a Draw.");

        } else {
            System.out.println(winner + " has won the match. Congratulations !!!");
        }
        sc.close();
    }
}
