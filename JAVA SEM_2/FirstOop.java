public class FirstOop {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.name ="Ram";
        p1.age=12;
        p1.gender='M';
        System.out.println(p1.name);
        p1.introduction();
        Person p2 = new Person();
        p2.name="Aayushma";
        p2.age=18;
        p2.gender='F';
        p2.introduction();
        System.out.println(p2.name);
        Square s1=new Square();
        s1.sides=10;
        int s1Area = s1.area();
        System.out.println(s1Area);
        s1.addSides(2);
        System.out.println(s1.area());

    }
}
//task
//make a class Rectangle
//make 2 attributes in double.length and breadth
//make a function areaofRectangle that returns length * breadth
//make a function perimeterofRectangle that returns 2(length+breadth)
//make an object of rectangle and print area and perimeter

class Square{
    int sides;
    int area(){
        int area = sides * sides;
        return area;
    }
    void addSides (int val){
        sides = sides+val;//sides will retain state/data
    }
}

class Person{
    //data/fields/attributes/properties
    String name;
    int age;
    char gender;

    //procwdures/functions/methods
    void introduction(){
        System.out.println("Hi my name is " + name);
    }
}
class Rectangle{
    double length;
    double breadth;
    double area(){
        return length * breadth;
    }
    double perimeter(){
        return 2 *(length + breadth);
    }
}
// Make attributes: name, brand, year, color
    // Make a function modify() that takes new color and set to old color
    // Make a function expriy() that returns 100 added to year
    // Make a function start() that prints(name is starting)
    // Make a function stop() that print(name, brand is stopping)
    // Make a function detail()that print(name, brand, color and year)
    // Make 3 Object of Car
    // Start all 3 Object
    // Stop only 1st object
    // Modify 2nd car to Green Color
    // Print the expiry of 3rd Object
    // Print detail of all 3 Object
class Car{
    String name,brand,colour;
    int year;
    void modify(String newColour){
        colour =newColour;
    }
    int expiry(){
        return 100 +year;
    
    }
    void start(){
        System.out.println(name+"is stsrting");
    }
    void stop(){
        System.out.println(name +","+ brand + " is stopping");

    }
    void detail(){
        System.out.println(name+"," + brand +","+ colour+ " and "+year);
    }

}