import java.util.ArrayList;
import java.util.List;

public class MazeTargetCount {

    static  int getCount(int row, int col, int endRow, int endCol){
        // Termination Case
        if(row == endRow && col == endCol){
            return 1;
        }

        if(row>endRow || col>endCol){
            return 0;
        }

        // right move // down move
        // int answer = getCount(row, col+1, endRow, endCol) +  getCount(row+1, col, endRow, endCol);
        int first = getCount(row, col+1, endRow, endCol);
        int second = getCount(row+1, col, endRow, endCol);
        int answer = first + second;
        return answer;

    }
    public static void main(String[] args) {
        int endRow = 3;
        int endCol = 3;
        int startRow = 0;
        int startCol = 0;

        // ArrayList<String> ans = new ArrayList<>();
        // List<String> ans = new List<>();

        int count = getCount(startRow, startCol, endRow-1, endCol-1);
        System.out.println(count);

    }
}