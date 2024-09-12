package com.interview.attended;
//[2,3,2,3,4,1,5,1] each number how many times got repeated can you write the logic
public class RepeatedNumber {
	public static void main(String[] args) {
		int counter[] = new int[256];
		int count ;
		
		int[] input = {2,3,2,3,4,1,5,1};
		int len = input.length;
		
		for(int i = 0; i < len; i++) {
			counter[i] = input[i];
		}
		
		int[] out = new int[len];
		for(int i = 0; i < len; i++) {
			for(int j =0; j< i; j++) {
				if(counter[j] == input[i]) {
					out[i] = input[i];
					count = countOccurrences(input, len, out[i]);
					System.out.println(out[i] + "-- " + count);
				}
			}
		}
	}
	    static int countOccurrences(int arr[], int n, int x)
	    {
	        int res = 0;
	        for (int i=0; i<n; i++)
	            if (x == arr[i])
	              res++;
	        return res;
	    }

}
