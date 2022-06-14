package com.tpe.main;

import com.tpe.domain.Answer;
import com.tpe.domain.Question;
import com.tpe.service.AnswerService;
import com.tpe.service.AnswerServiceImpl;
import com.tpe.service.QuestionService;
import com.tpe.service.QuestionServiceImpl;
import com.tpe.util.HibernateUtil;

public class Client {

    public static void main(String[] args) {
        QuestionService questionService=new QuestionServiceImpl();
        AnswerService answerService = new AnswerServiceImpl();


        Question question1 =new Question();
        Question question2 =new Question();
        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        Answer answer3 = new Answer();
        Answer answer4 = new Answer();



        question1.setTitle("Is Java hard ?");
        question2.setTitle("How is Hibernate going ?");

        answer1.setDescription("No I love Java and it is ver easy");
        answer1.setQuestion(question1);

        answer2.setDescription("yes and I hate Java");
        answer2.setQuestion(question1);

        answer3.setDescription("I am not sure");
        answer3.setQuestion(question2);

        answer4.setDescription("If Mr.Bekir teaches Hibernate you will definitely not forget :)");
        answer4.setQuestion(question2);


/*
        questionService.saveQuestion(question1);
        questionService.saveQuestion(question2);

        answerService.saveAnswer(answer1);
        answerService.saveAnswer(answer2);
        answerService.saveAnswer(answer3);
        answerService.saveAnswer(answer4);

 */



        System.out.println(questionService.getQuestion(Question.class, 2));

            Question updQ= questionService.getQuestion(Question.class,2);
            updQ.setTitle("Chemistry");
            questionService.updateQuestion(updQ);

            Answer updAns= answerService.getAnswer(Answer.class,1);
            updAns.setTitle("This is Your Title");
            answerService.updateAnswer(updAns);

        Answer removeAnswer= answerService.getAnswer(Answer.class,2);
        answerService.removeAnswer(removeAnswer);







        HibernateUtil.getSessionFactory().close();
    }

}
