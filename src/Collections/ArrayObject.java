
package Collections;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class ArrayObject {
    public static void main(String[] args) {

        Student s1 = new Student("rajesh", 23);
        Student s2 = new Student("Nikilesh", 23);
        Student s3 = new Student("pooja", 25);
        Student s4 = new Student("mythili", 23);

        // storing objects into student array
        Student[] students = new Student[5];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        // retrive objects from array and access it's members
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]); // here internally calls toString() method
        }
    }
}
