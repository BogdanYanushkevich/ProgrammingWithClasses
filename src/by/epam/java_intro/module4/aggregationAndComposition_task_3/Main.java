package by.epam.java_intro.module4.aggregationAndComposition_task_3;



public class Main {
    public static void main(String[] args) {

        State belarus = new State("Republic of Belarus", DataBase.allRegions);
        belarus.viewCapital();
        belarus.viewNumOfDistricts();
        belarus.viewStateSquare();
        belarus.viewRegionsCenter();
    }
}
