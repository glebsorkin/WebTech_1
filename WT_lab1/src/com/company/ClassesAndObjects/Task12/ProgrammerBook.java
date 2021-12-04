package com.company.ClassesAndObjects.Task12;

import java.util.Objects;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    @Override
    public boolean equals(Object pb) {
        if (super.equals(pb)) {
            ProgrammerBook programmerBook = (ProgrammerBook) pb;
            return Objects.equals(this.language, programmerBook.language)
                    && this.level == programmerBook.level;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.language, this.level);
    }

    @Override
    public String toString() {
        return "Programmer" + super.toString()
                + " Language-'" + this.language
                + "', level-" + this.level + '.';
    }
}
