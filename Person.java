
/**
 * The person class is an abstract class to generalize common
 * attributes between user class and player class
 *
 */
public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }


    public String get_name(){
        return name;
    }

    public void set_name(String name){
        this.name = name;
    }
}
