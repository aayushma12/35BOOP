public class IfElseClass {
    public static void main(String[] args){
        /* If statement */
        if(true){
            System.out.println("True Statement"); 

        }
        /*If takes boolean expression inside() */
        int num1 = 10, num2= 20;
        if(num1==num2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        /*Note that else is optional */
        /*If else  if */
        if (num1 == num2){
            System.out.println("Equal");
        }else if (num1 <num2){
            System.out.println("Lesser");
        }else{
            System.out.println("Greater");
        }
        /*Note that else should be at the last */
        /*If else if ladder */
        if (num1 > num2){
            System.out.println("Greater");
        }else if (num1 != num2){
            System.out.println("Not Equal");
        }else if (num1==num2){
            System.out.println("Equal");
        }else{
            System.out.println("Default Statement");
        }
        /*Nested if statement */
        if (num1<0){
            if (num1>num2){
                System.out.println("Negative and greater");
            }else{
                System.out.println("Negativa and lesser");
            }
        }else{
            if (num1 > num2){
                System.out.println("Positive and Greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }

        /*Task
         * Consider the following marking
         * calculate the total and avg in a variable
         * if any of the marketing is less than 35, print fail
         * if avg is less than 60, print third div
         * if avg is less than 70 , print second div
         * if avg is less than 80, print first div
         * if avg is equal or greater than 80, print distinction
         * if avg is leaa than 0 or more than 100, print invalid
         * 
         */
        int science =0, english =0, math=0;
        int sum=(science+english+math);
        System.out.println(sum);
        int avg=sum/3;
        System.out.println(avg);
        if(avg<35){
            System.out.println("Fail");
        }else if (avg<60){
            System.out.println("Third Division");

        }else if (avg < 70){
            System.out.println("Second Division");

        }  else if(avg<80){
            System.out.println("First Division");
        } else if(avg >=80 && avg <100 ){
            System.out.println("Distinction");
        }else{
            System.out.println("Invalid");
        }
    }
    
} 
