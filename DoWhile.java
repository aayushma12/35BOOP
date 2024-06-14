import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        /*Check the same condition in while and do while for difference */
        int counter = 0;
        while(counter<0){
            System.out.println("TYhe condition is false , it wont run");

        }
        do{
            System.out.println("This runs first then check the condition");
        }while(counter <0);
        /*Do while run at least once,even if the condition is false */

        /*Task
         * Prompt user to enter a number run loop and ask user the integer until the integer is negative*/
        Scanner scan = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter a negative number");
            input=scan.nextInt();
        }while(input>0);
        System.out.println("Negative number"+ input);
        scan.close();






    }
    
}
