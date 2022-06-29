package by.epam.java_intro.module4.task_3;

import java.util.Arrays;

public class Journal {

    private final Student[] students = new Student[10];

    public Journal(Student... students) {
        System.arraycopy(students, 0, this.students, 0, students.length);
    }

    //Метод выводит фамилии и номера групп студентов у которых баллы от 9 и выше.

    public void printStudents() {

        for (Student student : students) {


            if (checkPerfomance(student.getAcademicPerformance()))
                System.out.println(student.getSecondNameAndInitials() + " " + "\t" + student.getGroupNumber());

        }
    }


    //Метод проверяет значения на подходящие условию оценка равная или выше 9.

    public boolean checkPerfomance(int[] perfomace) {

        boolean isFine = true;

        for (int j : perfomace) {
            if (j < 9) {
                isFine = false;
                break;
            }


        }
        return isFine;
    }


    @Override
    public String toString() {
        return Arrays.toString(students);
    }
}