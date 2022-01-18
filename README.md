# mountain_arrray
Given an array of integers arr, return true if and only if it is a valid mountain array.  Recall that arr is a mountain array if and only if:  arr.length >= 3 There exists some i with 0 &lt; i &lt; arr.length - 1 such that: arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i] arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
<br>

Example 1:

Input: arr = [2,1]
Output: false
<br>
Example 2:

Input: arr = [3,5,5]
Output: false
<br>
Example 3:

Input: arr = [0,3,2,1]
Output: true
 
<br>
Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
