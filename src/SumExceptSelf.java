import java.util.Scanner;

public class SumExceptSelf {
   
        // TODO: Read n
        // TODO: Read array elements
        // TODO: Calculate sum of all elements (Total Sum)
        // TODO: For each element, print (Total Sum - element)
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        // int output[] = new int[n]; this array is unnecessary since we just needs to print the valeu representing the arrays
        int sum = 0;
        // we can calculate the sum in the same loop too, thus reducing the complxity
        for (int i = 0; i < n;i++) {
            nums[i] = sc.nextInt();
            sum+=nums[i];
        }
        for (int j =0; j<n; j++) {
            // output[j]=sum-nums[j];
            System.out.print(sum-nums[j]);
            if(j!=n-1) System.out.print(" ");
        }
        
    }
}
