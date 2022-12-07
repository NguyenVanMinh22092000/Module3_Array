import java.util.Scanner;

public class Practice2_Find_Student {
    public static void main(String[] args) {
        String [] students = { "Minh", "Duyen", "Phuong", "Hoa Mai", "Tu Linh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the name you want to find");
        String name = sc.nextLine();
        boolean check = true;
        for( int i = 0; i < students.length; i++){
            if(students[i].equals(name)){
                System.out.println("the position of your name is " + (i + 1));
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Your name does not exist in the file");
        }
    }
}
