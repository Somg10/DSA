// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        int a = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                a++;
            }
        }
        int brr[] = new int[a];
        int k = 0;
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                brr[k] = arr[j];
                k++;
            }
        }
        int b = n-a;
        int m = 0;
        int crr[] = new int[b];
        for(int l=0;l<n;l++){
            if(arr[l]>=0){
                crr[m] = arr[l];
                m++;
            }
        }
        int q = 0;
        int e = 0;
        int f = 0;
        int p = 0;
        while(n!=0){
            if(b!=0){
                arr[p] = crr[e];
                e++;
                p++;
                b--;
                n--;
            } 
            if(n==0){
                break;
            }
            if(a!=0){
                arr[p] = brr[f];
                p++;
                f++;
                n--;
                a--;
            }
        }
    }
}
