import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        
    }
    
}
//Encapsulation enclose/bundles similar proprerties/attribute
//and function/methods inside a single class
class Laptop{
    String brand;
    String name;
    //2.Data hiding can be done using private modifier
    private double price;
    private int ram;
    private int storage;
    public int year;
    //3.Data attribute can have a better control using setter/getter
    //write only using setter
    public void setPrice(double price) {
        this.price=price;
        
    }
    //Read onlu using getter
    public double getPrice(){
        return this.price;
    }
    void branding(){
        System.out.println("Brand : " + brand);
    }

// Task 
    // Make a constructer of Laptop that takes brand and name
    // Make a setter and getter for remaining private attributes, ram, storage
    // Make a function upgrade() takes, 2 number for ram and storage \
    // and add them to the current value of ram and storage
    // Make a function inflation() takes 1 number price \
    // and add to the current value of price
    // Make 2 object, fill the attribute and call upgrade & inflation
    // Print the following
    // Output
    // Brand: Apple
    // Name: Apple Air M3
    // Price: 150000
    // Ram: 10GB
    // Storage: 256GB
    // Year: 2022

    Laptop(String brand, String name){
        this.brand=brand;
        this.name=name;

    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public void setStorage(int storage){
        this.storage=storage;
    }
    public int getRam(){
        return this.ram;
    }
    public int grtStorage(){
        return this.storage;
    }
    public void upgrade (int ram,int storage){
        this.ram=this.ram + ram;
        this.storage=this.storage += storage;
    }
    public void inflation(double price){
        this.price+=price;
    }

    //Task
    // You are building a banking application that has a BankAccount class. 
    // Implement the BankAccount class with encapsulation principles in mind. 
    // Include private instance variables for the
    // account number, account holder name, and account balance. 
    // Provide public methods to allow clients to deposit and withdraw funds, 
    // as well as access the account balance. 
    // Ensure that the account balance cannot be accessed or modified directly.
    // Ensure that user cannot withdraw balance if it can go to negative
    // Note make contructor to fill the attribute on account opening
    // Make getter for account number and account holder name 
}