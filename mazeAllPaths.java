//Given a maze of matrix , you have to find all paths to reach from first cell to last.You can move in any direction

import java.util.ArrayList;
import java.util.Arrays;

public class mazeAllPaths {
    public static void main(String[] args) {
        boolean maze[][] = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int path[][] = new int[maze.length][maze[0].length];  // Array for printing the path step by step
        System.out.println(allpath("", maze, 0, 0, path, 1));
    }

    static ArrayList<String> allpath(String p, boolean maze[][], int r, int c, int[][] arr, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            for (int[] path : arr) {
                System.out.println(Arrays.toString(path));
            }
            System.out.println();
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (!maze[r][c]) {
            return list;
        }

        maze[r][c] = false;
        arr[r][c] = step;

        if (r < maze.length - 1) {
            list.addAll(allpath(p + 'D', maze, r + 1, c, arr, step + 1));
        }
        if (c < maze[0].length - 1) {
            list.addAll(allpath(p + 'R', maze, r, c + 1, arr, step + 1));
        }
        if (r > 0) {
            list.addAll(allpath(p + 'U', maze, r - 1, c, arr, step + 1));
        }
        if (c > 0) {
            list.addAll(allpath(p + 'L', maze, r, c - 1, arr, step + 1));
        }
        maze[r][c] = true;
        arr[r][c] = 0;
        return list;
    }
}
