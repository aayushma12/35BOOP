public class ForLoop {
    public static void main(String[] args) {
        /*For loop takes initallization
         * condition
         * modify/update  */
         for(int index = 0; index <=5; index++){
            System.out.println("For Index "+ index);
         }
         /*can use different update logic like
          * for (int index=0; ,index<=5; index+=3)
          */

          /*Using decrement */
          for (int index = 10; index>=0; index--){
                    System.out.println("For Index Decrement"+ index);
          }
          /*Make a multiplication table of 2*/
          for (int index = 2; index<=10; index ++){
            System.out.println("2 x " + index + " = "+ index * 2);
          }
          /*Nested for loop
           * Using for loop inside the scope of for loop*/
          for(int outer=0; outer < 2; outer ++){
            for (int inner = 3; inner > 0 ; inner --){
                System.out.println("Outer Index " + outer);
            }
            /*Make a multiplication table of 2*/
          for (int index = 1; index<=10; index ++){
            System.out.println("1 x " + index + " = "+ index * 1);
          }
          /*Make a multiplication table of 2 using nested loop*/
            for(int Outer=10; outer>=1; outer --){
          }
    }
    
    }
}

