package by.epam.java_intro.module4.task_5;

public class Counter {

    private int counter;
    private int min;
    private int max;

    public Counter() {
        super();
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter(int counter, int min, int max) {

        if (min > max) {
            int temp = max;
            max = min;
            min = temp;
        }
        if (counter < min || counter > max) {
            counter = min;
        }
        this.counter = counter;
        this.min = min;
        this.max = max;

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((counter == 0) ? 0 : Integer.valueOf(counter).hashCode());
        result = prime * result + ((min == 0) ? 0 : Integer.valueOf(min).hashCode());
        result = prime * result + ((max == 0) ? 0 : Integer.valueOf(max).hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "Counter value : " + counter + "\n" + "Min value : " + min + "\n" + "Max value : " + max;
    }

    @Override
    public boolean equals(Object sumObj) {
        if (this == sumObj) {
            return true;
        }
        if (sumObj == null) {
            return false;
        }
        if (sumObj.getClass() != this.getClass()) {
            return false;
        }
        Counter other = (Counter) sumObj;

        return this.counter == other.counter && this.min == other.min && this.max == other.max;

    }


    //Метод отвечает за увеличения counter на единицу.
    public void addOne() {

        if (counter >= max) {
            counter = max;
        }

        counter = counter + 1;

    }


    //Метод отвечает за уменьшение counter на единицу.
    public void subtractOne() {


        if (counter <= min) {
            counter = min;
        }

        counter = counter - 1;
    }
}
