import java.util.Arrays;

/**
 * Created by illladell on 5/16/16.
 */
public class Person implements Comparable<Person> {
    static final int famiylSize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[famiylSize];
    Email email;

    public Person() {
    }

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Person(Integer integer, String column, String column1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
       // if (isValidName(newName)){
            //this.name = name;
          name = newName;
       // }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

   /* public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean newIsAlive) {
        isAlive = newIsAlive;
    }*/

    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                ", email=" + email +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Person otherPerson = (Person) o;
        return this.name.compareTo(otherPerson.name);
    }
}


