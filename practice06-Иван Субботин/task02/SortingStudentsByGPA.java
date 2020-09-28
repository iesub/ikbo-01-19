package ru.mirea.practice06.task02;

import ru.mirea.practice06.task01.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGrade() > o2.getGrade()) ? -1 : ((o1.getGrade() == o2.getGrade()) ? 0 : 1);
    }
}
