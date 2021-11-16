/*
Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”.
Input : arr[ ] = {5, 2, 3, 6, 4, 4, 6, 6}
Output : Yes
Input : arr[ ] = {10, 14, 10, 12, 12, 13, 15} 
Output : No
*/


class Contiguous{
    // Function for finding maximum and value pair
    public static boolean areElementsContiguous (int arr[], int n) {
        Arrays.sort(arr);
        if(n==1) return false;
        if(n==2 && arr[1]-arr[0]>1) return false;
        for(int i=0; i<n-1; i++){
           // System.out.print(arr[i] + " ");
            if(arr[i+1] - arr[i] > 1) return false;
        }
        return true;
    }
}
