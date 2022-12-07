import java.util.Scanner;

public class Practice4_Exchange_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double s;
        do{
            System.out.println("Change the temperature");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit the the program");
             choice = sc.nextInt();
            System.out.println("MỜI BẠN NHẬP TÊN");
            String name = sc.nextLine();
             sc.nextLine();
             switch (choice){
                 case 1:
                     System.out.println("Enter the C degree");
                     double celsius = sc.nextDouble();
                     System.out.println("The F respective temperature is " + celsiusToFahrenheit(celsius));
                     break;
                 case 2:
                     System.out.println("Enter the F degree");
                     double fahrenheit = sc.nextDouble();
                     System.out.println("The C respective temperature is " + fahrenheitToCelsius(fahrenheit));
                     break;
                 default:
                     System.out.println("Your choice is override");
             }
        } while(choice != 0);
    }
    public static double celsiusToFahrenheit ( double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
