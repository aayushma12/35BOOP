
public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc=new ChildClass();
        cc.firstname = "XYZ";
        cc.lastname = "ANC";
        cc.expenses = 100.11;
        //cc.salary = 10000;//
        cc.info();
        cc.detail();
        
    }
}
class ParentClass{
    public String lastname;
    //private int salary;//
    protected double expenses;
    void info(){
        System.out.println("Parent Function" + lastname);
    }
}
// To use inheritance use the keyword "extends"
// single level inheritance, one parent/super -one child/sub
class ChildClass extends ParentClass{
    String firstname;
    void detail(){
        System.out.println(firstname + " " + lastname);
    }
}
// multilevel inheritance, nested class, child class has another child class
class GrandChildClass extends ChildClass{
    String middlename;
    void description(){
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}
// Tree/heirarical inheritance
class BrotherClass extends ParentClass{
    String address;
    void living (){
        System.out.println(lastname + " " + address);
    }

    class Animal{
        String name;
        void speaks(){
            System.out.println(name);
        }
    }
    
    class Mammal extends Animal{
        String breed;
        void fur(){
            System.out.println(breed + " " + name);
        }
    }
    
    class reptile extends Animal{
        String eggs;
        void sheds(){
            System.out.println(eggs + " " + name);
        }
    }
    
    class cat extends Mammal{
        String origin;
        void meows(){
            System.out.println(name + " " + breed + " " + origin);
        }
    }
    
    class Dog extends Mammal{
        String country;
        void barko(){
            System.out.println(name + " " + breed + " " + country);
        }
    }
    
    class Labrador extends Dog{
        String color;
        void play(){
            System.out.println(country + " " + color);
        }
    }
    
    class GermanShepard extends Dog{
        String spot;
        void guard(){
            System.out.println(country + " " + spot);
        }
    }
}
