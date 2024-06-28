
public class InheritanceConstructor {
        public static void main(String[] args) {
        Polo p1=new Polo();
        p1.differentColor("Yellow");
        Polo p2 =new Polo("Red");
        Polo p3=new Polo(10);
        
        //Call constructor with overloaded param 
    }
}
class Shirt{
    String color="Black";//super.color
    Shirt(){
        System.out.println("Makin shirt");
    }
    Shirt(String color){
        this.color=color;
    }
}
class Polo extends Shirt{
    String color="White";//this.color
    String texture;
    Polo(){
        //By default the constructor of parent is called
        // meaning super() or Shirt() on first line of execution
        super("White");
        System.out.println("Making Polo shirt");
    }
    //constructor Overloading
    //Same name function/Constructor with different logic/param
    Polo(String color){
         this.color =color;
         System.out.println("Constructor with one string");
    }
    Polo(String color,String texture){
        this.color =color;
        this.texture=texture;
        System.out.println("Constructor with two string");
    }
    Polo(int num){
        System.out.println(num);
        System.out.println("Constructor with one int");
    }
    //Note that constructor overload takes the difference in data type
    //not the variable Polo(String c) cannot be made
    void differentColor(String color){
        System.out.println("Param color"+ color);
        System.out.println("Class color"+ this.color);
        System.out.println("Parent color"+ super.color);
    }
}
//Task
//Make a class Pant\
//Add two attribute color and texture
//Make constructor or Pant that takes color and texture
//Make a class HalfPant that extends Pant
//Make a attribute color and add default String White
//Make a non param constructor of HalfPant and\
//call the Parameterized constructor of parent Pant with "black"and"Woll"
//Make a function design() in HalfPant that takes String Color\
//change the parent color to current color of halfPant
//change the current color of half pant to provided parameter

class Pant{
    String color="White";
    String texture;
    Pant(String color,String texture){
        this.color =color;
        this.texture=texture;
        System.out.println("Constructor with two string");
}
class HalfPant extends Pant{
    String color="White";
    HalfPant(){
        super("Black","Wool");
    }
    void design(String color){
        super.color=this.color;
        this.color=color;
    }

 }
}