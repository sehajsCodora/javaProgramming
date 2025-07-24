import java.util.*;
public class kadaneAlgo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            System.out.println("Input elements in the array: ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int currentSum = arr[0];
            int maxsum = arr[0];

        for(int i=1; i < arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxsum = Math.max(maxsum, currentSum);
        }
    
    
        System.out.println(maxsum);
    }
}
