package com.tpe.service;

import com.tpe.domain.Answer;

public interface AnswerService {


    void saveAnswer(Answer answer);
    Answer getAnswer(Class<Answer> answerClass, Integer id);
    void removeAnswer(Answer answer);
    void updateAnswer(Answer answer);

}
