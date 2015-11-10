package com.hilti.quiz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.model.AnsweredCorrect;
import com.hilti.quiz.api.service.AnsweredCorrectService;

@RestController
public class AnsweredCorrectController {
	
	@Autowired
	private AnsweredCorrectService answeredCorrectService;
	
	@RequestMapping("/answeredCorrect/viewAllAnsweredCorrects")
	public @ResponseBody Iterable<AnsweredCorrect> viewAllAnsweredCorrect(){
				return answeredCorrectService.viewAllAnsweredCorrectService();
	}

	@RequestMapping("/answeredCorrect/createAnsweredCorrect")
	public @ResponseBody Success onCreate(int questionId,int empId ){
		AnsweredCorrect answeredCorrect = null;
		try{
			answeredCorrect = new AnsweredCorrect(questionId,empId);
			answeredCorrectService.saveAnsweredCorrectService(answeredCorrect);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+AnsweredCorrect.class.getName().substring(AnsweredCorrect.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	
	@RequestMapping("/answeredCorrect/updateAnsweredCorrect")
	public @ResponseBody Success onUpdate(int id,int questionId,int empId ){
		AnsweredCorrect answeredCorrect = null;
		try{
			answeredCorrect = new AnsweredCorrect(id,questionId,empId);
			answeredCorrectService.saveAnsweredCorrectService(answeredCorrect);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+AnsweredCorrect.class.getName().substring(AnsweredCorrect.class.getName().lastIndexOf(".")+1)+" record updated");
		
	}
	
	@RequestMapping("/answeredCorrect/viewAnsweredCorrectById")
	public @ResponseBody Iterable<AnsweredCorrect> viewQuestionById(Integer[] answeredCorrectIdList){
		return answeredCorrectService.findListOfAnsweredCorrect(answeredCorrectIdList);
	}
	
	@RequestMapping("/answeredCorrect/deleteAnsweredCorrectById")
	public @ResponseBody Success onDelete(int id){
		try{
			answeredCorrectService.deleteAnsweredCorrectByIdService(id);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+AnsweredCorrect.class.getName().substring(AnsweredCorrect.class.getName().lastIndexOf(".")+1)+" record deleted");
		
	}

}
