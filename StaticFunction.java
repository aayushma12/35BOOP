public class StaticFunction {
    public static int multiply(int a , int b){
        int mul= a*b;
        return mul;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu == 2){
            return "Water";
        }
        if(menu==3){
            return "Frooti";
        }
        return"Invalid Menu";
    }
    
    /*Task 1
     * creste a function checkEligible 
     * task 2 parameter , String name , int age
     * returns String
     * if age is less than 0 , more than 2200 return "Hello name, Invalis age"
     * is age is less than 18, return"Sorry name , You are not eligible"
     * else return "Congralatulation name,You are eligible"
     */

    /*Task 2
     * create a function makeSquare that takes double
     * return double of square value
     */
    public static void main(String[] args) {
        /* if the function is static and in same class 
         * no need to make object simply call */
        int multiplyReturn = multiply(10,2);
        System.out.println("Result is "+ multiplyReturn);
        String iGet = vendingMachine(1);
        System.out.println("I get" + iGet);
    }
}