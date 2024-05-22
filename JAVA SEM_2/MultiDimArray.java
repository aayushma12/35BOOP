public class MultiDimArray {
    public static void main(String[] args) {
        /*One D array,one square bracket[] */
        // int[] oneDArray;
        /*Two D array, two square bracket[][] */
        // int[][] twoDArray;
        /*Three D array, three square bracket[][][] */
        // int[][][] threeDArray;

        /*Memory alloc, must give size to each dimension */
        // twoDArray =new int[2][3];
        /*Visual
         * [
         * [0,0,0],->0
         * [0,0,0] ->1
         * ]
         */
        //twoDArray[0] ->access the 0th index array
        // twoDArray[0][0]=10;
        // twoDArray[0][1]=20;
        // twoDArray[1][0]=100;
        // twoDArray[1][2]=200;
        // //access in variable
        // int arrayElement=twoDArray[0][0];
        // System.out.println(arrayElement);
        // System.out.println(twoDArray[0][1]);

        /*Make a following array
         * [
         * [10,-10]
         * [20,-20]
         * [-30,8]
         * [40,45]
         * [50,56]
         * ]
         * Print the value
         * 50,56
         */
        int[] []twodArray;
        twodArray=new int[5][3];
        
        twodArray[0][0]=10;
        twodArray[0][1]=-10;
        twodArray[1][0]=20;
        twodArray[1][1]=-20;
        twodArray[2][0]=-30;
        twodArray[2][1]=8;
        twodArray[3][0]=40;
        twodArray[3][1]=45;
        twodArray[4][0]=50;
        twodArray[4][1]=56;
        System.out.println(twodArray[4][0]);
        System.out.println(twodArray[4][1]);
        





    }
    
}
