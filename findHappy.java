// https://leetcode.com/problems/happy-number/

public class findHappy {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;

        do {
            f = findSquare(findSquare(f));
            s = findSquare(s);
        } while (s != f);

        if(s ==1){
            return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans = 0;
        while(num > 0)
        {
            int rem = num % 10;
            ans += rem * rem;
            num = num/10;
        }
        return ans;
          
    }
}
