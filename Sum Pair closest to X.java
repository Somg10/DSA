/ { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here
        int [] result= new int[2];
        int i=0;
        int j=arr.length-1;
        int mindiff=Integer.MAX_VALUE;
        while(i<j){
            int sum=arr[i] + arr[j];
            if(Math.abs(x-sum) < mindiff){
                mindiff=Math.abs(x-sum);
                result[0]=arr[i];
                result[1]=arr[j];
            }
            if(sum==x){
                result[0]=arr[i];
                result[1]=arr[j];
                return result;
            }
            if(sum>x){
                j--;
            }
            else{
                i++;
            }


        }
    return result; 
         
    }
}
