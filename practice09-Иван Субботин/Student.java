package ru.mirea.practice09;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) throws EmptyStringException {
        if(name == "" | name == " ") throw new EmptyStringException("Введена пустая строка");
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
