import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number%3 ==0 && number%5 ==0){
            System.out.println("fizzbuzz");
        }
        
        else if (number%5 == 0)
        System.out.println("buzz");

        else if (number%3 == 0)
        System.out.println("fizz");

        else if ( number%2==0)
        System.out.println(number);

        else
        System.out.println("number is not divisible by 2,3 and 5");

        scanner.close();
    }
   
}
