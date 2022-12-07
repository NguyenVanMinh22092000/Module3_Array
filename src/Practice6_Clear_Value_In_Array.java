import java.util.Scanner;
import java.util.*;

public class Practice6_Clear_Value_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] newArr = {1, 3, 5, 6, 14, 5, 3, 2};
        System.out.println("Enter the value you want to clear in the array");
        int choice = sc.nextInt();
        System.out.println("The new array is " + Arrays.toString(clear(newArr, choice)));
    }
    public static int[] clear(int[] ar, int n){
        if ( n < ar.length){
            for ( int i = n; i < ar.length; i++){
                if(i < ar.length - 1){
                    ar[i] = ar[i + 1];
                } else {
                    ar[i] = 0;
                }
            }
        }
        System.out.println("ngan");
        return ar;
    }
}

