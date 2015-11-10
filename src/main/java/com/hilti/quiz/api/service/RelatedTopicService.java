package com.hilti.quiz.api.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hilti.quiz.api.dao.RelatedTopicDAO;
import com.hilti.quiz.api.model.RelatedTopic;

@Component
public class RelatedTopicService {
	@Autowired
	private RelatedTopicDAO relatedTopicDao;
	
	//save or update service
	public void saveRelatedTopicService(RelatedTopic RelatedTopic){
		relatedTopicDao.save(RelatedTopic);
	}
	
	public void saveManyRelatedTopicsService(ArrayList<RelatedTopic> listOfRelatedTopics){
		relatedTopicDao.save(listOfRelatedTopics);
	}
	
	public RelatedTopic findOneRelatedTopicService(int id){
		return relatedTopicDao.findOne(id);
	}
	
	public ArrayList<RelatedTopic> findListOfRelatedTopic(Integer[] ids){
		return (ArrayList<RelatedTopic>) relatedTopicDao.findAll(Arrays.asList(ids));
	}
	
	public ArrayList<RelatedTopic> viewAllRelatedTopicService(){
		return (ArrayList<RelatedTopic>) relatedTopicDao.findAll();
	}
	
	public void deleteRelatedTopicByIdService(int id){
		relatedTopicDao.delete(id);
	}
	
	public void deleteRelatedTopicService(RelatedTopic RelatedTopic){
		relatedTopicDao.delete(RelatedTopic);
	}
	
	public void deleteRelatedTopicListService(ArrayList<RelatedTopic> listOfRelatedTopics){
		relatedTopicDao.delete(listOfRelatedTopics);
	}
	
	public void deleteAllRelatedTopicService(){
		relatedTopicDao.deleteAll();
	}

}
