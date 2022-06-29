package by.epam.java_intro.module4.aggregationAndComposition_task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    private final List<Word> words;


    {
        words = new ArrayList<>();
    }


    public List<Word> getWords() {
        return words;
    }

    public void addWords(Word word) {
        words.add(word);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence sentence)) return false;
        return getWords().equals(sentence.getWords());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWords());
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Word word : words) {
            result.append(word);
        }
        return result.toString();
    }
}
