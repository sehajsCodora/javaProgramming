import java.util.Scanner;

public class movezeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int [n]; 
        System.out.println("Enter elements inside the array: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        movezeroes obj = new movezeroes();
        obj.move(nums);
    }
    public void move(int nums[]){
        int n = nums.length;
        int L = 0;
        int R = 1;
        for (int i = 0; i < nums.length; i++) {
            while(R<n){
                if(nums[L]!=0){
                    L++;
                    R++;
                }else if(nums[R]==0){
                    R++;
                }else{
                    int temp = nums[L];
                    nums[L] = nums[R];
                    nums[R] = temp;
                    L++;
                    R++;
                }
            }   
        }
        for(int num: nums){
            System.out.print(num+" ");
        }
        
    }
}
