package streamlearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "m", 20);
        Student st2 = new Student("Dave", "m", 21);
        Student st3 = new Student("Betty", "f", 23);
        Student st4 = new Student("Mike", "m", 20);
        Student st5 = new Student("Swen", "m", 30);
        Student st6 = new Student("Mary", "f", 22);
        Student st7 = new Student("Dory", "f", 24);

        Faculty f1 = new Faculty("Economics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        Faculty f2 = new Faculty("Mathematics");
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);
        f2.addStudentToFaculty(st6);
        f2.addStudentToFaculty(st7);

        List<Faculty> facList = new ArrayList();
        facList.add(f1);
        facList.add(f2);
        System.out.println("===============================");
        System.out.println("===============================");
        List<String> collectNames = facList.stream().flatMap(f -> f.getStudentsOnFaculty().stream()).map(s -> s.getName() + " " + s.getAge()).collect(Collectors.toList());
        System.out.println("--------+++++++++---------");
        collectNames.forEach(System.out::println);
        System.out.println("--------+++++++++---------");
        facList.stream().flatMap(f -> f.getStudentsOnFaculty().stream())
                .forEach(a -> System.out.println(a.getName()));
        ;

    }
}

//==========================
class Faculty {
    private String name;
    private List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", studentsOnFaculty=" + studentsOnFaculty +
                '}';
    }
}

//==========================

class Student {
    private String name;
    private String sex;
    private int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
