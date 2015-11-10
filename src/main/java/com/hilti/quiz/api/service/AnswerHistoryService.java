package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.AnswerHistoryDAO;
import com.hilti.quiz.api.model.AnswerHistory;

@Component
public class AnswerHistoryService {
	@Autowired
	private AnswerHistoryDAO answerHistoryDao;
	
		//save or update service
		public void saveAnswerHistoryService(AnswerHistory answerHistory){
			answerHistoryDao.save(answerHistory);
		}
		
		public void saveManyAnswerHistorysService(ArrayList<AnswerHistory> listOfAnswerHistorys){
			answerHistoryDao.save(listOfAnswerHistorys);
		}
		
		public AnswerHistory findOneAnswerHistoryService(int id){
			return answerHistoryDao.findOne(id);
		}
		
		public ArrayList<AnswerHistory> findListOfAnswerHistory(Integer[] ids){
			return (ArrayList<AnswerHistory>) answerHistoryDao.findAll(Arrays.asList(ids));
		}
		
		public ArrayList<AnswerHistory> viewAllAnswerHistoryService(){
			return (ArrayList<AnswerHistory>) answerHistoryDao.findAll();
		}
		
		public void deleteAnswerHistoryByIdService(int id){
			answerHistoryDao.delete(id);
		}
		
		public void deleteAnswerHistoryService(AnswerHistory answerHistory){
			answerHistoryDao.delete(answerHistory);
		}
		
		public void deleteAnswerHistoryListService(ArrayList<AnswerHistory> listOfAnswerHistorys){
			answerHistoryDao.delete(listOfAnswerHistorys);
		}
		
		public void deleteAllAnswerHistoryService(){
			answerHistoryDao.deleteAll();
		}
}
