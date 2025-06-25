class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
     dp[0]=true;
     for(int i=1;i<=s.length();i++)
     {
        for(String w: wordDict)
        {
            int st=i-w.length();
            if(st>=0 && dp[st] && s.substring(st,i).equals(w))
            {
                dp[i]=true;
                break;
            }
        }

     }
     return dp[s.length()];
    }
}