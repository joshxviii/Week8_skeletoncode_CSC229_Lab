/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static int[] bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner+1]) {
                    temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner + 1] = temp;
                }
            }
        }
        return a;
    }
    
    public static void main(String[] args) {

        int[] unsortedList = {5,1,7,2,9,21,6,13,34,15,87,10}; // unsorted array of intergers.
        
        int[] sortedList = bubbleSort(unsortedList, unsortedList.length); // assign 'sortedList to the return value of 'bubbleSort'.'

        for (int i : sortedList){ // display each integer in the array.
            System.out.print(i+" ");
        }

        /*
         * The time complexity of 'bubbleSort' is O(n^2).
         */
    }
    
}
