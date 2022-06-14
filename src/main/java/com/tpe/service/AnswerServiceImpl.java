package com.tpe.service;

import com.tpe.domain.Answer;
import com.tpe.repository.AnswerRepository;

public class AnswerServiceImpl implements AnswerService {

    private final static AnswerRepository answerRepo = new AnswerRepository();

    @Override
    public void saveAnswer(Answer answer) {
    answerRepo.saveAnswer(answer);
    }

    @Override
    public Answer getAnswer(Class<Answer> answerClass, Integer id) {
        return answerRepo.findAnswerById(id);
    }

    @Override
    public void removeAnswer(Answer answer) {
        answerRepo.removeAnswer(answer);
    }

    @Override
    public void updateAnswer(Answer answer) {
        answerRepo.updateAnswer(answer);
    }
}
