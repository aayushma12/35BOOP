public class Constructor {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println("After object");
    }
}
class ParamConstructor{
    private int data1;
    public int data2;
    void setData1(int data1){
        this.data1=data1;
    }
    ParamConstructor(int d1,int d2){
        data1=d1;
        data2=d2;
    }


}

class ConstructorExample{
    // Non parametarized constructor
    ConstructorExample() {
        System.out.println("I run in object creation");
    // Add more logic
    // Only called once, to set attributes value in most cases
    }
}
// Task
// Make a class Cat
// Make 2 private attribute name, age
// Make 2 public attribute breed, color
// Make a constructor to only set name and age
// Make getter for name and age
// Make a setter for age
// Make an Object of cat
// Fill the attributes
// Add +1 to the current age
// Print the Following using object
// Name: Ny
// Age: 4
// Breed: Xy
// Color: Orange

// Define the Cat class
class Cat {
    // Private attributes
    private String name;
    private int age;
    
    // Public attributes
    public String breed;
    public String color;
    
    // Constructor to set name and age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Create an object of the Cat class with name and age
        Cat myCat = new Cat("Ny", 3);
        
        // Set the public attributes
        myCat.breed = "Xy";
        myCat.color = "Orange";
        
        // Increment the age by 1
        myCat.setAge(myCat.getAge() + 1);
        
        // Print the attributes using the object
        System.out.println("Name: " + myCat.getName());
        System.out.println("Age: " + myCat.getAge());
        System.out.println("Breed: " + myCat.breed);
        System.out.println("Color: " + myCat.color);
    }
}





