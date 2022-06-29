package by.epam.java_intro.module4.aggregationAndComposition_task_1;

public class ViewText {

    public void printHeader(Word header) {
        System.out.println(header);
    }

    public void printText(Text someText) {

        /*for (int i = 0; i < someText.getSentences().size(); i++) {
            System.out.println(someText.getSentences().get(i));*/

        System.out.println(someText);
    }

}
