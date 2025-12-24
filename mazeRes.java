// Given a maze of matrix , you have to find all paths to reach from first cell to last. But you only move right and downwards but there will be obstacles in the path

import java.util.ArrayList;

public class mazeRes {
    public static void main(String[] args) {
        boolean maze [][] = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        System.out.println(pathwithobs("", maze, 0, 0));
    }

    static ArrayList<String> pathwithobs(String p, boolean maze[][], int r, int c)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c])
        {
            return list;
        }

        if(r < maze.length - 1)
        {
            list.addAll(pathwithobs(p + 'D', maze, r + 1, c));
        }
        if(c < maze[0].length - 1)
        {
            list.addAll(pathwithobs(p + 'R', maze, r, c + 1));
        }
        return list;
    }
}
