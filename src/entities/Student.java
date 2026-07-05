package entities;

import Enums.TypeStudent;

public class Student {
    private String name;
    private TypeStudent typeStudent;
    private int age;
    private String numberCell;

    public Student(){}

    public Student(TypeStudent typeStudent, int age, String name, String numberCell) {
        this.typeStudent = typeStudent;
        this.age = age;
        this.name = name;
        this.numberCell = numberCell;
    }

    public TypeStudent getTypeStudent() {
        return typeStudent;
    }

    public int getAge() {
        return age;
    }

    public String getNumberCell() {
        return numberCell;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", typeStudent=" + typeStudent +
                ", age=" + age +
                ", numberCell='" + numberCell + '\'' +
                '}';
    }
}
