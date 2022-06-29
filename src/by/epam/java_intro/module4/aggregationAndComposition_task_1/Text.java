package by.epam.java_intro.module4.aggregationAndComposition_task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private Word header;

    List<Sentence> sentences;

    {
        sentences = new ArrayList<>();
    }

    public void setHeader(Word header) {
        this.header = header;
    }

    public List<Sentence> getSentences() {

        return sentences;
    }

    public Word getHeader() {
        return header;
    }

    public void addSentences(Sentence sentence) {
        sentences.add(sentence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text text)) return false;
        return header.equals(text.header) && getSentences().equals(text.getSentences());
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, getSentences());
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence value : sentences) {
            result.append(value);
        }
        return result.toString();
    }
}
