package by.epam.java_intro.module4.task_5;

/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса*/

public class Main {

    public static void main(String[] args){

        Counter counter = new Counter();
        Counter counterSec = new Counter(8, 0, 20);

        System.out.println(counter);
        System.out.println(counterSec);

        System.out.println(counter.hashCode());
        System.out.println(counterSec.hashCode());


        counterSec.subtractOne();

        System.out.println(counterSec);

        counterSec.addOne();

        System.out.println(counterSec);
    }
}
