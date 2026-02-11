import java.util.*;

public class Main {


    void desiredPermutations(String str, char ch, int pos, int l, int r, ArrayList<String> ans) {
        
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // ------------------ TEST CASES ------------------

        String[] testStrings = {"abc", "abcd", "aab"};
        char[] testChars = { 'a', 'b', 'a' };
        int[] testPositions = { 1, 2, 0 };

        for (int t = 0; t < testStrings.length; t++) {
            String str = testStrings[t];
            char ch = testChars[t];
            int pos = testPositions[t];

            ArrayList<String> ans = new ArrayList<>();
            obj.desiredPermutations(str, ch, pos, 0, str.length() - 1, ans);
            Collections.sort(ans);

            System.out.println("\nTest Case " + (t+1) + ": ");
            System.out.println("String = " + str + ", Block char = " + ch + ", Position = " + pos);
            System.out.println("Valid permutations:");

            for (String s : ans)
                System.out.println(s);
        }
    }
}
