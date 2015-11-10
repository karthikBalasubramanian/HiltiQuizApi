package com.hilti.quiz.api.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hilti.quiz.api.model.Success;
import com.hilti.quiz.api.model.AnswerHistory;
import com.hilti.quiz.api.service.AnswerHistoryService;
import com.hilti.quiz.api.utility.ImageToByteArray;

@RestController
public class AnswerHistoryController {
	@Autowired
	AnswerHistoryService answerHistoryService;
	
	@Autowired
	private ImageToByteArray imageToByte;
	
	@RequestMapping("/answerHistory/viewAllAnswerHistory")
	public @ResponseBody Iterable<AnswerHistory> viewAllAnswerHistory(){
				return answerHistoryService.viewAllAnswerHistoryService();
	}
	@RequestMapping("/answerHistory/createAnswerHistory")
	public @ResponseBody Success onCreate(int qid,int empid,String answerStatus,String timeStamp,int points){
		
		AnswerHistory answerHistory = null; 
		byte[] answer = null;
		try{
			answer = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\artisty-devushki-lyudi-muzyka-33759.jpg"));
			answerHistory = new AnswerHistory(qid,empid,answer,answerStatus,timeStamp,points);
			answerHistoryService.saveAnswerHistoryService(answerHistory);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+AnswerHistory.class.getName().substring(AnswerHistory.class.getName().lastIndexOf(".")+1)+" record created");
		
	}
	
	@RequestMapping("/answerHistory/updateAnswerHistory")
	public @ResponseBody Success onUpdate(int ahid,int qid,int empid,String answerStatus,String timeStamp,int points){
		
		AnswerHistory answerHistory = null; 
		byte[] answer = null;
		try{
			answer = imageToByte.imageToBytes(new File("C:\\Users\\vaishu\\Desktop\\diagram\\artisty-devushki-lyudi-muzyka-33759.jpg"));
			answerHistory = new AnswerHistory(ahid,qid,empid,answer,answerStatus,timeStamp,points);
			answerHistoryService.saveAnswerHistoryService(answerHistory);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+AnswerHistory.class.getName().substring(AnswerHistory.class.getName().lastIndexOf(".")+1)+" record updated");
		
	}
	@RequestMapping("/answerHistory/viewAnswerHistoryById")
	public @ResponseBody Iterable<AnswerHistory> viewAnswerHistoryById(Integer[] answerHistoryIdList){
		return answerHistoryService.findListOfAnswerHistory(answerHistoryIdList);
	}
	
	
	@RequestMapping("/answerHistory/deleteAnswerHistoryById")
	public @ResponseBody Success onDelete(int answerHistoryid){
		
		try{
			answerHistoryService.deleteAnswerHistoryByIdService(answerHistoryid);
		}catch (Exception ex) {
		      return new Success("sorry Try Again");
	    }
	    return new Success("yes "+AnswerHistory.class.getName().substring(AnswerHistory.class.getName().lastIndexOf(".")+1)+" record deleted");
		
	}
}
