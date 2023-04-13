package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;
    private Question question;

    @Test
    void testJpa() {
        for (int i = 2; i <= 3; i++) {
        	question = this.questionService.getQuestion(i);
        	System.out.println(question.getContent());
            this.questionService.delete(question);
        }
    }
}