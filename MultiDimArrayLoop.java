public class MultiDimArrayLoop {
    public static void main(String[] args) {
        // int[][] twoArray = new int [2][3];
        // twoArray[0][0]=10;
        // twoArray[0][1]=20;
        // twoArray[0][2]=30;
        // twoArray[1][0]=-30;
        // twoArray[1][1]=-20;
        // twoArray[1][2]=-10;
        // /*Viaual
        //  * [
        //  * [10,20,30],   ->0
        //  * [-30,-20,-10] ->1
        //  * ]
        //  * Loop multi dim array with nested loop
        //  * Outer selects the array, inner selects the actual value inside
        //  * 
        //  */
        // int outerLength =twoArray.length;
        // for(int outer =0;outer< outerLength;outer ++){
        //     //twoArray[outer]-> iterate each array
        //     int innerLength =twoArray[outer].length;
        //     for(int inner =0;inner<innerLength;inner++){
        //         System.out.println(twoArray[outer][inner]);
        //     }

        // }

        /*Task
         * Make a following Array name
         * [
         * [Aayushma,Ayush,Aayu]
         * [Pratima,Pabitra,Prakriti]
         * [Ram,Sita,Gita]
         * ]
         * Print all the names
         * Also, Find on which array is Aayushma in
         *
         */
        String[][]names=new String[2][3];
        names[0][0]="Aayushma";
        names[0][1]="Ayush";
        names[0][2]="Aayu";
        names[1][0]="Pratima";
        names[1][1]="Pabitra";
        names[1][2]="Prakriti";
        names[2][0]="Ram";
        names[2][1]="Sita";
        names[2][2]="Gita";

        // int outerLength=names.length;
        // for(int outer=0;outerLength;outer++){
        //     int innerLength =names[outer].length;
        //     fo
        // }
    

    }
    
}
