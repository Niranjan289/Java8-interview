package com.interview.attended;

public class SubStringOfString {
	 // Function to print all substring
    public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++)
           for (int j = i+1; j <= n; j++)
            
                // Please refer below article for details
                // of substr in Java
                // https://www.geeksforgeeks.org/java-lang-string-substring-java/
                System.out.print(str.substring(i, j) + " ");
    }
 
    public static void main(String[] args)
    {
        String str = "abcd";
        SubString(str, str.length());
    }
}



class GFG {
    public static void printSubstrings(String str)
    {
         
        // finding the length of the string
        int n = str.length();
       
        // outermost for loop
        // this is for the selection
        // of starting point
        for (int i = 0; i < n; i++) {
           
            // 2nd for loop is for selection
            // of ending point
            for (int j = i; j < n; j++) {
               
                // 3rd loop is for printing from
                // starting point to ending point
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
               
                // changing the line after printing
                // from starting point to ending point
                System.out.println();
            }
        }
    }
   
    // Driver Code
    public static void main(String[] args)
    {
        String str = "abcd";
 
        // calling method for printing substring
        printSubstrings(str);
    }
}