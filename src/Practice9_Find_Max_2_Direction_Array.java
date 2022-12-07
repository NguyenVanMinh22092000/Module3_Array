import java.util.Scanner;

public class Practice9_Find_Max_2_Direction_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] array1;
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the collums");
        int collum = sc.nextInt();
        array1 = new int[row][collum];
        for ( int i = 0; i < row; i++){
            for ( int j = 0; j < collum; j++){
                System.out.println("Enter the value at collum " + (i+ 1) + " row" + (j+ 1));
                array1[i][j] = sc.nextInt();
            }
        }
        int max = array1[0][0];
        for ( int i = 0; i < row; i++){
            for ( int j = 0; j < collum; j++){
                if(max < array1[i][j]){
                    max = array1[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
    }
}
