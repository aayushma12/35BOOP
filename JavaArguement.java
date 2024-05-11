public class JavaArguement {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Not enough arguments");
            return;
        }
        System.out.println("The first args is" + args[0]);
        System.out.println("The second args is" + args[1]);

        int normalValue=10;
        int pareInt =Integer.parseInt(args[1]);
        /*Note that the second argument */
    
    
}
}