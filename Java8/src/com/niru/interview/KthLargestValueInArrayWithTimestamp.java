package com.niru.interview;

import java.util.Random;

public class KthLargestValueInArrayWithTimestamp {

        public static int findKthLargest(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
                throw new IllegalArgumentException("Invalid input");
            }

            // We need to find the (nums.length - k)th smallest element
            int targetIndex = nums.length - k;
            return quickSelect(nums, 0, nums.length - 1, targetIndex);
        }

        private static int quickSelect(int[] nums, int left, int right, int targetIndex) {
            Random rand = new Random();

            while (left <= right) {
                if (left == right) {
                    return nums[left];
                }

                int pivotIndex = partition(nums, left, right, rand.nextInt(right - left + 1) + left);

                if (pivotIndex == targetIndex) {
                    return nums[pivotIndex];
                } else if (pivotIndex < targetIndex) {
                    left = pivotIndex + 1;
                } else {
                    right = pivotIndex - 1;
                }
            }

            throw new RuntimeException("Should not reach here");
        }

        private static int partition(int[] nums, int left, int right, int pivotIndex) {
            int pivotValue = nums[pivotIndex];
            swap(nums, pivotIndex, right);  // Move pivot to end
            int storeIndex = left;

            for (int i = left; i < right; i++) {
                if (nums[i] < pivotValue) {
                    swap(nums, storeIndex, i);
                    storeIndex++;
                }
            }

            swap(nums, right, storeIndex);  // Move pivot to its final place
            return storeIndex;
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public static void main(String[] args) {
            int[] nums = {3, 2, 1, 5, 6, 4};
            int k = 2;

            int kthLargest = findKthLargest(nums, k);
            System.out.println("The " + k + "th largest element is: " + kthLargest);  // Output should be 5
        }
}
