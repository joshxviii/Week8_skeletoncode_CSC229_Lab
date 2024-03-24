/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int key = 31; // value to search for in the array.
        int[] sortedList = {1,7,12,14,23,27,31,46,56,58,63,75,79,80}; // sorted array of intergers.

        int resultIndex = runBinarySearchIteratively(sortedList,key,0,sortedList.length - 1); // assign return value to 'resultIndex'

        // Print out results.
        if (resultIndex==Integer.MAX_VALUE) System.out.println(key + " is not in the Array.");
        else System.out.println(key + " is at index " + resultIndex + " in the array.");
    }

    /*
     * The time complexity of 'runBinarySearchIteratively' is O(logn).
     * 
     * the space analysis is O(1).
     * 
     */

}
