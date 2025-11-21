import java.util.Scanner;

public class Lab1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows and Cols : "); 
        
        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] map = new char[R][C];

        System.out.println("Enter Map Data (use * or .): ");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.next().charAt(0);
            }
        }

        System.out.print("Enter Target Row and Col: ");

        int targetR = sc.nextInt();
        int targetC = sc.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Result: Mine");
        } 
        else {
            int mineCount = 0;

            for (int row = targetR - 1; row <= targetR + 1; row++) {
                for (int col = targetC - 1; col <= targetC + 1; col++) {
                    
                    if (row >= 0 && row < R && col >= 0 && col < C) {
                        
                        if (row == targetR && col == targetC) {
                            continue;
                        }

                        if (map[row][col] == '*') {
                            mineCount++;
                        }
                    }
                }
            }
            System.out.println("Result: " + mineCount);
        }
        
        sc.close();
    }
}