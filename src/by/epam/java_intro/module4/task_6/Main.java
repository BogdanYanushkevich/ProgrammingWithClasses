package by.epam.java_intro.module4.task_6;

/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class Main {

    public static void main(String[] args) {
        Watch time = new Watch(10, 15, 23);

        System.out.println(time);

        time.setHours(13);
        time.setMinutes(61);
        time.setSeconds(19);

        System.out.println(time);

        time.addHours(3);
        time.addMinutes(15);
        time.decreaseSeconds(20);

        System.out.println(time);

    }
}