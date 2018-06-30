public class Student extends Person {

    private String major;

    public Student(String name, int bday, String maj) {
        super(name, bday);
        major = maj;
    }

    public String getMajor() {
        return major;
    }

    public String toString() {
       return super.toString() + " Major: " + major;
    }

}