package com.hilti.quiz.api.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Question;
import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.service.QuestionService;
import com.hilti.quiz.api.utility.ImageToByteArray;
@RestController
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	@Autowired
	private ImageToByteArray imageToByte;
	
	
	@RequestMapping("/question/viewAllQuestions")
	public @ResponseBody Iterable<Question> viewAllquestion(){
				return questionService.viewAllQuestionService();
	}
	
	
	//to check if byte[] gets loaded. the method parameters will change.
	@RequestMapping("/question/createQuestion")
	public @ResponseBody Success onCreate(String questionType,String questionText,int difficulty,String status){
		
		Question question = null; 
		byte[] option1 = null;
		byte[] option2 = null;
		byte[] option3 = null;
		byte[] option4 = null;
		byte[] answer = null;
		
		try{
			if(questionType.equalsIgnoreCase("image")){
			option1 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\artisty-devushki-lyudi-muzyka-33759.jpg"));
			option2 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\bukety-cvety-rasteniya-33769.jpg"));
			option3 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\cvety-rasteniya-33744.jpg"));
			option4 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\doma-pejzazh-33770.jpg"));
			answer = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\bukety-cvety-rasteniya-33769.jpg"));
			
			}
			else if (questionType.equalsIgnoreCase("text")) {
				option1 = imageToByte.stringToBytes(new String("option 1"));
				option2 = imageToByte.stringToBytes(new String("option 2"));
				option3 = imageToByte.stringToBytes(new String("option 3"));
				option4 = imageToByte.stringToBytes(new String("option 4"));
				answer = imageToByte.stringToBytes(new String("option 1"));
				}
			else{
				return new Success("sorry Try Again");
			}
			question = new Question(questionType,questionText,difficulty,option1,option2,option3,option4,answer,status);
			questionService.saveQuestionService(question);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+Question.class.getName().substring(Question.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	
	@RequestMapping("/question/updateQuestion")
	public @ResponseBody Success onUpdate(int id,String questionType,String questionText,int difficulty,String status){
		
		Question question = null; 
		byte[] option1 = null;
		byte[] option2 = null;
		byte[] option3 = null;
		byte[] option4 = null;
		byte[] answer = null;
		
		try{
			
			option1 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\artisty-devushki-lyudi-muzyka-33759.jpg"));
			option2 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\bukety-cvety-rasteniya-33769.jpg"));
			option3 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\cvety-rasteniya-33744.jpg"));
			option4 = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\doma-pejzazh-33770.jpg"));
			answer = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\bukety-cvety-rasteniya-33769.jpg"));
			question = new Question(id,questionType,questionText,difficulty,option1,option2,option3,option4,answer,status);
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
}
