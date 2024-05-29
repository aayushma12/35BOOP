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