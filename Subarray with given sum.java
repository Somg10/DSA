/ { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int sum = arr[0];
        int st = 0;
       // int[] res = new int[2];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            while(sum>s && st<i-1){
                sum = sum - arr[st];
                st++;
            }
            if(sum==s){
                res.add(st+1);
                res.add(i);
                return res;
            }
            if(i<n){
                sum = sum+arr[i];
            }
        }
        res.add(-1);
        return res;
    }
}
