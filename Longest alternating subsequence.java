/ { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] S = br.readLine().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.AlternatingaMaxLength(nums);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int AlternatingaMaxLength(int[] nums)
    {
        // code here
        if(nums.length==1){
            return 1;
        }
        
        int size = nums.length;
        int m=1;
        int n=1;
        int flag;
        if (nums[1]>=nums[0]){
            flag = 0;
        }
        else{
            flag=1;
        }
        
        for(int i=1;i<size;i++){
            if(nums[i]>nums[i-1]&&flag==0){
                m = n+1;
                flag=1;
            }
            else if(nums[i]<nums[i-1]&&flag==1){
                n = m+1;
                flag=0;
            }
            else{
                continue;
            }
        }
        if(m>n){
            return m;
        }
        else{
        return n ;
        }
    }
}
