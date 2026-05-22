package javanotes.leetcode.p0017;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    class Solution {
        private static char[][] board = new char[10][3];

        private static void init(){
            for(int i = 2;i < 10;i++){
                for(int j = 0;j < 3;j++){
                    board[i][j] = (char) ('a' + j + (i-2)*3);
                }
            }
        }
        public List<String> letterCombinations(String digits) {
            init();
            List<String> res = new ArrayList<String>();
            return res;
        }

        public static void main(String[] args) {
            init();
            for(int i = 2;i < 10;i++){
                for(int j = 0;j < 3;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }
    }
}
