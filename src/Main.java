import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age:");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your name:");
        firstName = scanner.nextLine();
        System.out.println("Please enter your favourite food");
        favouriteFood = scanner.nextLine();
        System.out.println("First name:"+firstName+"\n\nAge:"+age+"\n\nFavourite food:"+favouriteFood);








    }

}