/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        if (n<2) return 0; // base case if n is less than 2.
        else if (n==2) return 2; // base case if n is 2.

        long sum=2; // initilize the sum as 2 since it is the smallest prime number.
        out:for(int i=3;i<=n;i+=2) { // a loop that goes through every odd number from 3 to n
            for (int j=2;j<=Math.sqrt(i);j++) if (i%j==0) continue out; // another loop that checks if any odd number from 3 to n is evenly divisible by 2 to it's square root. If it is than that means it's a prime number and that it shouldn't be added to the sum. go back to first loop.
            sum += i; // if the inner loop does not find a number that evenly divides than the number is prime and it is to be added to the sum.
        }
        return sum;
    }
 
    
    public static void main(String[] args) {
        int num = 80; // sample number.
        System.out.println("The sum of Prime numbers from 1 to " + num + " is " + getSumOfPrimes(num) + "." ); // print out result.
    }

    /*
     * The time complextity of 'getSumOfPrimes' is O(n^2).
     * 
     * The space analysis is O(1).
     */

}
