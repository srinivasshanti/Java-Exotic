//Reverse a String

import java.util.*;


public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        String reverse = new StringBuilder(A).reverse().toString(); //string builder
        if (A.equals(reverse))   //equals are used to compare with another variable based on various factor
        {
             System.out.println("Yes");
        }
        else 
        {
             System.out.println("No");
        }
}}



