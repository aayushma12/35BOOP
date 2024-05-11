import java.util.Scanner;
/*
 * or use
 * import java.util
 */


public class InputOutput {
    public static void main(String[] args) {
        /* User output
         * System.out.println("Print next line")
         * "sout" for shortcut
         */
        System.out.println("The string breaks line.");
        /*System.out.print */
        System.out.print("This will not break line.");
        System.out.print("This will continue");
        /*System.out.printf
         * String formatter
         * %s string ,%d Integral ,%f Floating Point , %b Boolean
        */
        System.out.printf("Hello %s, Nice" ,"world");
        System.out.printf("This is num %d " ,10);
        /*You can use multiple formatter */
        System.out.printf("Num %f and bool %b",10.3f, false);

        /*User Input */
        Scanner scan = new Scanner(System.in);
        System.out.println("The following takes whole sentence");
        String wholeWString = scan.nextLine();
        System.out.println("This input is"+ wholeWString);
        System.out.println("The following takes integer");
        int intInput=scan.nextInt();
        System.out.println("This input is" + intInput);
        System.out.println("This folloeing takes double");
        double doubleInput = scan.nextDouble();
        System.out.println("This input is"+ doubleInput);
        System.out.println("This following take boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("This input is " + booleanInput);
        scan.close();//close after taking all the input

    }
    
}
