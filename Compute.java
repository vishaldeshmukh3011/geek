//Count of smaller elements 

/*
Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4
*/

class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        int i;
        for(i=0; i<n; i++){
            if(arr[i] > x) break;
        }
        return i;
    }
}
