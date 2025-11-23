package com.nskhoa.designpattern.BEHAVIORAL.iterator.example33;

public class Survey {
    private final Question[] questions = new Question[10];
    private int count = 0;

    void addQuestion(Question q) {
        if (count < questions.length) {
            questions[count++] = q;
        }
    }

    MyIterator<Question> createIterator() {
        return new SurveyIterator();
    }

    private class SurveyIterator implements MyIterator<Question> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Question next() {
            return questions[index++];
        }
    }
}
