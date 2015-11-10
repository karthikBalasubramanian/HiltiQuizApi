package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.TopicDAO;
import com.hilti.quiz.api.model.Topic;
@Component
public class TopicService{
	
	@Autowired
	private TopicDAO topicDao;
	
	//save or update service
	public void saveTopicService(Topic topic){
		topicDao.save(topic);
	}
	
	public void saveManyTopicsService(ArrayList<Topic> listOfTopics){
		topicDao.save(listOfTopics);
	}
	
	public Topic findOneTopicService(int id){
		return topicDao.findOne(id);
	}
	
	public ArrayList<Topic> findListOfTopic(Integer[] ids){
		return (ArrayList<Topic>) topicDao.findAll(Arrays.asList(ids));
	}
	
	public ArrayList<Topic> viewAllTopicService(){
		return (ArrayList<Topic>) topicDao.findAll();
	}
	
	public void deleteTopicByIdService(int id){
		topicDao.delete(id);
	}
	
	public void deleteTopicService(Topic topic){
		topicDao.delete(topic);
	}
	
	public void deleteTopicListService(ArrayList<Topic> listOfTopics){
		topicDao.delete(listOfTopics);
	}
	
	public void deleteAllTopicService(){
		topicDao.deleteAll();
	}
	
	
	
}
