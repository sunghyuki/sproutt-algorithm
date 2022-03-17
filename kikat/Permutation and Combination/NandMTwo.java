package algorithm;

import java.util.Scanner;

public class NandMTwo {
    public static int[] arr;
    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        arr = new int[m];

        dfs(n, m, 0, 0);

        System.out.println(stringBuilder);
    }

    public static void dfs(int n, int m, int start, int depth) {
        if(depth == m) {
            for(int i : arr) {
                stringBuilder.append(i).append(' ');
            }
            stringBuilder.append('\n');
            return;
        }

        for(int i = start; i < n; i++) {
            arr[depth] = i + 1;
            dfs(n, m, i + 1, depth + 1);
        }
    }
}