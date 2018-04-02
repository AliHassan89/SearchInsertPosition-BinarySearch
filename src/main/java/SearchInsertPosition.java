/**

 Given a sorted array and a target value, return the index if the target is found. If not, return
 the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Example 1:

 Input: [1,3,5,6], 5
 Output: 2
 Example 2:

 Input: [1,3,5,6], 2
 Output: 1
 Example 3:

 Input: [1,3,5,6], 7
 Output: 4
 Example 1:

 Input: [1,3,5,6], 0
 Output: 0

 */
package main.java;

public class SearchInsertPosition {
  public int searchInsert(int[] nums, int target) {
    if (nums.length == 0)
      return 0;

    int index = binarySearch(nums, target);
    if (nums[index] < target)
      return ++index;

    return index;
  }

  private int binarySearch(int[] nums, int target){
    int mid = nums.length / 2;
    if (nums[mid] == target)
      return mid;

    int p1 = 0;
    int p2 = nums.length - 1;

    while (p1 <= p2){
      mid = (p1 + p2) / 2;
      if (nums[mid] == target)
        return mid;
      if (nums[mid] < target)
        p1 = mid + 1;
      else
        p2 = mid - 1;
    }

    return mid;
  }
}
