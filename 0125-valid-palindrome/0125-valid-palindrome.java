class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sd=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                sd.append(s.charAt(i));
            }
        }
        int st=0;
        int end=sd.length()-1;
        while(st<end)
        {
            if(sd.charAt(st)!=sd.charAt(end))
            {
                return false;
            }
            st++;
            end--;
        }
        return true;

    }
}