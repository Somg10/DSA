// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int ar[]=new int[n+1];
      
        for(int i=0;i<n;i++){
            int a=arr[i];
            ar[a]=ar[a]+1;
        }
        int br[]=new int[2];
        int c=0,d=0;
        for(int i=1;i<=n;i++){
            if(ar[i]==0)
            c=i;
            else if(ar[i]==2)
            d=i;
        }
        br[0]=d;
        br[1]=c;
        return br;
    }
}
