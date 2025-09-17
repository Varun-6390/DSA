// Given an array nums of integers, return how many of them contain an even number of digits.

class Even_Digit{
    public static void main(String[] args) {
        int n = 809;
        int count = 0;
        while(n > 0)
        {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }

}
