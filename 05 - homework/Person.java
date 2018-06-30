public class Person implements Comparable<Person> {

    private String name;
    private int birthday;

    public Person(String n, int bday) {
        name = n;
        birthday = bday;
    }


    public String getName() {
        return name;
    }


    public int getBirthday() {
        return birthday;
    }

    public String toString(){
        return name + ", Birthday: " + birthday;
    }

    public int compareTo(Person x) {
        return birthday - x.birthday;
    }

}