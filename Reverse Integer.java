class Solution {
    public int reverse(int x) {
        
        
        double mn = 1, ost = 0;
        int count = 0;
        while (x != 0) {
            ost = ost + x % 10 * mn;
            x = (int)((x - x % 10) / 10);
            
            System.out.println(ost+ " " + x);
            
            mn = mn / 10;
            count++;
        }
        
        for (int i = 1; i < count; i++)
            ost = ost * 10;
        System.out.println(Math.round(ost) );
        
        if (ost <= 2147483647 && ost >= -2147483648)
            return (int)Math.round(ost);
        else
            return 0;
        
    }
}