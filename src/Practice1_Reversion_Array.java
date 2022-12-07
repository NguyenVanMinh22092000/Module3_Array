import java.util.Scanner;

public class Practice1_Reversion_Array {
    public static void main(String[] args) {
        int [] array1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        array1 = new int[size];
        for ( int i = 0; i < size; i++){
            System.out.println("Enter the value for the " + (i + 1) + " position");
            array1[i] = sc.nextInt();

        }
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        for(int j = 0; j < size; j++){
            int tempt = array1[j];
            array1[size- 1 - j] = tempt;
        }
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
    }
}
