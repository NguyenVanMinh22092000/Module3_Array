import java.util.Scanner;

public class Practice3_Find_Max {
    public static void main(String[] args) {
        int [] numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the size of the array");
        int size = sc.nextInt();
        numbers = new int[size];
        for( int i = 0; i < size - 1; i++){
            System.out.println("Enter the value of the array " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        //Find max
        int max = numbers[0];
        for( int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The greatest number in the array is " + max);
    }
}
