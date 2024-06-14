public class Inheritance {
    public static void main (String[] args){
        ChildClass cc=new ChildClass();
        cc.firstname="XYZ";
        cc.lastname="ANC";
        cc.expenses=100.11;
        cc.salary=10000;
        cc.info();
        cc.details();

    }
    
  }
}
class ParentClass{
    public String lastname;
    private int salary;
    protected double expenses;
    void info(){
        System.out.println("Parent Function" + lastname);
    }
}
//To use inheritance use the keyword "extends"
//single level ingeritance, one parent/super=one child/sub
class ChildClass extends ParentClass{
    String firstname;
    void details(){
        System.out.println(firstname+" "+lastname);
    }
}
