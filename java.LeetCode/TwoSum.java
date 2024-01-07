import java.util.Scanner;

class TwoSum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");

         for(int count = 0; count>990 ; count++)
             {
                int nums[] = sc.nextInt();
                if(nums[count]=="\n")
            {
                break;
            }
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for ( int i = 0 ; i <= nums.length() ; i++) {
            for ( int j = 0 ; j <= nums.length() ; j++) {
                if(nums[i]+nums[j]==target) {
                    return i,j;
                }
            }
        }
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj1 = new Solution()
    }
}