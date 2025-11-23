package com.nskhoa.designpattern.BEHAVIORAL.iterator.example33;

public class SurveyIteratorDemo {
    public static void main(String[] args) {
        Survey survey = new Survey();
        survey.addQuestion(new Question("How satisfied are you?"));
        survey.addQuestion(new Question("Would you recommend us?"));

        MyIterator<Question> it = survey.createIterator();
        while (it.hasNext()) {
            Question q = it.next();
            System.out.println(q.getText());
        }
    }
}

