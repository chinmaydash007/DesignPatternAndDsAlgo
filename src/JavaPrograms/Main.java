package JavaPrograms;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(23);
        student.name = "NinjaCoder";
        // 0student.print();
        Student student1=new Student(67);
        student1.name="sdadad";
        student.print();
        student1.print();

    }
}

class Student {
    static String name;
    int rollno;

    Student(int n) {
        rollno = n;
    }

    void print() {
        System.out.println(rollno + " " + name);
    }
}