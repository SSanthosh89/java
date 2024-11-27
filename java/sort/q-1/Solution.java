import java.util.*;

public class Solution {
    public void sortColors(int[] nums) {
        int low = 0;  
        int mid = 0;  
        int high = nums.length - 1;  
        
       
        while (mid <= high) {
            if (nums[mid] == 0) {
                
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                
                mid++;
            } else {
               
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
  
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        Solution solution = new Solution();
        
    
        solution.sortColors(nums);
        
       
        System.out.println( Arrays.toString(nums));
        
        sc.close();
    }
}
