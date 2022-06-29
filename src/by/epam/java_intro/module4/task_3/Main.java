package by.epam.java_intro.module4.task_3;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {

    public static void main(String[] args) {


        Student s1 = new Student("IvanovII", "17F", new int[]{7, 2, 9, 4, 5});
        Student s2 = new Student("PetrovVP", "13F", new int[]{10, 10, 10, 10, 10});
        Student s3 = new Student("SidorovSI", "12G", new int[]{3, 10, 6, 8, 5});
        Student s4 = new Student("TatarenkoLV", "1C", new int[]{1, 7, 3, 9, 5});
        Student s5 = new Student("SobolHK", "12S", new int[]{9, 9, 9, 9, 9});
        Student s6 = new Student("PorovozRE", "12", new int[]{8, 7, 6, 5, 4});
        Student s7 = new Student("PlatonchikIR", "11", new int[]{10, 10, 10, 10, 10});
        Student s8 = new Student("PanteleyLK", "5G", new int[]{1, 2, 3, 4, 5});
        Student s9 = new Student("PonamorenkoJU", "4T", new int[]{4, 9, 6, 10, 5});
        Student s10 = new Student("MorozovPA", "1E", new int[]{9, 10, 9, 10, 9});
        Journal journal = new Journal(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);

        journal.printStudents();


    }

}
