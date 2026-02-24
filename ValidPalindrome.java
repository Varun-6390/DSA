// https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {
    public static void main(String[] args) {
        String st = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(st));
    }
     static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        if(s.length() == 0 || s == null)
        {
            return true;
        }
        for(int i = 0; i < s.length() / 2; i++)
        { 
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);

            if(start != end)
            {
                return false;
            }
        }
        return true;
        
    }
}
