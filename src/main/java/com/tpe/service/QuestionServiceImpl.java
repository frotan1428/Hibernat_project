package com.tpe.service;

import com.tpe.domain.Question;
import com.tpe.repository.QuestionRepository;

public class QuestionServiceImpl implements QuestionService {

    private final static QuestionRepository repo=new QuestionRepository();

    @Override
    public void saveQuestion(Question question) {
        repo.saveQuestion(question);
    }

    @Override
    public Question getQuestion(Class<Question> questionClass, Integer id) {
        return  repo.findQuestionById(id);
    }

    @Override
    public void removeQuestion(Question question) {
        repo.removeQuestion(question);
    }

    @Override
    public void updateQuestion(Question question) {
        repo.updateQuestion(question);
    }
}
