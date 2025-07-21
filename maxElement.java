import java.util.*;

public class maxElement{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("INPUT THE ELEMENTS: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                 max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        

    }
}

