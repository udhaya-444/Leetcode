class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[]=new int[2];
        for(int std:students)
        {
            count[std]++;
    }
    int remain=sandwiches.length;
    for(int sand:sandwiches)
    {
        if(count[sand]==0 )
        {
            break;
        }
        if(remain--==0)
        {
            break;
        }
        count[sand]--;
    }
    return remain;
        }

}