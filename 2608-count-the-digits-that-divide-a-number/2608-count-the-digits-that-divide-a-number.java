class Solution {
    public int countDigits(int num) {
        int ans=0;
        int n=num;
        while(num>0)
        {
            int rem=num%10;
            num/=10;
            if(n%rem==0)
            ans++;
        }
        return ans;
    }
}