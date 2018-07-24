/**
 * 
 */
package com.yxp.array;

/**
 * @author rc390
 *
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }

    /*
     * Complexity Analysis
     * 
     * Time complexity : O(n). Single pass.
     * 
     * Space complexity : O(1). Constant space is used.
     */
    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
