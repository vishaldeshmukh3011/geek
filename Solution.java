/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
*/


class Solution{    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        int i = 1;
        int count=0;
        int b[] = new int[n];
        while(count<n){
            if(i>=n) i--;
            b[count] = arr[i];
            if( i%2 != 0 ) i--;
            else i+=3;
            count++;
        }
        for(i=0; i<n;i++) arr[i] = b[i];
    }
    
}
