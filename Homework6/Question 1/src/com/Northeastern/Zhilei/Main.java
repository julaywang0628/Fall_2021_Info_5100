package com.Northeastern.Zhilei;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student Julay = new Student(1, "Julay", 4.0, new Date(1998,6,1));
        Student Amy = new Student(2, "Amy", 3.0, new Date(1997,2,28));
        Student Bob = new Student(3, "Bob", 3.6, new Date(1995,7,22));
        Student Cindy = new Student(4, "Cindy", 3.5, new Date(1999,5,23));
        Student Danniel = new Student(5, "Danniely", 3.7, new Date(1998,5,20));

        List<Student> list = new ArrayList<>();
        list.add(Julay);
        list.add(Amy);
        list.add(Bob);
        list.add(Cindy);
        list.add(Danniel);

        System.out.println("Sort by ascending order of 'name': ");
        Collections.sort(list, NameComparator);

        for(Student student : list) {
            System.out.println(student.toString());
        }
        System.out.println("------------");

        System.out.println("Sort by ascending order of 'GPA': ");
        Collections.sort(list, GpaComparator);
        for(Student student : list) {
            System.out.println(student.toString());
        }
        System.out.println("------------");

        System.out.println("Sort by ascending order of 'dateOfBirth': ");
        Collections.sort(list, DateOfBirthComparator);
        for(Student student : list) {
            System.out.println(student.toString());
        }
        System.out.println("------------");
    }

    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Student> GpaComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return (int) ((o1.getGpa()-o2.getGpa()) * 10);
        }
    };

    public static Comparator<Student> DateOfBirthComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
        }
    };

}
