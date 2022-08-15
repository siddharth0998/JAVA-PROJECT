// code won't work here
// Input:
// n = 5
// nums[] = {10, 3, 5, 6, 2}
// Output:
// 180 600 360 300 900
// Explanation: 
// For i=0, P[i] = 3*5*6*2 = 180.
// For i=1, P[i] = 10*5*6*2 = 600.
// For i=2, P[i] = 10*3*6*2 = 360.
// For i=3, P[i] = 10*3*5*2 = 300.
// For i=4, P[i] = 10*3*5*6 = 900.

public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
	   long [] array = new long[n]; 
	   long [] array2 = new long[n];
	   long [] ans = new long[n];
	   array[0] = 1;
	   array2[n-1] = 1;
	   long left = 0;
	   long right = n-1;
	   
	   for(int i = 1; i < n; i++){
	       array[i] = array[i-1]*nums[i-1];
	   }
	   for(int i = n-2; i >=0; i--){
	       array2[i] = array2[i+1]*nums[i+1];
	   }
	   for(int i = 0; i < n; i++){
	       ans[i] = array[i]*array2[i];
	   }
	   return ans;
}
