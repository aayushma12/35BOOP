public class OperatorClass {
    public static void main(String[] args) {
        /*Arithematic Operators */
        int aNum1=10 , aNum2=20;
        int sum = aNum1 + aNum2 ;
        System.out.println("Addition is " + sum);
        System.out.println(" Substraction is " +(aNum1-aNum2));
        System.out.println("Multiplication is " +(aNum1*aNum2));
        System.out.println("Division is" + (aNum1/aNum2));
        System.out.println("Module is " + aNum1 % aNum2);
        /*Assignment Operator */
        int asNum1=20; //= is used to assign a value to variable
        asNum1+=1; //same as asNum1 =asNum + 1;
        System.out.println("+= value is " + asNum1);
        System.out.println("-= value is" + (asNum1-=10));
        System.out.println("*= value is" +(asNum1 *=10));
        System.out.println("/=value is" + (asNum1/=2));
        System.out.println("%=value is" +(asNum1%=3));
        /*Relational Operator */
        int rNum1 =20, rNum2 =21;
        boolean rExpression = rNum1== rNum2 ; // return true/false
        System.out.println("Equal to"+rExpression);
        System.out.println("Greater than "+ (rNum1 > rNum2));
        System.out.println("Less than" + (rNum1<rNum2));
        System.out.println("Not equals to" + (rNum1!=rNum2));
        System.out.println("Greater than euals to" + (rNum1>=rNum2));
        /*Logical Operator */
        int lNum1 =20, lNum2=20;
        boolean lExpression1 =lNum1 == lNum2;
        boolean lExpression2 = lNum2> lNum2;
        System.out.println("&& is used for AND" + ( lExpression1 && lExpression2));
        System.out.println("|| is used for OR" + (lExpression1 || lExpression2));
        System.out.println("! is used for NOT" + (!lExpression1));
        /*Unary Operator */
        int uNum1= 10;
        uNum1++; // uNum1 = uNum1 + 1; // changes value in next line
        ++uNum1; // changes value in this same line
        System.out.println("--uNum1 unary" + --uNum1);
        System.out.println("uNum1-- unary is "+ uNum1--);
        /*Ternary Operator */
        int tNum1 =20, tNum2=10;
        String output;
        /* take following if else as example 
         * if(tNum1> tNum2){
         * }else{
         * output="False Statement";
         * }
        */
        output= tNum1> tNum2 ? "True Statement" : "False Statement";
        /* Here ternary operator contains expression
         * if expression is true it returns after the "?"
         * if the expression is false it returns after the ":"
         */
        int intOutput = tNum2 == tNum1 ? -10 :10;
        System.out.println(output);
        System.out.println(intOutput);

    }
    
}
