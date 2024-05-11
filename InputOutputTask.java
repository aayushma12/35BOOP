import java.util.Scanner;
public class InputOutputTask{
    public static void main(String[] args) {
        Scanner scan1= new Scanner(System.in);
        System.out.println("What is your name?");
        String name =scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status = scan1.nextBoolean();
        System.out.println("How many siblings?");
        int sibling = scan1.nextInt();
        System.out.println("Hello" + name);
        System.out.println("Over 18?" + status);
        System.out.println("You have "+ sibling +"no siblings");
        scan1.close();
    }
}
