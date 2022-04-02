package com.example.fullstack_development.SearchAlgorithm;

public class BinarySearch {

    public static int search(int [] arr, int target){
        int left = 0;
        int right = arr.length;
        int step = 0;
        while(left < right){
            step ++;

            int mid = Math.floorDiv(left + right, 2);
            int midValue = arr[mid];
            System.out.println("Step " + step + ": arr[" + mid + "] = " + midValue);
            if(midValue == target){

                return mid;
            }else if(midValue < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] searchList = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 1;

        System.out.println('-' + 1);
    }
}
