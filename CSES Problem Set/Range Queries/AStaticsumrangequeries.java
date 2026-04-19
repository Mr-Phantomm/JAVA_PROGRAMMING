import java.io.*;
import java.util.*;

public class AStaticsumrangequeries {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int queries = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];

        st = new StringTokenizer(br.readLine());
        arr[0] = Long.parseLong(st.nextToken());

        for (int i = 1; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken()) + arr[i - 1];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < queries; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if (left == 1)
                sb.append(arr[right - 1]).append("\n");
            else
                sb.append(arr[right - 1] - arr[left - 2]).append("\n");
        }

        System.out.print(sb);
    }
}