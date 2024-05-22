public class ArrayLoop {
    public static void main(String[] args) {
        // int[] arr =new int[4];
        // arr[0]=-10;
        // arr[1]=0;
        // arr[2]=10;
        // arr[3]=20;
        

        // /*we need length of array first , use.length */
        // int arrayLength = arr.length;
        // /*Loop from 0-(arrayLength-1),0-3 */
        // for(int index=0;index<arrayLength;index++){
        //     System.out.println(arr[index]);
        // }
        // //or,use condition,index<-arrayLength-1
        // System.out.println("Descending loop");
        // for (int index = arrayLength-1;index>=0;index--){
        //     System.out.println(arr[index]);
        // }
        /*Loop the arr using while loop */

        /*Task
         * Make an array of ["John","Doe","Foo","Bar"]
         * Make a string"Foo"
         * Loop the array and find in which index is "Foo" on 
         * print the index
         */
        /*Make a function for the above name arrayFinder
         * Takes array of String and string as parameter
         * return index if 2nd value matches any element of array
         * else return -1
         * print the retutned index value
         */
        String[] name={"John","Doe","Foo","Bar"};
        int i=0;
        while(i<name.length){
            if(name[i]=="Foo");
            System.out.println();
        }

    } 
    
}
