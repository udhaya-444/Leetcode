class Solution {
    public int secondHighest(String s) {
    TreeSet<Integer> digits=new TreeSet<>(Collections.reverseOrder());
    for(char ch:s.toCharArray())
    {
        if(Character.isDigit(ch))
        {
            digits.add(ch -'0');
        }
    }
    if(digits.size()<2)
    {
        return -1;
    }
    digits.pollFirst();
    return digits.first();
        }
}