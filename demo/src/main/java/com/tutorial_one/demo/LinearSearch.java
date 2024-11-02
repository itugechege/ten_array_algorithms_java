package com.tutorial_one.demo;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }

    public static void main(String[] args) {
        // Create an array of size 200
        int arraySize = 200;
        int[] array = new int[arraySize];

        // Fill the array with values from 0 to 199
        for (int i = 0; i < arraySize; i++) {
            array[i] = i;
        }

        int targetValue = 75; // The value we want to search for
        int resultIndex = linearSearch(array, targetValue);

        if (resultIndex != -1) {
            System.out.println("Value " + targetValue + " found at index " + resultIndex + ".");
        } else {
            System.out.println("Value " + targetValue + " not found in the array.");
        }
    }
}

