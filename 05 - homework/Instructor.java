public class Instructor extends Person {

    private int salary;

    public Instructor (String n, int bday, int sal) {
        super(n, bday);
        salary = sal;
    }


    public int getSalary(){
        return salary;
    }

    public String toString() {

      return super.toString() + " Salary: " + salary;
    }

}