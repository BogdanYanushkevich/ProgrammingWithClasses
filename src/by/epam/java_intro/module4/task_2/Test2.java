package by.epam.java_intro.module4.task_2;


public class Test2 {
    private int a;
    private int b;

    public Test2() {

    }

    public Test2(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String toString () {

        return "a = " + a + " ;" + "\n" + "b = " + b + " ;";

    }




    public static void main (String[] args){

        int a = 5;
        int b = 10;

        Test2 t = new Test2();
        Test2 tt = new Test2(a,b);


        System.out.println(t);
        System.out.println(tt);




    }
}
