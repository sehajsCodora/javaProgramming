
import java.util.Scanner;

public class rotateArray {

    public void rotate(int[] nums, int k){
        int n = nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    public void reverse(int nums[], int start, int end){
        while(start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
        }
      
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        rotateArray obj = new rotateArray();
        obj.rotate(nums, k);
        System.out.println("Output: ");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
    
    
}
