import java.util.Scanner;

public class Practice8_Merge_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array1;
        int [] array2;
        int [] array3;
        System.out.println("Enter the size of array 1");
        int size1 = sc.nextInt();
        sc.nextLine();
        array1 = new  int[size1];
        for( int i = 0; i < array1.length; i++){
            System.out.println("Enter the value of the array 1 at the position " + ( i + 1));
            array1[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter the size of array 2");
        int size2 = sc.nextInt();
        sc.nextLine();
        array2 = new  int[size2];
        for( int i = 0; i < array2.length; i++){
            System.out.println("Enter the value of the array 1 at the position " + ( i + 1));
            array2[i] = sc.nextInt();
            sc.nextLine();
        }
        array3 = new int[size1 + size2];
        for( int i  = 0; i < size1; i++){
            array3[i] = array1[i];
        }
        for(int j = size1, i = 0; j < size1 + size2; j++, i++){
            array3[j] = array2[i];
        }
        for ( int i = 0; i < array3.length; i++){
            System.out.print("Array 3 is " + array3[i] + "\t");
        }
    }
}
