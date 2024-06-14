import java.util.ArrayList;

public class ArrayClass {
    public static void main(String[] args) {
//         /*Array declaration */
//         int[] myfirstArray;
//         /*Memory alloc  */
//         myfirstArray=new int[5];
//         /*Array Declaration and memory alloc */
//         int[] mySecondArray = new int[3];
//         /*Array declaration,memory alloc and initization */
//         int[] myThirdArray ={10,20,30,40};
//         //Array  index-> position of the element/values
//         //starts with zero
//         mySecondArray[0]=10;
//         mySecondArray[1]=20;
//         mySecondArray[2]=100;
//         //Access/Store in new variable
//         int arrayElement =mySecondArray[0];
//         System.out.println("First index"+ arrayElement);
//         System.out.println("Second index"+ mySecondArray[1]);

        /*Task 1
         * make the following array named animals
         * []"Cat ,"dog","Tiger","Snake"]
         * print "Snake"
         */

      
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Snake");

        System.out.println(animals.get(3)); // This will print "Snake"
    }
}
