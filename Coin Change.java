 { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int S[], int m, int n) {
        // code here.
       
        long[][] Na = new long[n+1][m+1];
        for(int i=0;i<=m;i++){
            Na[0][i]=1;
        }
        for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               Na[i][j]=Na[i][j-1];
               if(S[j-1]<=i){
                   Na[i][j]+=Na[i-S[j-1]][j];
               }
           } 
        }
        return Na[n][m];
    }
}
