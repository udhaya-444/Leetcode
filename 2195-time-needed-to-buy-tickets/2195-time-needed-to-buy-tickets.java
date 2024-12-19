class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int mimi=0,max=0;
       int value=tickets[k];
     for(int i=0;i<tickets.length;i++)
     {       
           if(i<=k)
           {
             max=value;
           }  
           else
           {
            max=value-1;
           }
           if(tickets[i]>max)
           {
            mimi+=max;
           }
           else
           {
            mimi+=tickets[i];
           }
     }
     return mimi;

    }
}