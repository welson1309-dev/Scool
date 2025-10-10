package RandomOpg;

public class Person {
    String name;

    Person(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }

    String tellMeYourName(){
        return name;
    }
}

class runner{
    public static void main(String[] args) {
        Person p1 = new Person("Mikkel");

        String myString = p1.toString();

        System.out.println(myString);
        System.out.println(p1.tellMeYourName());
        System.out.println(p1);


    }
}
