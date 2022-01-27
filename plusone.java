//https://leetcode.com/problems/plus-one/

class Solution 
{
    public int[] plusOne(int[] d) 
    {
       int len=d.length-1;
        
        for(int i=len;i>=0;i--)
        {
            if(d[i]==9)
            {
                d[i]=0;
            }
            else
            {
                d[i]+=1;
                return d;
            }
        }
        
        if(d[0]==0)
        {
            d = new int[len+2];
        d[0] = 1; 
        }
        return d;
            
    }
}