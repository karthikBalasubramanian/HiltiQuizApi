package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.QuestionDAO;
import com.hilti.quiz.api.model.Question;

@Component
public class QuestionService {
	@Autowired
	private QuestionDAO questionDao;
	
		//save or update service
		public void saveQuestionService(Question Question){
			questionDao.save(Question);
		}
		
		public void saveManyQuestionsService(ArrayList<Question> listOfQuestions){
			questionDao.save(listOfQuestions);
		}
		
		public Question findOneQuestionService(int id){
			return questionDao.findOne(id);
		}
		
		public ArrayList<Question> findListOfQuestion(Integer[] ids){
			return (ArrayList<Question>) questionDao.findAll(Arrays.asList(ids));
		}
		
		public ArrayList<Question> viewAllQuestionService(){
			return (ArrayList<Question>) questionDao.findAll();
		}
		
		public void deleteQuestionByIdService(int id){
			questionDao.delete(id);
		}
		
		public void deleteQuestionService(Question Question){
			questionDao.delete(Question);
		}
		
		public void deleteQuestionListService(ArrayList<Question> listOfQuestions){
			questionDao.delete(listOfQuestions);
		}
		
		public void deleteAllQuestionService(){
			questionDao.deleteAll();
		}
		
		
	

}
