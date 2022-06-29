package by.epam.java_intro.module4.task_1;

public class Test1 {

    private int a;
    private int b;


    public void setA(int a){
        this.a = a;
    }


    public void setB(int b){
        this.b = b;
    }

    public String toString (){

        return "a = " + a + " ;" + "\n" + "b = " + b + " ;";
    }

    public int sum (int a, int b){

        return a + b;
    }

    public int maxValue (int a, int b){

        return Math.max(a,b);
    }



    public static void main (String[] args){

        int a = 5;
        int b = 10;

        Test1 t = new Test1();

        t.setA(a);
        t.setB(b);

        System.out.println(t);
        System.out.println("sum = " + t.sum(a,b));
        System.out.println("max value = " + t.maxValue(a, b));

    }

}
