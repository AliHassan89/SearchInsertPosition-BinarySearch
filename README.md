# SearchInsertPosition-BinarySearch
Given a sorted array and a target value, return the index if the target is found. If not, return  the index where it would be if it were inserted in order.

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

# Solution:

1. int array and target value is passed as argument in the function.

2. Since array is sorted we run a binary search on the array and look for target in the sorted value 

3. If the target is found then the index is returned.

4. In case when target is not found then an index is returned whose value is one less than the value where target is suppose to be. On returning the index the index is incremented and returned.
