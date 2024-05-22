import java.util.ArrayList;;
public class ArrayListClass {
    public static void main(String[] args) {
        /*import ArrayList from java.util at the top */
        /*Cannot use primitive data type , use wrapper for it*/
        // ArrayList<Integer>arrayList1=new ArrayList<>();
        // /*To add on array List */
        // arrayList1.add(1);
        // arrayList1.add(20);
        // System.out.println(arrayList1);
        // /*Can also add at index directly */
        // arrayList1.add(1,-20);
        // /*This will shift the current element in 1th index to 2nd index */
        // System.out.println(arrayList1);
        // /*To remove.remove(index) */
        // arrayList1.remove(0);//will remove 0th index element and shift 1st to 0
        // System.out.println(arrayList1);
        // /*To update .set(index,value) */
        // arrayList1.set(0,-200);
        // System.out.println(arrayList1);
        // /*To access.get(index) */
        // System.out.println("0th index element" + arrayList1.get(0));

        /*Task
         * Make ArrayList of the following
         * ["apple",'Orangr','Banana','Water Melon','Pineapple']
         * Add 'Grapes' in 1 index
         * Change "Pineapple" to "Avacado"
         * Change "Apple" to "Cherry"
         * Note: Print on every add and remove to get the new index of ArrayList
         */

         ArrayList<String>fruits=new ArrayList<>();
         fruits.add("Apple");
         fruits.add("Orange");
         fruits.add("Banana");
         fruits.add("Water Melon");
         fruits.add("Pineapple");
         System.out.println(fruits);

         fruits.add(1,"Grapes");
         System.out.println(fruits);

         fruits.set(5,"Avacado");
         System.out.println(fruits);

         fruits.set(0,"Cherry");
         System.out.println(fruits);

         System.out.println("0th index element" + fruits.get(0));










    }
    
}
