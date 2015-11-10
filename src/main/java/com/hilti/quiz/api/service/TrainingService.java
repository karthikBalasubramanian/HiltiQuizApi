package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.TrainingDAO;
import com.hilti.quiz.api.model.Training;
@Component
public class TrainingService {
	@Autowired
	private TrainingDAO trainingDao;
	
	//save or update service
	public void saveTrainingService(Training training){
		trainingDao.save(training);
	}
	
	public void saveManyTrainingsService(ArrayList<Training> listOfTrainings){
		trainingDao.save(listOfTrainings);
	}
	
	public Training findOneTrainingService(int id){
		return trainingDao.findOne(id);
	}
	
	public ArrayList<Training> findListOfTraining(Integer[] ids){
		return (ArrayList<Training>) trainingDao.findAll(Arrays.asList(ids));
	}
	
	public ArrayList<Training> viewAllTrainingService(){
		return (ArrayList<Training>) trainingDao.findAll();
	}
	
	public void deleteTrainingByIdService(int id){
		trainingDao.delete(id);
	}
	
	public void deleteTrainingService(Training training){
		trainingDao.delete(training);
	}
	
	public void deleteTrainingListService(ArrayList<Training> listOfTrainings){
		trainingDao.delete(listOfTrainings);
	}
	
	public void deleteAllTrainingService(){
		trainingDao.deleteAll();
	}

}
