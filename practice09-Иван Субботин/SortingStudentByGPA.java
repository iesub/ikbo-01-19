package ru.mirea.practice09;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGrade() > o2.getGrade()) ? -1 : ((o1.getGrade() == o2.getGrade()) ? 0 : 1);
    }
}
