// Subsequence in a String

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        subsequence("", "abc");
        System.out.println(subseque("", "abc"));
    }

    static void subsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequence(ch + p, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subseque(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseque(ch + p, up.substring(1));
        ArrayList<String> second = subseque(p, up.substring(1));

        first.addAll(second);
        return first;
    }
}
