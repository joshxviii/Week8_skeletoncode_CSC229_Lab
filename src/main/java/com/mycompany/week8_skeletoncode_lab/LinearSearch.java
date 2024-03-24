/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int linearSearch(int a[], int x) {
        int n = a.length;
        for(int i=0;i<n;i++) if (a[i]==x) return i;   // return the index where the value is found at.
        return -1;                                    // reutrn -1 if key value does not exsist.
    }
    

    public static void main(String[] args) {

        int key = 2; // value to search for in the array.
        int[] list = {4,3,5,7,8,1,9,10,25,2}; // array of intergers.

        int resultIndex = linearSearch(list, key); // assign return value to 'resultIndex'.

        // Print out results.
        if (resultIndex==-1) System.out.println(key + " is not in the Array.");
        else System.out.println(key + " is at index " + resultIndex + " in the array.");
    }

    /*
     * The time complextity of 'linearSearch' is O(n)
     * 
     * As the input becomes larger and larger the time it takes also becomes longer in a linear fashion.
     * 
     */
}
