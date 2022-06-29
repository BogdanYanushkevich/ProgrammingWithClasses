package by.epam.java_intro.module4.aggregationAndComposition_task_1;

import java.util.Objects;

public class Word {

    private final String word;

    public Word(String word) {

        this.word = word;

    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word word1)) return false;
        return getWord().equals(word1.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord());
    }

    @Override
    public String toString() {
        return word + " ";
    }
}
