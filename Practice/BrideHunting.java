import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrideHunting {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int rows=obj.nextInt();
        int col=obj.nextInt();
        int[][] Matrix=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                Matrix[i][j]=obj.nextInt();
            }
        }
       int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        int bestRow = -1, bestCol = -1;
        int maxQualities = -1;
        int minDistance = Integer.MAX_VALUE;
        boolean polygamy = false;

        List<int[]> bestCandidates = new ArrayList<>();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                // Skip Sam's house (0,0) which is (1,1) in 1-indexed
                if(Matrix[i][j] == 1 && !(i == 0 && j == 0)) {
                    
                    // Count qualities: number of 1's in 8 neighbors
                    int qualities = 0;
                    for(int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if(ni >= 0 && ni < rows && nj >= 0 && nj < col && Matrix[ni][nj] == 1) {
                            qualities++;
                        }
                    }

                    // Distance from Sam (0,0): Chebyshev distance (king moves in chess)
                    int distance = Math.max(i, j);

                    // Now decide if this girl is a contender
                    if(qualities > maxQualities) {
                        // New best quality girl
                        maxQualities = qualities;
                        minDistance = distance;
                        bestRow = i + 1;  // 1-indexed
                        bestCol = j + 1;
                        bestCandidates.clear();
                        bestCandidates.add(new int[]{i+1, j+1});
                        polygamy = false;
                    }
                    else if(qualities == maxQualities) {
                        // Same quality, check distance
                        if(distance < minDistance) {
                            // Closer girl with same qualities
                            minDistance = distance;
                            bestRow = i + 1;
                            bestCol = j + 1;
                            bestCandidates.clear();
                            bestCandidates.add(new int[]{i+1, j+1});
                            polygamy = false;
                        }
                        else if(distance == minDistance) {
                            // Same quality and same distance
                            bestCandidates.add(new int[]{i+1, j+1});
                            if(bestCandidates.size() > 1) {
                                polygamy = true;
                            }
                        }
                    }
                }
            }
        }

        // Final decision
        if(maxQualities == -1) {
            System.out.println("No suitable girl found");
        }
        else if(polygamy || bestCandidates.size() > 1) {
            System.out.println("Polygamy not allowed");
        }
        else {
            System.out.println(bestRow + ":" + bestCol + ":" + maxQualities);
        }

    }
}
