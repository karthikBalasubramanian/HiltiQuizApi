package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.AnsweredCorrectDAO;
import com.hilti.quiz.api.model.AnsweredCorrect;
@Component
public class AnsweredCorrectService {

	@Autowired
	private AnsweredCorrectDAO answeredCorrectDao;
	
	//save or update service
	public void saveAnsweredCorrectService(AnsweredCorrect answeredCorrect){
		answeredCorrectDao.save(answeredCorrect);
	}
	
	public void saveManyAnsweredCorrectsService(ArrayList<AnsweredCorrect> listOfAnsweredCorrects){
		answeredCorrectDao.save(listOfAnsweredCorrects);
	}
	
	public AnsweredCorrect findOneAnsweredCorrectService(int id){
		return answeredCorrectDao.findOne(id);
	}
	
	public ArrayList<AnsweredCorrect> findListOfAnsweredCorrect(Integer[] ids){
		return (ArrayList<AnsweredCorrect>) answeredCorrectDao.findAll(Arrays.asList(ids));
	}
	
	public ArrayList<AnsweredCorrect> viewAllAnsweredCorrectService(){
		return (ArrayList<AnsweredCorrect>) answeredCorrectDao.findAll();
	}
	
	public void deleteAnsweredCorrectByIdService(int id){
		answeredCorrectDao.delete(id);
	}
	
	public void deleteAnsweredCorrectService(AnsweredCorrect AnsweredCorrect){
		answeredCorrectDao.delete(AnsweredCorrect);
	}
	
	public void deleteAnsweredCorrectListService(ArrayList<AnsweredCorrect> listOfAnsweredCorrects){
		answeredCorrectDao.delete(listOfAnsweredCorrects);
	}
	
	public void deleteAllAnsweredCorrectService(){
		answeredCorrectDao.deleteAll();
	}
}
