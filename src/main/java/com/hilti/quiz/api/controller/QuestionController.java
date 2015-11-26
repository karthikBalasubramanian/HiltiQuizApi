package com.hilti.quiz.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Question;
import com.hilti.quiz.api.model.Success;

import com.hilti.quiz.api.service.QuestionService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionController {

	@Autowired
	QuestionService questionService;
	

	
	
	@RequestMapping("/question/viewAllQuestions")
	public @ResponseBody Iterable<Question> viewAllquestion(){
				return questionService.viewAllQuestionService();
	}
	
	
	//to check if byte[] gets loaded. the method parameters will change.
	@RequestMapping("/question/createQuestion")
	public @ResponseBody Success onCreate(String questionType,String questionText,int difficulty,String option1,String option2, String option3, String option4,String answer,String status){
		
		Question question = null; 
		

		
		try{
			if(questionType.equalsIgnoreCase("image")|questionType.equalsIgnoreCase("text")){
				question = new Question(questionType,questionText,difficulty,option1,option2,option3,option4,answer,status);
			}
			
			
			else{
				return new Success("sorry Try Again");
			}
			questionService.saveQuestionService(question);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Question.class.getName().substring(Question.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	

	
	
	@RequestMapping("/question/viewQuestionById")
	public @ResponseBody Iterable<Question> viewQuestionById(Integer[] questionIdList){
		return questionService.findListOfQuestion(questionIdList);
	}
	
	
	@RequestMapping("/question/deleteQuestionById")
	public @ResponseBody Success onDelete(int questionid){
		
		try{
			questionService.deleteQuestionByIdService(questionid);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Question.class.getName().substring(Question.class.getName().lastIndexOf(".")+1)+" record deleted");
		
	}
	@RequestMapping("/question/findQuestionByTopic")
	public @ResponseBody List <Question> findQuestionByTopic(String [] topicName,int[]  difficulty, Integer empid, String qno){
		List<Question> questionList = new ArrayList<Question>();
		try {
			questionList=  questionService.findQuestionByTopic(topicName,difficulty,empid,qno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			questionList=questionService.findAllQuestionByTopic(topicName, difficulty,empid);
			
		}
		return questionList;
	}
	
}
