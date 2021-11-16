/*package whatever //do not write package name here */

// Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).

/*
Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    while(t-->0){
       int n = sc.nextInt();
       int d = sc.nextInt();
       int a[] = new int[n];
       for(int i=0; i<n; i++){
         a[i] = sc.nextInt(); 
       }
       int i=d;
       do {
         System.out.print(a[i]+" ");
         if(i==n-1) i=-1;
         i++;
       } while(i!=d);
       System.out.println();
     }
	}
}
