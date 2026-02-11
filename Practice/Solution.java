import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'crosswordPuzzle' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY crossword
     *  2. STRING words
     */

    public static void backtrack( List<String> crossword , String[] word , int i , int j , boolean[][] visited , )

    public static List<String> crosswordPuzzle(List<String> crossword, String words) {
    // Write your code here
        String[] word=words.split(";");
        List<String> list=new ArrayList<>();
        
        return list;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Solution2.txt"));

        List<String> crossword = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String crosswordItem = bufferedReader.readLine();
            crossword.add(crosswordItem);
        }

        String words = bufferedReader.readLine();

        List<String> result = Result.crosswordPuzzle(crossword, words);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
