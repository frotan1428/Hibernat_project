package com.tpe.service;

import com.tpe.domain.Question;

public interface QuestionService {


     void saveQuestion(Question question);
     Question getQuestion(Class<Question> questionClass, Integer id);
     void removeQuestion(Question question);
     void updateQuestion(Question question);

}
