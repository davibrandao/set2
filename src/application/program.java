package application;

import entities.Classmates;
import entities.Instructors;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Classmates> set = new HashSet<>();


        System.out.println("How many students for course A?");
        int students = sc.nextInt();
        for (int i = 0; i < students; i++) {
            int number = sc.nextInt();
            Classmates classmates = new Classmates(number);
            set.add(classmates);

        }

        System.out.println("How many students for course B?");
        int students2 = sc.nextInt();
        for (int i = 0; i < students2; i++) {
            int number = sc.nextInt();
            Classmates classmates = new Classmates(number);
            set.add(classmates);
        }

        System.out.println("How many students for course C?");
        int students3 = sc.nextInt();
        for (int i = 0; i < students3; i++) {
            int number = sc.nextInt();
            Classmates classmates = new Classmates(number);
            set.add(classmates);
        }
        Instructors instructors = new Instructors(set);
        System.out.println("Total students: " + set.size());

    }
}
