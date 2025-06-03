public class Person {
    String name;
    String dob;
    
    Person(String name, String dob){
        this.name=name;
        this.dob=dob;
    }
    void Display(){
        System.out.println("Name:"+name);
        System.out.println("DOB"+dob);
    }
}
