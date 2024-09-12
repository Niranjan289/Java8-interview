package com.niru.interview;

public class ZeroPositionNotChangeRestAllReverseOrder {
    public static void main(String[] args) {
        //56078901203 output: 3201980765
        String str = "5607890123";
        String rvs = "";

        for(int i = str.length() - 1; i>=0;i--) {
            int comp = str.length() - i - 1;

            if(str.charAt(comp) == '0'){
                rvs +='0';
                rvs += String.valueOf(str.charAt(i));
            } else if (str.charAt(i) == '0'){
            } else {
                rvs += str.charAt(i);
            }
        }
        System.out.println(rvs);
    }
}
