package com.ari.test.java.practice.hackerrank;

public class QueenAttackSolution {
	// Complete the queensAttack function below.
	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		int res = 0;
		int[][] board = new int[n][n];
		int r_q_i = r_q - 1;
		int c_q_i = c_q - 1;

		board[r_q_i][c_q_i] = 1;
		for (int[] row : obstacles) {
			board[row[0] - 1][row[1] - 1] = -1;
		}

		printBoard(board);

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int temp = board[i][j];
				if (temp == 0) {
					if (i == r_q_i) {
						board[i][j] = 2;
						res++;
					}
					if (j == c_q_i) {
						board[i][j] = 2;
						res++;
					}

				}
			}
		}

		printBoard(board);

		return res;
	}

	private static boolean isDiagonal(int[][] board, int r_q_i, int c_q_j, int r_i, int c_j) {
		boolean res = false;
		for (int i = 0; i < board.length; i++) {
			// for (int j = 0; j < board.length; j++) {
			if (r_i == r_q_i + i && c_j == c_q_j + i) {
				res = true;
				break;
			}
			if (r_i == r_q_i + i && c_j == c_q_j - i) {
				res = true;
				break;
			}
			if (r_i == r_q_i - i && c_j == c_q_j - i) {
				res = true;
				break;
			}
			if (r_i == r_q_i - i && c_j == c_q_j + i) {
				res = true;
				break;
			}
			// }
		}

		return res;
	}

	private static void printBoard(int[][] board) {
		System.out.println("**********************");
		for (int[] row : board) {
			for (int val : row) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}
		System.out.println("**********************");
	}

	public static void main(String[] args) {

		String[] nk = "5 3".split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		String[] r_qC_q = "4 3".split(" ");
		int r_q = Integer.parseInt(r_qC_q[0]);
		int c_q = Integer.parseInt(r_qC_q[1]);

		int[][] obstacles = { { 5, 5 }, { 4, 2 }, { 2, 3 } };

		int result = queensAttack(n, k, r_q, c_q, obstacles);
		System.out.println(result);
	}
}
