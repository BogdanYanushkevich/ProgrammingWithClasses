package by.epam.java_intro.module4.aggregationAndComposition_task_1;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста. */

public class TextRunner {

    public static void main(String[] args) {


        Sentence sentence = new Sentence();
        Sentence sentence1 = new Sentence();
        Sentence sentence2 = new Sentence();
        Sentence sentence3 = new Sentence();

        ViewText viewText = new ViewText();
        Text text = new Text();


        text.setHeader(new Word("Fight"));
        sentence.addWords(new Word("\n"));
        sentence.addWords(new Word("Once"));
        sentence.addWords(new Word("more"));
        sentence.addWords(new Word("into"));
        sentence.addWords(new Word("the"));
        sentence.addWords(new Word("fray"));
        sentence.addWords(new Word("..."));
        sentence.addWords(new Word("\n"));
        sentence1.addWords(new Word("Into"));
        sentence1.addWords(new Word("the"));
        sentence1.addWords(new Word("last"));
        sentence1.addWords(new Word("good"));
        sentence1.addWords(new Word("fight"));
        sentence1.addWords(new Word("i'll"));
        sentence1.addWords(new Word("ever"));
        sentence1.addWords(new Word("know"));
        sentence1.addWords(new Word("."));
        sentence1.addWords(new Word("\n"));
        sentence2.addWords(new Word("Live"));
        sentence2.addWords(new Word("and"));
        sentence2.addWords(new Word("die"));
        sentence2.addWords(new Word("on"));
        sentence2.addWords(new Word("this"));
        sentence2.addWords(new Word("day"));
        sentence2.addWords(new Word("..."));
        sentence2.addWords(new Word("\n"));
        sentence3.addWords(new Word("Live"));
        sentence3.addWords(new Word("and"));
        sentence3.addWords(new Word("die"));
        sentence3.addWords(new Word("on"));
        sentence3.addWords(new Word("this"));
        sentence3.addWords(new Word("day"));
        sentence3.addWords(new Word("..."));

        text.addSentences(sentence);
        text.addSentences(sentence1);
        text.addSentences(sentence2);
        text.addSentences(sentence3);


        viewText.printHeader(text.getHeader());
        viewText.printText(text);

    }
}
