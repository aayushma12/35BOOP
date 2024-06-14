import javax.accessibility.Accessible;

public class AccessModifier {
    public static void main(String[] args) {
        AccessExample ae=new AccessExample();
        ae.name="Ram";
        ae.age=12;
        //ae.default =1000.21//
        ae.defaultfunction();
        ae.publicfunction();
        //ae.privatefunction();//
        ae.accessprivate();
        ae.setSalary(1002.22);
        System.out.println(ae.getSalary());

    }
}


class AccessExample{
    String name;//Automatically default,package/folder can access
    public int age;//can be accessed from anywhere
    private double salary ;//can only be accesed inside this class
    void setSalary(double s){
        salary =s;
    }
    double getSalary(){
        return salary;
    }

    //same concept in function
    void defaultfunction(){
        System.out.println("I can be accessed inside a package");
    }
    public void publicfunction(){
        System.out.println("I can be accessed from anywhere");
    }
    private void privatefunction(){
        System.out.println("I can be accessed inside class");
    }
    void accessprivate(){
        System.out.println(salary);
        privatefunction();
    }
    
}
//Task 
// Make a class Dog
// Make a private attribute name and age
// Make a public attribute breed
// Make setter for name and age
// Make getter for name and age
// Make an Object for dog
// Fill all attribute
// Print the following using object
// Name: XYZ
// Breed: ABC
// Age: 10 

// Define the Dog class
class Dog {
    // Private attributes
    private String name;
    private int age;
    
    // Public attribute
    public String breed;
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Setter for age
    public void setAge(int age) {
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

    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Set the attributes
        myDog.setName("XYZ");
        myDog.setAge(10);
        myDog.breed = "ABC";
        
        // Print the attributes using the object
        System.out.println("Name: " + myDog.getName());
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.getAge());
    }
}

