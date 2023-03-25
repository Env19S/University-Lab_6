package org.example.var1;

import java.util.Scanner;

public class ScholarshipCalculatorTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение A (баллы за мероприятие на факультетском уровне):");
        int A = scanner.nextInt();

        System.out.println("Введите значение B (баллы за мероприятие на вузовском уровне):");
        int B = scanner.nextInt();

        System.out.println("Введите значение N (минимальное количество баллов для получения стипендии):");
        int N = scanner.nextInt();

        int semesterMonths = 6;
        int facultyEvents = semesterMonths;
        int universityEvents = semesterMonths / 2;

        int semesterPoints = A * facultyEvents + B * universityEvents;

        if (semesterPoints >= N) {
            System.out.println("Студент сможет накопить достаточно баллов за 1 семестр.");
        } else {
            int yearMonths = 12;
            int yearFacultyEvents = yearMonths;
            int yearUniversityEvents = yearMonths / 2;

            int yearPoints = A * yearFacultyEvents + B * yearUniversityEvents;

            System.out.println("Студент не сможет накопить достаточно баллов за 1 семестр.");
            System.out.println("Количество баллов, которые студент накопит за год: " + yearPoints);
        }
    }
}