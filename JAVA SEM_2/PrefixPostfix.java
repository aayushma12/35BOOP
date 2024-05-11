public class PrefixPostfix {
    public static void main (String[]args){
        int prefixValue = 10;
        System.out.println("Prefix will update here"+ ++prefixValue);
        System.out.println("It will remain the same" +  prefixValue);
        /*Prefix is when you put oprrator in thr left side of value/var */

        int postFixValue = 20;
        System.out.println("Postfix will not update here" + postFixValue);
        System.out.println("It will update here"+ postFixValue);
        /* Postfix is when you put operator in the right side */
    }
    
}
