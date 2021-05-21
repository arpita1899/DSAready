/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Approach-: Use three pointers so it will be a one-pass algorithm without using extra space
*/

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
           else if(nums[mid]==1){
                mid++;
            }
            else{
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }

        }
        
    }
}
