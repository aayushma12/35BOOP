public class AbstractClass {
    public static void main(String[] args) {
        Samsung s1=new Samsung();
        s1.sms();
        s1.call("980123123");
        Apple a1=new Apple();
        a1.sms();
        a1.call("9801023123");
        
    }
}
//To make abstract class keyword "abstract" before"class"
//If you make abstract class ,cannot make object of it
abstract class Smartphone{
    //abstract class may or may not contain abstract functions
    //ti make abstract function use"abstract" before making function
    //abstract class do not have a body
    abstract void sms();
    abstract public boolean call(String number);
    //abstract class can have a normal functions
    void imei(){
        System.out.println("Iemi number");
    }
}
//Abstract class can only be used in sub/child class
class Samsung extends Smartphone{
    //When extending abstract class we have to implement/override
    //all the abstract fubction of abstract class
    @Override
    void sms(){
        System.out.println("Samsung way of sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("Samsung calling to" + number);
        return true;
    }
}
//Makr a class Apple extending Smartphone
//MAke a object of Samsung and Apple,
//Call sms() and call() function of them

class Apple extends Smartphone{
    @Override
    void sms(){
        System.out.println("Apple way of sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("Apple calling to" + number);
        return true;

    }
}
/*
 * You are building a shape hierarchy for a drawing application,
 * Design an abstract class named "Shape" with the following abstract methods:
 * 
 * calculatePerimeter():
 * This method should calculate and return the perimeter of the shape.
 * 
 * Implement the abstract methods.Create subclasses for different shapes such as "Cricle",
 * "Rectangle", and "Triangle".
 * Each subclass should provide specific implementations for calculating the area and perimeter of that shape.
 * Create instances of each shape class and demonstrate
 * how you can calculate their respective areas and perimeters.
 */
abstract class Shape{
    abstract double calculatePerimeter();
    abstract double calculateArea();
}
class Cricle extends Shape{
    private double radius;
    
    Cricle (double radius) {
        this.radius = radius;
    }
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    double calculateArea(){
        return Math.PI * radius *radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(double length,double width){
    this.length=length;
    this.width=width;
}
@Override
double calculatePerimeter(){
    return 2*(length + width);
}
@Override
double calculateArea(){
    return length*width;
  }
}
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
