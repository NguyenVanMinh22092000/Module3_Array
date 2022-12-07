import java.util.Arrays;
import java.util.Scanner;

public class Practice7_Add_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] newArr = {1, 3, 5, 6, 14, 5, 3, 2};
        int [] array2;
        array2 = new int[newArr.length + 1];
        System.out.println("Enter the value you want to add in the array");
        int value = sc.nextInt();
        System.out.println("Which index you want to add?");
        int index = sc.nextInt();
        sc.nextLine();

        for(int i = 0, j = 0; i < array2.length; i++){
            if( i != index){
                array2[i] = newArr[j];
                j++;
            } else {
                array2[i] = value;
            }
        }
        System.out.println(Arrays.toString(array2));

    }

}
