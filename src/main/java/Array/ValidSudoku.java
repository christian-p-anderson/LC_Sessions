/*
    Determine if a 9 x 9 Sudoku board is valid. Only filled cells need to be validated according to the following rules:
        1. Each row must contain the digits 1-9 without repetition.
        2. Each column must contain the digits 1-9 without repetition.
        3. Each of the nine 3 x 3 sub-boxes of the grid ust contain the digits 1-9 without repetition.

    Constraints
        board.length == 9
        board[i].length == 9
        board[i][j] is a digit or '.'
*/

package Array;

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        //initialize a list containing 9 hash set at index r will be used to store previously seen numbers in row r of
        //the sudoku. Also initialize lists of 9 hash sets to track the columns and boxes too

        int N = 9;

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] columns = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for (int r = 0; r < N; r++) {
            rows[r] = new HashSet<Character>();
            columns[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        //Iterate over each position [r, c] in the sudoku. At each iteration, if there is a number at the current position
            //Check if the number exists in the hash set for the current row, column, or box. If it does, return
            //false, because this is the second occurrence of the number in the current row, column, or box
            //Otherwise, update the set responsible for tracking previously seen numbers in the current row, column,
            //and box. The index of the current box is (r / 3) * 3 + (c / 3) where / represents floor division

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                //check if the position is filled with a number
                if (val == '.') {
                    continue;
                }

                //check the row
                if (rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);

                //check the column
                if (columns[c].contains(val)) {
                    return false;
                }
                columns[c].add(val);

                //check the box
                int index = (r / 3) * 3 + c / 3;
                if (boxes[index].contains(val)) {
                    return false;
                }
                boxes[index].add(val);

            }
        }

        //if no duplicates were found after every position on the sudoku board has been visited, then the sudoku is
        //valid, so return true

        return true;
    }
}

/*
    Create a hash set for each row, column, and box. With each hash set, you can determine if the current number already
    exists in the corresponding row, column, or box in constant time
 */
